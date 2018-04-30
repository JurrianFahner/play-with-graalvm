FROM ensignprojects/graalvm as builder
ADD . /workbench
RUN cd /workbench && \
    mvn clean package && \
    cd target && \
    mv hello-world-1.0-SNAPSHOT-jar-with-dependencies.jar server.jar && \
    native-image -H:+ReportUnsupportedElementsAtRuntime \
                 -H:EnableURLProtocols=http \
                 -jar server.jar

FROM scratch
COPY --from=builder /workbench/target/server /app/server
COPY --from=builder /lib64 /lib64
COPY --from=builder /lib /lib
COPY --from=builder /bin/sh /bin/sh
EXPOSE 4567
CMD /app/server

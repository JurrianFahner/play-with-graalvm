package nl.ensignprojects;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static nl.ensignprojects.HelloWorldHelper.homepage;
import static spark.Spark.get;

@Slf4j
public class HelloWorld {

    public static void main(String[] args) {
        get("/", (req, resp) -> homepage());
        get("/hello", (req, res) -> "Hello World");
        get("/json", (req, response) -> {
            response.status(200);
            response.type("application/json");

            log.info("another request hit on /json");

            // Gson and jackson doesn't work right now with graalvm.
            return IntStream.range(0, 100)
                    .mapToObj(i -> new SomeEntry(UUID.randomUUID().toString(), Instant.now().toString()))
                    .map(e -> "{\"key\":\""+ e.getKey() + "\",\"value\":\"" + e.getValue() + "\"}")
                    .collect(Collectors.joining(",", "[", "]"));

        });

    }
}

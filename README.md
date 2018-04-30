# play-with-graalvm
My first experiment with graalvm

You only need docker to build and run this project.

```bash
# Build the project, it will build ultimately an image of 116MB (an ubuntu base image is 99.2MB)
docker build -t spark .

# Run the project:
docker run -it -p 8084:4567 spark 
```

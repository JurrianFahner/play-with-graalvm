# play-with-graalvm
My first experiment with graalvm

You only need docker to build and run this project.

```bash
# Build the project, it will build ultimately an image of 116MB (an ubuntu base image is 99.2MB)
# When the base image is scratch and we copy the right files from ubuntu we can slim the image to 30.2MB
# The binary itself is around  17M
docker build -t spark .

# Run the project:
docker run -it -p 8084:4567 spark 
```
You can visit the page in your browser on [http://localhost:8084](http://localhost:8084).
On this page you can access the two endpoints which are availablle.


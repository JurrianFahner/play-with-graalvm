package nl.ensignprojects;

public class HelloWorldHelper {

    public static String homepage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Hello-world project</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Spark framework with graalvm</h1>\n" +
                "<p>\n" +
                "    Since it is currently (29 april 2018) impossible to create\n" +
                "a native image with graalvm for spring\n" +
                "</p>\n" +
                "<p>\n" +
                "    But graalvm is able to create a native image for spark framework.\n" +
                "This project is a demonstration how this could be working.\n" +
                "</p>\n" +
                "<p>\n" +
                "    To access an endpoint serving a string go to <a href=\"/hello\">this link</a>.\n" +
                "</p>\n" +
                "<p>\n" +
                "    To access an endpoint serving a json object go to <a href=\"/json\">this link</a>.\n" +
                "</p>\n" +
                "</body>\n" +
                "</html>";
    }
}

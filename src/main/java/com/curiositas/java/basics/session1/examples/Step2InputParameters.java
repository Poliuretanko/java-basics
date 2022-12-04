package com.curiositas.java.basics.session1.examples;

/**
 * A simple console program just write to console a greetings message with provided program argument
 * If there is no parameter, then the program writes "Hello World!"
 * Try to run using console:
 * jdk-17-path/bin/java -jar out/artifacts/java_basics_step2_jar/java-basics.jar John
 */
public class Step2InputParameters {

    /**
     * The line below describes method parameter args
     * @param args parameters provided to the program. String means string type. String[] means that this is an array of strings
     */
    public static void main(String[] args) {
        // The command on the line below is creating a variable and assigning a value to this variable
        var greetingSubject = "World";

        // This is condition. "args.length" > 0 means that there is at least 1 provided argument. args - is an array of strings
        if (args.length > 0) {
            // If the program comes to this line, then the condition "args.length > 0" is true. we assign a provided value to our variable
            greetingSubject = args[0];
        }

        // We construct a resultive message using concatenation. Another example of the concatenation: "A" + "B"
        String greetingMessage = "Hello " + greetingSubject + "!";

        // And write it to the console
        System.out.println(greetingMessage);
    }
}

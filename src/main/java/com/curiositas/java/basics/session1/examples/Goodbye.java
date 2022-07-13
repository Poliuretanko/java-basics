package com.curiositas.java.basics.session1.examples;

public class Goodbye {
    public static void main(String[] args) {

            // The command on the line below is creating a variable and assigning a value to this variable
            //var greetingSubject = "World";

            String student  = args[0];



            // This is condition. "args.length" > 0 means that there is at least 1 provided argument. args - is an array of strings


            // We construct a resultive message using concatenation. Another example of the concatenation: "A" + "B"
            String greetingMessage = "Goodbye " + student + "!";

            // And write it to the console
            System.out.println(greetingMessage);
    }
}

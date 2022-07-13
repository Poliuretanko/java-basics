package com.curiositas.java.basics.session1.examples;


/**
 * A simple console program just write to console a greetings message with provided program argument
 * Id there is no parameter, then the program writes "Hello World!"
 */
public class Step3IfElse {

    // 8 lines below contains variables that belongs to class. 4 of them - numbers and 4 of them - strings
    private static final int lastNightHour = 5;
    private static final int lastMorningHour = 11;
    private static final int lastDayHour = 17;
    private static final int lastEveningHour = 22;
    private static final String morningGreetingPrefix = "Good morning ";
    private static final String dayGreetingPrefix = "Good afternoon ";
    private static final String eveningGreetingPrefix = "Good evening ";
    private static final String nightGreetingPrefix = "Good night ";

    public static void main(String[] args) {
        var hourOfDay = 16;

        if (args.length > 0) {
            hourOfDay = Integer.parseInt(args[0]);
        }

        // We just create a variable, but assign no value. In this case, Java assigns a special value "NULL"
        String greetingPrefix;

        // Symbol && means that if the left and right condition are true then result is true. otherwise, false
        if (hourOfDay > lastNightHour && hourOfDay <= lastMorningHour) {
            greetingPrefix = morningGreetingPrefix;
        } else if (hourOfDay > lastMorningHour && hourOfDay <= lastDayHour) {
            greetingPrefix = dayGreetingPrefix;
        } else if (hourOfDay > lastDayHour && hourOfDay <= lastEveningHour) {
            greetingPrefix = eveningGreetingPrefix;
        } else {
            greetingPrefix = nightGreetingPrefix;
        }

        String greetingMessage = greetingPrefix + "World!";

        System.out.println(greetingMessage);
    }
}

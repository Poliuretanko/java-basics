package com.curiositas.java.basics.session1.examples;

public class Temrature {
    // 8 lines below contains variables that belongs to class. 4 of them - numbers and 4 of them - strings
    private static final int CoolestTemp = 5;

    private static final int HighestTemp = 22;
    private static final String ColdTemperature = " It's a cold ";

    private static final String MidTemperature = "It is ok ";

    private static final String HotTemperature = "It's hot ";

    public static void main(String[] args) {
        var hourOfDay = 3;

        if (args.length > 0) {
            hourOfDay = Integer.parseInt(args[0]);
        }

        // We just create a variable, but assign no value. In this case, Java assigns a special value "NULL"
        String greetingPrefix;

        // Symbol && means that if the left and right condition are true then result is true. otherwise, false
        if (hourOfDay <= CoolestTemp) {
            greetingPrefix = ColdTemperature;
        } else if (hourOfDay > CoolestTemp && hourOfDay <= HighestTemp) {
            greetingPrefix = MidTemperature;
        } else  {
            greetingPrefix = HotTemperature;

        }
            String greetingMessage = greetingPrefix + "World!";

            System.out.println(greetingMessage);
        }
    }

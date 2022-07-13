package com.curiositas.java.basics.session2.examples;

import com.google.common.reflect.ClassPath;

import java.util.Set;

/**
 * This program just shows you some details about executing java. Just try to run it.
 */
public class Step11ClassLoading {
    public static void main(String[] args) {
        // For first, let's see some environment properties
        printSystemProperties();

        // And now, we can check how many classes we use in this program
        printLoadedClassesWithCoveringExceptions();

        System.out.println("The program has been finished successfully!");
    }

    private static void printSystemProperties() {
        // I have collected a lot of allowed properties
        printSystemProperty("java.specification.version");
        printSystemProperty("sun.management.compiler");
        printSystemProperty("java.vm.vendor");
        printSystemProperty("java.class.path");
        printSystemProperty("sun.boot.library.path");
        printSystemProperty("sun.java.command");
        printSystemProperty("java.vendor.url.bug");
        printSystemProperty("java.io.tmpdir");
        printSystemProperty("java.home");
        printSystemProperty("line.separator");
        printSystemProperty("os.name");
        printSystemProperty("user.name");
        printSystemProperty("user.country");
        printSystemProperty("user.language");
        printSystemProperty("user.home");
        printSystemProperty("user.dir");
    }

    private static void printSystemProperty(String key) {
        System.out.println(System.getProperties().getProperty(key));
    }

    private static void printLoadedClassesWithCoveringExceptions() {
        try {
            printLoadedClassesWithRethrowingExceptions();
        } catch (Exception e) {
            System.out.println("I have caught the exception with the message \"" + e.getMessage() + "\"");
            // Wow! You can just exit from the program! Status 1 means some error caused.
            // By the way, please newer use this command in the real code - it makes the program dangerously unpredictable
            System.exit(1);
        }
    }

    private static void printLoadedClassesWithRethrowingExceptions() throws Exception {
        ClassPath classPath = ClassPath.from(Step11ClassLoading.class.getClassLoader());
        Set<ClassPath.ClassInfo> classes = classPath.getAllClasses();
        System.out.println("There are " + classes.size() + " classes loaded to the memory");
        // It's a Java Stream API! Let's see what is it
        classes.stream()
                .filter(classInfo -> classInfo.getName().contains("creatures"))
                .forEach(classInfo -> System.out.println(classInfo.getName()));

        // Let's break the program!
        throw new Exception("An exception! It means that something wrong is happened.");
    }
}

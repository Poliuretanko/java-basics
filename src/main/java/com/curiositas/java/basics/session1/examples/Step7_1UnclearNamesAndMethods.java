package com.curiositas.java.basics.session1.examples;

import java.util.Arrays;
import java.util.Random;

import static com.curiositas.java.basics.session1.examples.Step7_1UnclearNamesAndMethods.Name.*;

/**
 * This program does something, but I can't understand, what. Can you figure out the purpose of this program?
 */
public class Step7_1UnclearNamesAndMethods {

    private String[] g;
    private static final Random random = new Random();

    private static final int s = 10;

    // This is a method. It consists of access modifier "private", returning type String", name "a", input parameter "int l" and body
    // Can you understand what does this method without reading the method body? Definitely, not...
    private String a(int l) {
        // Ok, let's try to understand, what it does
        int i = random.nextInt(l);// then, we generate the random int from 0 to l
        var s = String.valueOf(i); // then we convert byte array to a string
        return s; // and return the result
    }

    // This method has no input parameters. But the name is still unclear
    private String b() {
        var index = random.nextInt(mi, ma); // Ok, we generate a random number from minIndex to maxIndex
        var y = z(index); // then, we call the method "z" and provide it "index" as an input parameter
        var a = a(s); // then, we call the method "a" and provide it "s" as an input parameter. The result is saved in the variable a
        var r = y + a; // finally, we concatenate strings "a" and "y" and save the result in the variable "r"
        return r; // and we return the result
    }

    // One more unclear method. The programmer is kidding us! Hold on, we'll figure it all out
    // Look! this method return nothing, because there is "void" on the place for returning type. Ok, one thing is known
    private void c(int m) {
        var j = new String[m]; // We create an array of strings and save it in the variable "j"
        for (int i = 0; i < m; i++) { // Aha, it's a "for" loop from 0 to m. Let's take a look what it does on the each step
            var d = b(); // we call the method "b" and save the result in the variable "d"
            j[i] = d; // then, we save the value "d" on the "i" position of the j array
        }
        this.g = j; // finally, we save the array in the "g". "this.g" means that "g" belongs to the current object "example" of class "Step7_1UnclearNamesAndMethods".
    }

    // Wow, it's a method came from the parent class "Object"!
    @Override // Override means that we change the method implementation here
    public String toString() { // It has significantly more clear name than previous methods toString means convert the current object to a string
        return "g=" + Arrays.toString(g); // Just believe, it works!
    }

    public static void main(String[] args) {
        Step7_1UnclearNamesAndMethods example1 = new Step7_1UnclearNamesAndMethods(); // We create an object of the current class
        example1.c(5);
        System.out.println(example1);

        Step7_1UnclearNamesAndMethods example2 = new Step7_1UnclearNamesAndMethods(); // We create another object of the current class. We can create so many objects as we want!
        example2.c(2);
        System.out.println(example2);
    }

    // It's another class in the current class! enum is the special classes which have already defined objects
    // Here you can see 5 objects, each of them has a unique i parameter
    enum Name {
        Noname(0),
        Anna(1),
        John(2),
        Peter(3),
        Stan(4);
        final int i;

        final static int ma = 4; //The name of the variable still doesn't tell us, what does it mean.
        final static int mi = 0;

        // This is a constructor. It's a special method which help you to execute some code during creating objects
        Name(int i) {
            this.i = i;
        }

        // One more unclear method! But it has a "static" word like the method "main"
        // the word static means that the method or variable can be accessed without objects. We will discuss objects in next lessons
        public static Name z(int i) {
            for (var n : Name.values()) { // Wow, it's another option to write "for" loop. If you are interested, learn it on one's own
                if (n.i == i) {
                    return n;
                }
            }
            return Noname; // In case, when we can't find any name, return the default name
        }
    }
}

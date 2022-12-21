package com.curiositas.java.basics.session1.examples;

import java.util.Arrays;
import java.util.Random;

import static com.curiositas.java.basics.session1.examples.Step7_2ClearNamesAndMethods.Name.*;

/**
 * So, after some refactoring, the purpose of the class is clear. It generates arrays of the random names
 */
public class Step7_2ClearNamesAndMethods {

    private String[] randomNames;
    private static final Random random = new Random();

    private static final int maximalRandomNumberValue = 10;

    // Try to understand the code without comments. I think it will be easier than in the previous example
    private String generateRandomNumberAsString(int maximalRandomNumber) {
        int randomNumber = random.nextInt(maximalRandomNumber);
        var randomNumberAsString = String.valueOf(randomNumber);
        return randomNumberAsString;
    }

    // The name of the method tells us the whole it purpose. Very well!
    private String generateRandomName() {
        var index = random.nextInt(minimalNameIndex, maximalNameIndex);
        var chosenName = getNameByIndex(index);
        var randomNumber = generateRandomNumberAsString(maximalRandomNumberValue);
        var randomName = chosenName + randomNumber;
        return randomName;
    }

    // This method is the essence of this class. It generates array of random names and save it in the object field "randomNames"
    private void generateRandomNames(int namesCount) {
        var randomNames = new String[namesCount];
        for (int index = 0; index < namesCount; index++) {
            var randomName = generateRandomName();
            randomNames[index] = randomName;
        }
        this.randomNames = randomNames;
    }

    // This method is already known to us
    @Override
    public String toString() {
        return "randomNames=" + Arrays.toString(randomNames) + "}";
    }

    public static void main(String[] args) {
        Step7_2ClearNamesAndMethods example1 = new Step7_2ClearNamesAndMethods();
        example1.generateRandomNames(5); // We generate 5 random names in the first example
        System.out.println(example1);

        Step7_2ClearNamesAndMethods example2 = new Step7_2ClearNamesAndMethods();
        example2.generateRandomNames(2); // and generate 2 random names in the first example
        System.out.println(example2);
    }

    enum Name {
        Noname(0),
        Anna(1),
        John(2),
        Peter(3),
        Stan(4);
        final int index;

        final static int maximalNameIndex = 4; // A more clear than earlier!
        final static int minimalNameIndex = 0;

        Name(int index) {
            this.index = index;
        }

        public static Name getNameByIndex(int index) {
            for (var currentName : Name.values()) {
                if (currentName.index == index) {
                    return currentName;
                }
            }
            return Noname;
        }
    }
}

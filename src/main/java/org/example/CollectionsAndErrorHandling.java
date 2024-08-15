package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        try {
            // Step 1: Define a List of integers with duplicates
            List<Integer> integerList = new ArrayList<>();

            // Adding elements to the list, including duplicates (2 and 4)
            integerList.add(1);
            integerList.add(2);
            integerList.add(2);
            integerList.add(3);
            integerList.add(4);
            integerList.add(4);
            integerList.add(5);

            // Step 2: Use a Set to remove duplicates
            // HashSet will automatically remove duplicate elements from the list
            Set<Integer> integerSet = new HashSet<>(integerList);

            // Step 3: Calculate the sum and average of the integers in the set (duplicates removed)
            int sum = 0; // Variable to store the sum of integers
            for (int num : integerSet) { // Iterate through each unique integer in the set
                sum += num; // Add each integer to the sum
            }
            // Calculate the average by dividing the sum by the size of the set (number of unique integers)
            double average = sum / (double) integerSet.size();

            // Step 4: Print the results

            // Print the list of unique integers
            System.out.println("List without duplicates: " + integerSet);
            // Print the sum of the unique integers
            System.out.println("Sum: " + sum);
            // Print the average of the unique integers
            System.out.println("Average: " + average);

        } catch (ArithmeticException e) {
            // Catch and print any arithmetic exceptions, e.g., division by zero
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Catch and print any illegal argument exceptions
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            // Catch and print any index out-of-bounds exceptions
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Catch and print any other general exceptions
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Print a message indicating the end of execution
            System.out.println("Execution finished.");
        }
    }
}

/*
Summary:
The CollectionsAndErrorHandling class demonstrates basic collection usage and error handling in Java.
A list of integers is defined with duplicate values, which are then removed using a HashSet.
The program calculates the sum and average of the unique integers and prints these results.
Error handling is implemented using multiple catch blocks to handle specific exceptions like
ArithmeticException, IllegalArgumentException, and IndexOutOfBoundsException, as well as any other general exceptions.
The finally block ensures that the message "Execution finished" is printed, whether an exception occurs or not.
*/
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
                integerList.add(1);
                integerList.add(2);
                integerList.add(2);
                integerList.add(3);
                integerList.add(4);
                integerList.add(4);
                integerList.add(5);

                // Step 2: Use a Set to remove duplicates
                Set<Integer> integerSet = new HashSet<>(integerList);

                // Step 3: Calculate the sum and average of the integers
                int sum = 0;
                for (int num : integerSet) {
                    sum += num;
                }
                double average = sum / (double) integerSet.size();

                // Step 4: Print the results
                System.out.println("List without duplicates: " + integerSet);
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Execution finished.");
            }
        }
    }
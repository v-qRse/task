package org.example;

public class Main {
   private final static int Length_Rectangle = 5;
   private final static int Wight_Rectangle = 3;
   private final static char Char_Star = '*';

   public static void main(String[] args) {
      printSequenceMultiplySevenMultiplier();
      printMaximumAndMeanRandomValues();
      printPrimeNumbers();
      printRectangleFromStars();
   }

   private static void printSequenceMultiplySevenMultiplier() {
      for (int multiplier = 1; multiplier <= 14; multiplier++){
         System.out.print(7*multiplier + " ");
      }
      System.out.println();
   }

   private static void printMaximumAndMeanRandomValues() {
      double[] arrayRandomValues = new double[30];
      double maxValuesArray = 0;
      double sumValuesArray = 0;

      for(double value: arrayRandomValues) {
         value = Math.random();
         maxValuesArray = Math.max(maxValuesArray, value);
         sumValuesArray += value;
      }
      System.out.println(maxValuesArray);
      System.out.println(sumValuesArray/arrayRandomValues.length);
   }

   private static void printPrimeNumbers() {
      for (int number = 2; number <= 100; number++) {
         int divisor = (int) Math.round(Math.sqrt(number));
         while (number%divisor != 0) {
            divisor--;
         }
         if (divisor == 1) {
            System.out.println(number);
         }
      }
   }

   private static void printRectangleFromStars() {
      for (int wight = 0; wight < Wight_Rectangle; wight++) {
         for (int length = 0; length < Length_Rectangle; length++) {
            System.out.print(Char_Star + " ");
         }
         System.out.println();
      }
   }
}
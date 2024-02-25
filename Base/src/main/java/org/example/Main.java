package org.example;

public class Main {
   public static void main(String[] args) {
      PrintSequenceMultiplySevenMultiplier();
      PrintMaximumAndMeanRandomValues();
      PrintPrimeNumbers();
      PrintRectangleFromStars();
   }

   private static void PrintSequenceMultiplySevenMultiplier() {
      for (int multiplier = 1; multiplier <= 14; multiplier++){
         System.out.print(7*multiplier + " ");
      }
      System.out.println();
   }

   private static void PrintMaximumAndMeanRandomValues() {
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

   private static void PrintPrimeNumbers() {
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

   final static int Length_Rectangle = 5;
   final static int Wight_Rectangle = 3;
   final static char Char_Star = '*';
   private static void PrintRectangleFromStars() {
      for (int wight = 0; wight < Wight_Rectangle; wight++) {
         for (int length = 0; length < Length_Rectangle; length++) {
            System.out.print(Char_Star + " ");
         }
         System.out.println();
      }
   }
}
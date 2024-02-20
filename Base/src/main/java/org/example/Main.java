package org.example;

public class Main {
   public static void main(String[] args) {
      Task_1();
      Task_2();
      Task_3();
      Task_4();
   }

   static void Task_1() {
      for (int i = 1; i <= 14; i++){
         System.out.print(7*i + " ");
      }
      System.out.println();
   }

   static void Task_2() {
      int n = 30;
      double[] array = new double[n];
      double max = 0, sum = 0;

      for(double values: array) {
         values = Math.random();
         max = Math.max(max, values);
         sum += values;
      }
      System.out.println(max);
      System.out.println(sum/n);
   }

   static void Task_3() {
      int max, n;
      for (int i = 2; i <= 100; i++) {
         max = (int) Math.round(Math.sqrt(i));
         n = 2;
         while (i%n != 0 && n <= max)
            n++;
         if (n > max)
            System.out.println(i);
      }
   }

   static void Task_4() {
      int n = 3;
      int m = 5;
      char ch = '*';

      for (int i = 0; i < n; i++) {
         for (int j = 1; j < m; j++) {
            System.out.print(ch + " ");
         }
         System.out.println();
      }
   }
}
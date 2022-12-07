 //A java programm that displays the summation of numbers by using a for loop
 public class Main {
            public static void main(String[] args) {
                int number=5;
                int sum = 0;
                int i;
                for (i = 1; i<=5; ++i) {
                    sum = sum + i;
                    System.out.println(i);
                }
                System.out.println("the sum is:" + sum);
            }
        }
//A java programm that displays the summation of numbers by using While loop
        public class Main{
            public static void main(String[] args){
                int i=0;
                int sum=0;
                while (i <=5) {
                    sum = sum +i;
                    i++;
                    System.out.println(i);
                }
                System.out.println("The sum is:" + sum);
            }
        }

// A java programm that displays the summation of numbers by using do..while loop
        public class studentNumber {
            public static void main(String[] args) {
                int i = 1;
                int n = 3;
                int sum = 0;
                do {
                    i++;
                    sum = sum + i;
                    System.out.println(i);
                }
                while (i <= n);
                System.out.println("the sum is:" + sum);
            }

            //A java program that displays the summation of numbers by using unlabled break statment
            public class Main {
                public static void main(String[] args) {
                    int i;
                    int sum = 0;
                    for (i = 2; i <= 10; i++) {
                        sum = sum + i;
                        System.out.println(i);
                        if (i == 5)
                            break;
                    }
                    System.out.println("The sum is:" + sum);

                }
            }

            //A java program that displays the summation of numbers by using unlabled continue statment
            public class main {
                public static void main(String[] args) {
                    int sum = 0;
                    for (int i = 0; i <= 7; i++) {
                        sum = sum + i;
                        System.out.println(i);
                        if (i == 4)
                            continue;
                    }
                }
            }

            //A java program that displays the summation of numbers by using labled break statment
            public class Main {
                public static void main(String[] args) {
                    first:
                    for (int i = 1; i < 6; ++i) {
                        for (int j = 0; j < i; ++j) {
                            if (i == 3)
                                break first;
                            System.out.print(i + " ");

                        }
                        System.out.println();
                    }
                    System.out.println("all for loops");
// java program that displays  the summation of numbers   by using     labled continue statment

 public class main {
     public static void main(String[] args) {
                        first:
                        for (int i = 1; i < 6; ++i) {
                            for (int j = 0; j < i; ++j) {
                                if (i == 3)
                                    continue first;
                                System.out.print(i + " ");

                            }
                            System.out.println();
                        }
                        System.out.println("all for loops");
                    }

                }

//A java program to find a factortoial of a given number by calling a function(method)
public class studentNumber {
  public static void calcufact() {
 int factorial = 1;
    int number = 5;
   for (int i = 1; i <= 5; i++)
   factorial = factorial * i;
  system.out.println(factorial);
                    }

   public static void main(String[] args) {
     calcufact();

                    }


                }
            }
        }
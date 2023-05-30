
import java.until.Scanner;
import java.until.*;

public class LAB2 {
    public static void main(String[] args) {



                System.out.println("Q1:");
                Scanner input = new Scanner(System.in);
                System.out.println("First Num(x)?");
                int x = input.nextInt();
                System.out.println("Second Num(y)?");
                int y = input.nextInt();
                System.out.println("y = " + x);
                System.out.println("x = " + y);


                System.out.println("Q2:");
                System.out.println("Enter Your Number pls :)");
                int z = input.nextInt();
                System.out.println("Num=" + z);
                System.out.println("" + z + "*1=" + z * 1 + "\n" + z + "*2=" + z * 2 + "\n" + z + "*3=" + z * 3 + "\n" + z + "*4=" + z * 4 + "\n" + z + "*5=" + z * 5 + "\n" + z + "*6=" + z * 6 + "\n" + z + "*7=" + z * 7 + "\n" + z + "*8=" + z * 8 + "\n" + z + "*9=" + z * 9 + "\n" + z + "*10=" + z * 10 + "\n");


                System.out.println("Q3:");
                System.out.println("You have to Enter 5 Numbers :) ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int num4 = input.nextInt();
                int num5 = input.nextInt();
                int sum = num1 + num2 + num3 + num4 + num5;
                System.out.println("Sum= " + sum);


                System.out.println("Q4:");
                System.out.println("Enter your ODD Number from 1 to 100:");
                int num6 = input.nextInt();
                if (num6 % 2 == 1) {
                    System.out.println("The next 5 odd numbers = " + (num6 + 2) + " , " + (num6 + 4) + " , " + (num6 + 6) + " , " + (num6 + 8) + " , " + (num6 + 10));
                    System.out.println("The next 5 Even numbers = " + (num6 + 1) + " , " + (num6 + 3) + " , " + (num6 + 5) + " , " + (num6 + 7) + " , " + (num6 + 9));
                }

                System.out.println("Q5:");
                System.out.println("Enter positive num=:");
                int pos = input.nextInt();
                int Temp = pos++;
                int var10000 = pos++ + pos;
                ++pos;
                var10000 += pos;
                ++pos;
                var10000 += pos;
                ++pos;
                int summation = var10000 + pos + Temp;
                ++Temp;
                int var10001 = Temp++;
                System.out.println("the next five num are " + var10001 + " , " + Temp++ + " , " + Temp++ + " , " + Temp++ + " , " + Temp);
                System.out.println("the Summation =  " + summation);
            }
        }
    }

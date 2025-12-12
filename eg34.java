// ugly number

import java.util.Scanner;
class eg34 {
public static boolean isUgly(int number){
while(number % 2 == 0) number /= 2;
while(number % 3 == 0) number /= 3;
while(number % 5 == 0) number /= 5;
return number == 1;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter any number : ");
int number = scanner.nextInt();
System.out.println(isUgly(number));
scanner.close();
}
}

// formal message in eg34.java
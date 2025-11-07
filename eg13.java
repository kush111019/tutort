// leap year or not

import java.util.Scanner;
class eg13 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the year: ");
int year = scanner.nextInt();
if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) System.out.println("Leap Year");
else System.out.println("Not a Leap Year");
}
}
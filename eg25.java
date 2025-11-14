// reverse a number

import java.util.Scanner;
class eg25 {
public static int getReverseNumber(int number){
int remainder = 0;
int sum = 0;
while(number > 0){
remainder = number % 10;
sum = sum * 10 + remainder;
number = number / 10;
}
return sum;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number of digits: ");
int number = scanner.nextInt();
int reverseNumber = getReverseNumber(number);
System.out.println("The reverse number is : " + reverseNumber);
scanner.close();
}
}
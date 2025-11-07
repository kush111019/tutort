//reverse the digits of a number

import java.util.Scanner;
class eg18 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the digits of a number: ");
String number = scanner.nextLine();
int myNumber = Integer.parseInt(number);
while(myNumber >= 1){
int remainder = myNumber % 10;
System.out.print(remainder);
myNumber = myNumber / 10;
}
scanner.close();
}
}
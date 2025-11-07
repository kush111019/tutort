// odd or even number

import java.util.Scanner;
class eg14 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number : ");
int number = scanner.nextInt();
if( number % 2 == 0 ) System.out.println("Even number");
else System.out.println("Odd number");
scanner.close();
}
}
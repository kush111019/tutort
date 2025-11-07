// max of three numbers

import java.util.Scanner;
class eg15 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
int largest;
System.out.println("Enter first integer : ");
int a = scanner.nextInt();
System.out.println("Enter second integer : ");
int b = scanner.nextInt();
System.out.println("Enter third integer : ");
int c = scanner.nextInt();
if(a > b && a > c) largest = a;
else if( b > a && b > c) largest = b;
else largest = c;
System.out.println("Largest is : " + largest);
scanner.close(); 
}
}
// Minimum of three Numbers

import java.util.Scanner;
class eg10 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
int minimum = 0;
System.out.print("Enter a first integer value: ");
int a = scanner.nextInt();
System.out.print("Enter the second integer value: ");
int b = scanner.nextInt();
System.out.print("Enter third integer value: ");
int c = scanner.nextInt();
if( a < b && a < c)
minimum = a;
else if( b < a && b < c)
minimum = b;
else if( c < a && c < b)
minimum = c;
else
System.out.println("Something is wrong");
System.out.println("Minium is : " + minimum);
}
}
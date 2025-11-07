// middle element out of 3 elements

import java.util.Scanner;
class eg16 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
int middle;
System.out.println("Enter first integer: ");
int a = scanner.nextInt();
System.out.println("Enter second integer: ");
int b = scanner.nextInt();
System.out.println("Enter third integer : ");
int c = scanner.nextInt();
if( a > b && a < c) middle = a;
else if( b > a && b < c) middle = b;
else middle = c;
System.out.println("Middle integer is : " + middle);
scanner.close(); 
}
}
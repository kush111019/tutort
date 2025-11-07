// factorial of a number

import java.util.Scanner;
class eg21 {
public static void main(String gg[]){
Scanner scanner  = new Scanner(System.in);
System.out.println("Enter a positive integer : ");
int number = scanner.nextInt();
int fact = number ;
for(int i = number - 1 ; i >= 1 ; i--){
fact = fact * i;
}
System.out.println("Factorial is : " + fact);
scanner.close();
}
}
// multiplication of a number by itself

import java.util.Scanner;
public class eg31 {
public int getMultiplication(int number){
int sum = 0;
for(int i = 0 ; i < number ; i++){
sum = sum + number;
}
return sum;
}
public static void main(String gg[]){
eg31 obj = new eg31();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number : ");
int number = scanner.nextInt();
int mul = obj.getMultiplication(number);
System.out.println("Multiplication is : " + mul);
scanner.close();
}
}
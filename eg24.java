// sum of digits

import java.util.Scanner;
class eg24 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number of digits: ");
int number = scanner.nextInt();
int result = 0;
int sum = 0;
int remainder = 0;
while(number >= 1){
remainder = number % 10;
sum = sum + remainder;
number = number / 10;
if(sum > 9 && number == 1){
 number = sum;
 continue;
}
}
System.out.println(sum);
}
}
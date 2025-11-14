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
while(number >= 0){
if(number == 1) remainder = 1;
else
remainder = number % 10;
sum = sum + remainder;
if(sum > 9 && number ){
 number = sum;
 continue;
}
number = number / 10;
}
System.out.println(sum);
}
}
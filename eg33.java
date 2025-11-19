// Happy number or not

import java.util.Scanner;
class eg33 {
public static int getCountOfDigits(int number){
int count = 0;
while(number > 0){
count++;
number /= 10;
}
return count;
}
public static int getDigitMultiplication(int digit){
int sum = digit;
for(int i = 0 ; i < 1 ; i++){
sum = sum * digit;
}
return sum;
}
public static int getSumOfDigits(int number){
int count = 0;
int sum;
int number1 = number;
do
{
sum = 0;
while(number > 0){
sum = sum + getDigitMultiplication(number % 10);
number /= 10; 
}
number = sum;
count++;
}while(sum != 1 && count != 500);
return sum;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any digits of a number : ");
int number = scanner.nextInt();
int sum = getSumOfDigits(number);
if(sum  == 1) System.out.println("Happy Number");
else System.out.println("Not a Happy Number");
scanner.close();
}
}
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
public static int getDigitMultiplication(int digit , int count){
int sum = digit;
for(int i = 0 ; i < count - 1 ; i++){
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
count = getCountOfDigits(number);
sum = sum + getDigitMultiplication(number % 10 , count);
System.out.println("Here the sum is : " + sum);
number /= 10; 
}
number = sum;
}while(sum != 1);
System.out.println("The sum is : " + sum);
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
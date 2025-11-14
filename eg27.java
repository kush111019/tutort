// check if a number is an armstrong number or not

import java.util.Scanner;
class eg27 {
public static int getLastDigit(int number){
return number % 10;
}
public static int getTreatedNumber(int number , int x){
int lastDigit = getLastDigit(number);
int mul = lastDigit;
while(x > 1){
mul = mul * lastDigit;
x = x / 10;
}
return mul;
}
public static boolean getSumOfCubesOfDigits(int number){
int remainder = 0;
int sum = 0;
int number1 = number;
while(number > 0){
sum = sum + getTreatedNumber(number , number1);
number = number / 10;
}
if(sum == number1) return true;
else return false;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number of digits : ");
int number = scanner.nextInt();
System.out.println(getSumOfCubesOfDigits(number));
}
}
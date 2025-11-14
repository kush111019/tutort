// sum of even index and sum of odd index

import java.util.Scanner;
class eg28 {
public static int countOfDigits(int number){
int count = 0;
while(number > 0){
count++;
number = number / 10;
}
return count;
}
public static void getOddIndexDigitsSum(int number){
int evenSum = 0;
int oddSum = 0;
int i = countOfDigits(number);
for(; i > 0 ; i--){
if(i % 2 == 0) evenSum += number % 10;
else oddSum += number % 10;
number /= 10;
}
System.out.println("Even index digits sum : " + evenSum);
System.out.println("Odd index digits sum : " + oddSum);
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number digits : ");
int number = scanner.nextInt();
getOddIndexDigitsSum(number);
scanner.close();
}
}
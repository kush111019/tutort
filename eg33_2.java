// Check Number is a Happy Number or not

import java.util.Scanner;
class eg33_2 {
public int getSquareSum(int number){
int sum = 0;
int remainder;
while(number > 0){
remainder = number % 10;
sum = sum + (remainder * remainder);
number = number / 10;
}
return sum;
}
public boolean isHappy(int number){
int slow = number;
int fast = number;
do
{
 slow = getSquareSum(slow);
 fast = getSquareSum(getSquareSum(fast));
}while(slow != fast);
return slow == 1;
}
public static void main(String gg[]){
eg33_2 object = new eg33_2();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number of digits : ");
int number = scanner.nextInt();
if(object.isHappy(number)) System.out.println("Happy Number");
else System.out.println("Not a Happy Number");
scanner.close();
}
}
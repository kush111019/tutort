// ugly number

import java.util.Scanner;
class eg34_2 {
public boolean isUgly(int number){
int i = 2;
while(number % 2 == 0) number /= 2;
int j = 3;
while(number % 3 == 0) number /= 3;
int k = 5;
while(number % 5 == 0) number /= 5;
return number == 1;
}
public static void main(String gg[]){
eg34_2 object = new eg34_2();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter any number : ");
int number = scanner.nextInt();
System.out.println(object.isUgly(number));
scanner.close();
}
}
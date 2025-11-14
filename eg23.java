// get a particualr number in a febonecie series

import java.util.Scanner;
public class eg23 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number : ");
int number = scanner.nextInt();
int a = 1;
int b = 1;
int c = 0;
for(int i = 3 ; i <= number ; i++){
c = a + b;
a = b;
b = c;
}
System.out.println("The" + " " + number + " " + "number" + " " + "in the febonecie series is : " + c);
}
}
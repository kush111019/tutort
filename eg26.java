// check if a number is pallindrom number or not

import java.util.Scanner;
class eg26 {
public static boolean isPallindrom(int number){
int count = 0;
String n = Integer.toString(number);
for(int i = 0 ; i < n.length() / 2 ; i++){
if(n.charAt(i) == n.charAt(n.length() - (i + 1))) count++;
}
if(count == n.length() / 2)
return true;
else return false;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number of digits : ");
int num = scanner.nextInt();
boolean b = isPallindrom(num);
System.out.println(b);
scanner.close();
}
}
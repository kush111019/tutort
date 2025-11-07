// check if couple is elegible for marrige

import java.util.Scanner;
class eg11 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter girl's age : ");
int girlAge = scanner.nextInt();
System.out.print("Enter boy's age : ");
int boyAge = scanner.nextInt();
if(girlAge >= 18 && boyAge >= 21)
System.out.println("Eligible for marrige");
else
System.out.println("Not Eligible for marrige");
}
}
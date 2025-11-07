// printing tax amount

import java.util.Scanner;
class eg12 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter bill amount : ");
int billAmount = scanner.nextInt();
int tax = billAmount >= 50000 ? billAmount * 10 / 100 : billAmount * 5 / 100;
System.out.println("Tax is : " + tax);
}
}
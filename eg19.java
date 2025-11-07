// print the table of a number

import java.util.Scanner;
class eg19 {
public static void main(String gg[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter some positive integer : ");
int number = sc.nextInt();
int prod;
for(int i = 1 ; i <= 10 ; i++){
prod = i * number;
System.out.println(prod);
}
sc.close();
}
}
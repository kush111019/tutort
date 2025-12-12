// string builder class example

import java.util.Scanner;
class eg35 {

public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
StringBuilder sb = new StringBuilder();
System.out.print("Enter the size of the array : ");
int size = scanner.nextInt();
for(int i = 0 ; i < size ; i++){
System.out.print("Enter the character : ");
sb.append(scanner.next().charAt(0)); 
}
System.out.println(sb.toString());
scanner.close();
}
}
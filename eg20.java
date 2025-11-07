// first n odd numbers

import java.util.Scanner;
class eg20 {
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter some integer : ");
int number = scanner.nextInt();
for(int i = 1 ; i <= number ; i++){
if(i % 2 != 0) System.out.println(i);
}
scanner.close();
}
}
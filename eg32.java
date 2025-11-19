// factors of a number
import java.util.Scanner;
class eg32 {
public static int[] getFactors(int number){
int count = 0;
int[] arr = new int[100];
arr[0] = 1;
count++;
for(int i = 2 ; i <= number ; i++){
while(number % i == 0){
arr[count] = i;
count++;
number /= i;
}
}
return arr;
}
public static void main(String gg[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number : ");
int number = scanner.nextInt();
int[] arr = getFactors(number);
int i = 0;
while(arr[i] != 0){
System.out.println(arr[i]);
i++;
}
scanner.close();
}
}
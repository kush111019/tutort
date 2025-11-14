// take input for array

import java.util.Scanner;
class eg29 {
Scanner scanner = new Scanner(System.in);
public int[] getArray(int size){
int[] arr = new int[size];
for(int i = 0 ; i < size ; i++){
System.out.println("Enter the array element for index" + " " + i);
arr[i] = scanner.nextInt();
}
return arr;
}
public void printArray(int[] arr , int size){
for(int i = 0 ; i < size ; i++){
System.out.println(arr[i]);
}
}
public static void main(String gg[]){
eg29 obj = new eg29();
System.out.println("Enter the size of the array : ");
int size = obj.scanner.nextInt();
int[] arr = obj.getArray(size);
System.out.println("The array is as given below: ");
System.out.println("*****************************");
obj.printArray(arr , size);
obj.scanner.close();
}
}
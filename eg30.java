// reverse the array
import java.util.Scanner;
public class eg30 {
public int[] getReverseOfAnArray(int[] arr){
int temp = 0;
for(int i = 0 ; i < arr.length / 2 ; i++){
temp = arr[i];
arr[i] = arr[arr.length - (i + 1)];
arr[arr.length - (i + 1)] = temp;
}
return arr;
}
public static void main(String gg[]){
int[] arr = {1,2,3,4,5,6};
eg30 obj = new eg30();
int[] array = obj.getReverseOfAnArray(arr);
for(int i = 0 ; i < array.length ; i++){
System.out.println(array[i]);
}
}
}

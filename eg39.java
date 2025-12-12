// reverse the array

class eg39 {
public static void main(String gg[]){
int[] arr = {1,2,3,4,5};
int temp = 0;
for(int i = 0 ; i < arr.length / 2 ; i++){
temp = arr[i];
arr[i] = arr[arr.length - (i + 1)];
arr[arr.length - (i + 1)] = temp;
}
for(int i = 0 ; i < arr.length ; i++){
System.out.println(arr[i]);
}
}
}
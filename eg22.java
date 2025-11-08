// prime numbers from 1 to 100

public class eg22 {
public static void main(String gg[]){
int count1 = 0 ;
for(int i = 1 ; i <= 100 ; i++){
int count = 0 ;
for(int j = 1 ; j <= i ; j++){
if(i % j == 0){
count++;
}
if(count < 3 && j == i) count1++;
}
}
System.out.println("Prime numbers between 1 to 100 : " + count1);
}
}

// prime numbers from 1 to 100

public class eg22 {
public static void main(String gg[]){
int count1 = 0 ;
for(int i = 2 ; i <= 100 ; i++){
int count = 0 ;
int j;
for(j = 2 ; j <= i; j++){
if(i % j == 0 && i != j){
count++;
break;
}
if(count < 1  && j == i) count1++;
}
}
System.out.println("Prime numbers between 1 to 100 : " + count1);
}
}

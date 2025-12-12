class eg37 {
public String addString(String num1 , String num2){
int i = num1.length() - 1;
int j = num2.length() - 1;
int carry = 0;
StringBuilder stringBuilder = new StringBuilder();
while(i >= 0 || j >= 0 || carry != 0){
int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
int sum = digit1 + digit2 + carry;
stringBuilder.append(sum % 10);
carry = sum / 10;
i--;
j--;
}
return stringBuilder.reverse().toString();
}
public static void main(String gg[]){
eg37 object = new eg37();
System.out.print("The sum of the two strings : " + object.addString(num1 , num2));
scanner.close(); 
}
}
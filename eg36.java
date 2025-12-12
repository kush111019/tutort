// get data type

class eg36 {

public static void main(String gg[]){
int a = 23;
char b = 'c';
String g = "Hello World !";
Integer aObj = a;
Character bObj = b;
System.out.println("a data type is : " + aObj.getClass().getName());
System.out.println("b data type is : " + bObj.getClass().getName());
System.out.println("g data type is : " + g.getClass().getName());
System.out.println(g.charAt(4) - '0');
}
}
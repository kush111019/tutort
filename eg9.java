class SomeClass {
public void SomeClass(){
System.out.println("Hello World !");
}
public void bark(){
System.out.println("bow bow");
}
}

class eg9 extends SomeClass {
public eg9(){
super();
}
public void bark(){
System.out.println("meow meow");
}
public static void main(String gg[]){
eg9 obj = new eg9();
obj.bark();
SomeClass obj1 = new SomeClass();
obj1.bark();
}
}


interface MyInterface{
    public void fun1();
    public void fun2();
}

class MyClass1 implements MyInterface{
    public void fun1(){
        System.out.println("Function 1...");
    }

    public void fun2(){
        System.out.println("Function 2...");
    }
}
public class Interfaces {

    public static void main(String[] args){
        MyClass1 obj = new MyClass1();
        obj.fun1();
        obj.fun2();
    }
}

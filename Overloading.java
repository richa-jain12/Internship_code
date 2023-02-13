
class MyClass2{
    public void fun1(int x, int y){
        int z = x+y;
        System.out.println(z);
    }

    public void fun1(int x, int y, int z){
        int a = x+y+z;
        System.out.println(a);
    }
}

public class Overloading {
    public static void main(String[] args){
        MyClass2 obj = new MyClass2();
        obj.fun1(4,5);
        obj.fun1(3,4,5);
    }
}

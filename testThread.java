import java.lang.*;


class Class1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread Class 1");
        }
    }
}

class Class2 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread Class 2");
        }
    }
}
public class testThread extends Thread{

    public static void main(String[] args){
        Class1 th = new Class1();
        Class2 th2 = new Class2();
        th.start();
        System.out.println("Method 1 after Start()");
        System.out.println("Method 2 after Start()");
        System.out.println("Method 3 after Start()");
        th2.start();
    }
}

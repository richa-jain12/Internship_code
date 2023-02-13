abstract class Abstract {
    public String name = "Richa";
    public int age = 21;
    public abstract void study();

}

class MyClass extends Abstract{
    public void study(){
        System.out.println("Studying all day long!");
    }
}

public class Abstraction{
    public static void main(String[] args){
        MyClass obj = new MyClass();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.study();
    }
}






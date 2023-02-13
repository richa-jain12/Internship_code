
public class OuterClasses {
    int x = 10;
    class InnerClasses{
        int y = 5;
    }
    public static void main(String[] args){
        OuterClasses obj = new OuterClasses();
        OuterClasses.InnerClasses obj2 = obj.new InnerClasses();
        System.out.println(obj.x + obj2.y);
    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListMenu {

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        while(true) {
            System.out.println("Choose operation: ");
            System.out.println("1) ADD");
            System.out.println("2) REMOVE");
            System.out.println("3) ACCESS");
            System.out.println("4) SHOW ALL ELEMENTS");
            System.out.println("5) EXIT");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();



            switch (opt) {
                case 1:
                    System.out.println("Enter element to add: ");
                    int a = sc.nextInt();
                    arr.add(a);
                    break;
                case 2:
                    System.out.println("Enter element number to remove: ");
                    int b = sc.nextInt();
                    arr.remove(b);
                    break;
                case 3:
                    System.out.println("Enter element number: ");
                    int c = sc.nextInt();
                    System.out.println(arr.get(c));
                    break;

                case 4:
                    int count = -1;
                    for (int i : arr) {
                        count++;
                        System.out.println("[" + count + "]" + i);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Enter correct option!!");
            }
        }
    }
}

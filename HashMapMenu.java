import java.util.HashMap;
import java.util.Scanner;


public class HashMapMenu {
    public static void main(String args[]){
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Richa", 22);
        people.put("Purvi", 18);
        people.put("Diya", 22);
        people.put("Shalu", 28);
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
                    System.out.println("Enter key of the element to add: ");
                    Scanner sc1 = new Scanner(System.in);
                    String a = sc1.nextLine();
                    System.out.println("Enter value of the element to add: ");
                    int b = sc.nextInt();
                    people.put(a, b);
                    break;
                case 2:
                    System.out.println("Enter element number to remove: ");
                    Scanner sc2 = new Scanner(System.in);
                    String c = sc2.nextLine();
                    people.remove(c);
                    break;
                case 3:
                    System.out.println("Enter element key: ");
                    Scanner sc3 = new Scanner(System.in);
                    String d = sc3.nextLine();
                    System.out.println(people.get(d));
                    break;

                case 4:
                    int count = -1;
                    for (String i : people.keySet()) {
                        count++;
                        System.out.println("[" + count + "]" + "Key is: " +  i + " and it's value is: " + people.get(i));
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

import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        int sum = 0, temp, x;
        System.out.println("Enter number: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        temp = n;

        while(n>0){
            x = n % 10;
            sum = (sum * 10) + x;
            n = n / 10;
        }

        if(temp == sum){
            System.out.println("Pallindrome number");
        }
        else{
            System.out.println("Not a Pallindrome number");
        }

    }
}

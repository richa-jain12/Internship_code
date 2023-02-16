import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\filename.txt");
            fw.write("Hello World!!");
            fw.close();
            System.out.println("File content written successfully...");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
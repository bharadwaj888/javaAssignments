package assign1;
import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Directory: C:\\Users\\madagoni sariyu");
        File directory = new File("C:\\Users\\madagoni sariyu");

        while(true) {
            String file_to_search = scan.next();
            File[] files = directory.listFiles();

            for(File f : files) {

                if (f.getName().contains(file_to_search)) {
                    System.out.println(f.getAbsolutePath());
                }
            }



            for(File f : files) {

                if (f.getName() == file_to_search) {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
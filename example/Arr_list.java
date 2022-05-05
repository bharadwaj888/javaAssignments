package example;
import java.util.ArrayList;
import java.util.Scanner;

public class Arr_List {
    public static void main(String[] args) {
        ArrayList<Integer>  num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter 0 or more");
            int number = sc.nextInt();
            if(number <0 ){
                for(int i = num.size()-1; i>=0;i--){
                    System.out.print(num.get(i) + " ");
                }
                break;
            }
            else{
                num.add(number);
            }
        }
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class  stringalphabets {
    public static void containsAllAlphabets(String str){

        Set<Character> s = new HashSet<Character>();
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = 0;i<str.length();i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                if (s.add(ch[i])) {
                    count++;


                    if (count == 52) {
                        System.out.println("All alphabets are present" );
                    }

                }
            }
        }
        if(count<52){
            System.out.println("All alphabets are not present");
        }
    }

    public static void main(String[] args) {
        String str ;
        Scanner read = new Scanner(System.in);
        str = read.next();
        containsAllAlphabets(str);
    }
}

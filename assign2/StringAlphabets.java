package assign2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// The below solution has time complexity of O(n) at the worst case but if we find all the characters at any instance
// then we stop the loop.

public class StringAlphabets {
    public static void containsAllAlphabets(String str){
        // Create a set of characters and change the string into character array and iterate over the array length and add the alphabet
        // into the set if it is not present and increment the count .
        Set<Character> s = new HashSet<Character>();
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = 0;i<str.length();i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                if (s.add(ch[i])) {
                    count++;

                    //if count is 52 then we found every alphabet is present.
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
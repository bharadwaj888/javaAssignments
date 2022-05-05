package assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class IOassignment {
    public static void main(String[] args) {
        Scanner infile;
        Map<Character,Integer> map = new HashMap<>();
        char input;
        PrintWriter pw;
        try{
            infile =new Scanner(new File("textFile.txt"));
            while(infile.hasNext()){
                String str = infile.next();
                char[] myChar = str.toCharArray();
                for(char ch : myChar) {
                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }
            }
            infile.close();
        }
        catch(FileNotFoundException obj){
            System.out.println("Can't Find file");
            System.out.println(obj.getMessage());
        }
        try{
            pw = new PrintWriter("noofcharacters.txt");
            for(Map.Entry mapElement : map.entrySet()){
                char key =(char)mapElement.getKey();
                int value = (int)mapElement.getValue();
                pw.print(key);
                pw.print(" ");
                pw.print(value);
                pw.println();

            }
            pw.close();
        }
        catch (FileNotFoundException obj){
            System.out.println(obj.getMessage());
        }

    }
}

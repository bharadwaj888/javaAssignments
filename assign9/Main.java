package assign9;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String regex = "^[A-Z]+[A-Za-z\\s]*[.]+$";
        String sentence ="White space or negative space is simply unmarked space in the design." ;
        ValidSentence validSentence = new ValidSentence();
        validSentence.sentenceValidator(regex);
        boolean output = validSentence.match(sentence);
        System.out.println(output);
    }
}

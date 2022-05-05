package assign9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidSentence {
    private Pattern pattern;
    private Matcher matcher;
    public void sentenceValidator(String regex){
        pattern = Pattern.compile(regex);
    }
    public boolean match(String sentence){
        matcher = pattern.matcher(sentence);
        return matcher.matches();
    }

}

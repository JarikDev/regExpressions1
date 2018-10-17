import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher3 {

    private static final String REGEX = "Pro";
    private static final String INPUT = "ProgLang";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main( String args[] ) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Текущее регулярное выражение: " + REGEX);
        System.out.println("Текущие входные данные: " + INPUT);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
    }
}
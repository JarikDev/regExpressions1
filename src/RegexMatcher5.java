import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher5 {

    private static String REGEX = "а*д";
    private static String INPUT = "аадProgLangааадProgLangадProgLangд";
    private static String REPLACE = "-";
    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
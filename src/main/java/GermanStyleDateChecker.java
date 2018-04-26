import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String patternString = "^(([0-2]?[0-9])|(3[01]))(\\.|-|\\s)((0?[0-9])|(1[0-2]))(\\.|-|\\s)(19|20)?[0-9]{2}$";
        Pattern pattern = Pattern.compile(patternString);
        return pattern.matcher(dateString);
    }
}

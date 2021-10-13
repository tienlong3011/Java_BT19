package bt_validate_ten_lop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4,}[GHIKLM]+$";

    public ValidateClass() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validateClass(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

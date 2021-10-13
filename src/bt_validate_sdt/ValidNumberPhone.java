package bt_validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumberPhone {
    private static final String NUMBER_REGEX = "[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public ValidNumberPhone() {

    }
    public boolean validNumberPhone(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package bt_validate_sdt;

public class ValidNumberPhoneTest {
    private static ValidNumberPhone validNumber;

    public static final String[] validNumberPhone = new String[] {"(84)-(0123456789)", "(86)-(0342676897)"};
    public static final String[] inValidNumberPhone = new String[] {"(a8)-(2222222222)","(12)-(033333333333)","(123)-(fh)", "13-57736883"};

    public static void main(String[] args) {
        validNumber = new ValidNumberPhone();
        for (String valid: validNumberPhone) {
            boolean isValid = validNumber.validNumberPhone(valid);
            System.out.println("It is " + valid + " is valid " + isValid);
        }
        for (String valid: inValidNumberPhone) {
            boolean isValid = validNumber.validNumberPhone(valid);
            System.out.println("It is " + valid + " is valid " + isValid);
        }
    }
}

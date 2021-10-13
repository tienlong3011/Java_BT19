package bt_validate_ten_lop;

public class ValidateTest {
    private static ValidateClass validateClass;
    public static final String[] validClass = new String[] {"C0318G", "C1214K"};
    public static final String[] inValidClass = new String[] {"CG", "M0318G", "P0323A", "M09G", "M09584G"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String valid: validClass) {
            boolean isValid = validateClass.validateClass(valid);
            System.out.println("It is " + valid + " is valid " + isValid);
        }
        for (String valid: inValidClass) {
            boolean isValid = validateClass.validateClass(valid);
            System.out.println("It is " + valid + " is valid " + isValid);
        }
    }
}

package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        int MIN_LENGTH = 10;
        boolean isPasswordEquals = password.equals(repeatPassword);

        if (!isPasswordEquals || password.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

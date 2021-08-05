package task6;

import org.apache.commons.lang3.StringUtils;

public class EmailAddress {
    private final String email;

    private EmailAddress(String email) {
        this.email = email;
    }

    public static EmailAddress of(String email) {
        if (hasOneAt(email)) {
            if (isAlphanum(email) && hasDotAfterAt(email)) {
                return new EmailAddress(email);
            }
        }
        throw new IllegalEmailAddressException("Podano zły adres email");
    }

    private static boolean hasOneAt(String email) {
        return email.indexOf("@") == email.lastIndexOf("@");
    }

    private static boolean hasDotAfterAt(String email) {
        return email.substring(email.indexOf("@")).indexOf(".") != -1;
    }

    private static boolean isAlphanum(String email) {
        email = StringUtils.remove(email, '@');
        email = StringUtils.remove(email, '.');
        System.out.println(email);
        return StringUtils.isAlphanumeric(email);
    }

    public String getEmail() {
        return email;
    }

    public String username() {
        return email.substring(0,email.indexOf("@"));
    }

    public String host() {
        return email.substring(email.indexOf("@") + 1);
    }

    public String topDomain() {
        return email.substring(email.lastIndexOf("."));
    }
}

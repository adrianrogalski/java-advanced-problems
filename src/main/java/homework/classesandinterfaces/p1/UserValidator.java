package homework.classesandinterfaces.p1;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

     public String validateEmails(String inputEmail){
        class Email {
            private String address;
            private Email(String address) {
                this.address = address;
            }

            private String format() {
                if (address.isEmpty() || address.equals(null)) {
                    return "unknown";
                }
                String addressLowerCase = address.toLowerCase(Locale.ROOT);
                Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
                Matcher matcher = pattern.matcher(addressLowerCase);
                if (!matcher.matches()) {
                    return "unknown";
                }
                return addressLowerCase;
            }
        }

        Email email = new Email(inputEmail);
        return email.format();
    }
}

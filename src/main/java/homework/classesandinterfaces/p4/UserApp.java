package homework.classesandinterfaces.p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserApp {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Adrian", new Validator<String>() {
            @Override
            public boolean validate(String name) {
                if (name.isEmpty() || name.equals(null)) {
                    return false;
                }
                final Pattern VALID_NAME_FORMAT = Pattern.compile("[A-Z][a-zA-Z]+");
                Matcher matcher = VALID_NAME_FORMAT.matcher(name);
                if (!matcher.matches()) {
                    return false;
                }
                return true;
            }
        });

        user1.setSurname("Rogalski", new Validator<String>() {
            @Override
            public boolean validate(String surname) {
                if (surname.isEmpty() || surname.equals(null)) {
                    return false;
                }
                final Pattern VALID_NAME_FORMAT = Pattern.compile("[A-Z][a-zA-Z]+");
                Matcher matcher = VALID_NAME_FORMAT.matcher(surname);
                if (!matcher.matches()) {
                    return false;
                }
                return true;
            }
        });

        user1.setAge(22, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                final Pattern VALID_AGE_FORMAT = Pattern.compile("[0-1]?[0-9]?[0-9]");
                Matcher matcher = VALID_AGE_FORMAT.matcher(String.valueOf(input));
                if (!matcher.matches()) {
                    return false;
                }
                return true;
            }
        });

        user1.setLogin("adrian122", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                final Pattern VALID_LOGIN_FORMAT = Pattern.compile("[A-Za-z0-9]{1,10}");
                Matcher matcher = VALID_LOGIN_FORMAT.matcher(input);
                if (!matcher.matches()) {
                    return false;
                }
                return true;
            }
        });

        user1.setPassword("admin!123", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                if (!input.contains("!")) {
                    return false;
                }
                return true;
            }
        });

        System.out.println(user1);
    }
}

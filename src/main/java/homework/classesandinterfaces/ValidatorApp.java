package homework.classesandinterfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorApp {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        String outputMessage = validator.validateEmails("adrianRoGalski07@gmail.com");
        System.out.println(outputMessage);

        outputMessage = validator.validateEmails("adrianrogalski07gmail.com");
        System.out.println(outputMessage);

        outputMessage = validator.validateEmails("");
        System.out.println(outputMessage);
    }
}

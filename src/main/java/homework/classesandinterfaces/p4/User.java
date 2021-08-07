package homework.classesandinterfaces.p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }

    }

    public void setSurname(String surname, Validator<String> validator) {
        if (validator.validate(surname)) {
            this.surname = surname;
        }
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(12)) {
            this.age = age;
        }
    }

    public void setLogin(String login, Validator<String> validator) {
      if (validator.validate(login)) {
          this.login = login;
      }
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

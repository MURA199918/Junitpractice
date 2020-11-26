package JunitPracticeproblem;

public class UserValue {

    public boolean FirstName(String fname) {
        if(fname.matches("^[A-Z][A-Z a-z]{3,25}$")) {
            System.out.println("Valid first name");
            return true;
        }
        else {
            System.out.println("Invalid first name");
            return false;
        }
    }

    public boolean LastName(String lname) {
        if(lname.matches("^[A-Z][A-Z a-z]{3,25}$")) {
            System.out.println("Valid last name");
            return true;
        }
        else {
            System.out.println("Invalid last name");
            return false;
        }
    }

    public boolean Email(String email) {
        if(email.matches("^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$")) {
            System.out.println("valid email address");
            return true;
        }
        else {
            System.out.println("Invalid email address");
            return false;
        }
    }

    public boolean Mobile(String phone) {
        if(phone.matches("[91 ]{3}[789]{1}\\d{9}")) {
            System.out.println("Valid phone number");
            return true;
        }
        else {
            System.out.println("Invalid phone number");
            return false;
        }
    }

    public boolean Password(String password) {
        if(password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&$]).{8,}$")) {
            System.out.println("Valid password");
            return true;
        }
        else {
            System.out.println("Invalid password");
            return false;
        }
    }
}

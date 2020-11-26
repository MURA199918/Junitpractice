package JunitPracticeproblem;

public class UserValue {
    String message;
    public UserValue(String message){
        this.message=message;
    }
    public boolean FirstName(String message) throws UserValueException{
        this.message=message;
        return FirstName();
    }
    public boolean LastName(String message) throws UserValueException{
        this.message=message;
        return LastName();
    }
    public boolean Email(String message) throws UserValueException{
        this.message=message;
        return Email();
    }
    public boolean Mobile(String message) throws UserValueException{
        this.message=message;
        return Mobile();
    }
    public boolean Password(String message) throws UserValueException{
        this.message=message;
        return Password();
    }
    public boolean FirstName() throws UserValueException {
        try {
            if (message.matches("^[A-Z][A-Z a-z]{3,25}$")) {
                System.out.println("Valid first name");
                return true;
            } else {
                System.out.println("Invalid first name");
                return false;
            }
        }catch (NullPointerException e){
            throw new UserValueException("Please enter valid first name");
        }
    }

    public boolean LastName() throws UserValueException {
        try{
            if(message.matches("^[A-Z][A-Z a-z]{3,25}$")) {
                System.out.println("Valid last name");
                return true;
            }
            else {
                System.out.println("Invalid last name");
                return false;
            }
        }catch (NullPointerException e){
            throw new UserValueException("Please enter valid last name");
        }

    }

    public boolean Email() throws UserValueException {
        try {
            if (message.matches("^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$")) {
                System.out.println("valid email address");
                return true;
            } else {
                System.out.println("Invalid email address");
                return false;
            }
        }catch (NullPointerException e){
            throw new UserValueException("Please enter valid emailid");
        }
    }

    public boolean Mobile() throws UserValueException {
        try{
            if(message.matches("[91 ]{3}[789]{1}\\d{9}")) {
                System.out.println("Valid phone number");
                return true;
            }
            else {
                System.out.println("Invalid phone number");
                return false;
            }
        }catch (NullPointerException e){
            throw new UserValueException("Please enter valid phone number");
        }

    }

    public boolean Password() throws UserValueException {
        try{
            if(message.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&$]).{8,}$")) {
                System.out.println("Valid password");
                return true;
            }
            else {
                System.out.println("Invalid password");
                return false;
            }
        }catch (NullPointerException e){
            throw new UserValueException("Please enter valid password");
        }
    }
}

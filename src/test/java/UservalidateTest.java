import JunitPracticeproblem.UserValue;
import JunitPracticeproblem.UserValueException;
import org.junit.Assert;
import org.junit.Test;

public class UservalidateTest {
    @Test
    public void FirstName_Check(){
        UserValue validate=new UserValue(null);
        try{
            validate.FirstName(null);
        }catch (UserValueException e) {
            Assert.assertEquals("Please enter valid first name", e.getMessage());
        }
    }
    @Test
    public void LastName_Check(){
        UserValue validate=new UserValue(null);
        try{
            validate.LastName(null);
        }catch(UserValueException e){
            Assert.assertEquals("Please enter valid last name", e.getMessage());
        }
    }
    @Test
    public void Email_Check(){
        UserValue validate=new UserValue(null);
        try{
            validate.Email(null);
        }catch(UserValueException e){
            Assert.assertEquals("Please enter valid emailid", e.getMessage());
        }
    }
    @Test
    public void Mobile_Check(){
        UserValue validate=new UserValue(null);
        try{
            validate.Mobile(null);
        }catch (UserValueException e){
            Assert.assertEquals("Please enter valid phone number", e.getMessage());
        }
    }
    @Test
    public void Password_Check(){
        UserValue validate=new UserValue(null);
        try{
            validate.Password(null);
        }catch (UserValueException e) {
            Assert.assertEquals("Please enter valid password", e.getMessage());
        }
    }
}

import JunitPracticeproblem.UserValue;
import JunitPracticeproblem.UserValueException;
import org.junit.Assert;
import org.junit.Test;

public class UservalidateTest {
    @Test
    public void FirstName_Check_istrue(){
        UserValue validate=new UserValue(null);
        try{
            validate.FirstName(null);
        }catch (UserValueException e) {
            Assert.assertEquals("Please enter valid first name", e.getMessage());
        }
    }

    /*@Test
    public void FirstName_Check_isfalse(){
        UserValue validate=new UserValue();
        boolean result=validate.FirstName("mu");
        Assert.assertEquals(false,result);
    }

    @Test
    public void LastName_Check_istrue(){
        UserValue validate=new UserValue();
        boolean result=validate.LastName("Hello");
        Assert.assertEquals(true,result);
    }

    @Test
    public void LastName_Check_isfalse(){
        UserValue validate=new UserValue();
        boolean result=validate.LastName("he");
        Assert.assertEquals(false,"he");
    }

    @Test
    public void Email_Check_istrue(){
        UserValue validate=new UserValue();
        boolean result=validate.Email("murali@example.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Email_Check_isfalse(){
        UserValue validate=new UserValue();
        boolean result=validate.Email(".asx");
        Assert.assertEquals(false,result);
    }

    @Test
    public void Mobile_Check_istrue(){
        UserValue validate=new UserValue();
        boolean result=validate.Mobile(" 91 9894119421");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Mobile_Check_isfalse(){
        UserValue validate=new UserValue();
        boolean result=validate.Mobile("5793");
        Assert.assertEquals(false,result);
    }

    @Test
    public void Password_Check_istrue(){
        UserValue validate=new UserValue();
        boolean result=validate.Password("Muralis@18");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Password_Check_isfalse(){
        UserValue validate=new UserValue();
        boolean result=validate.Password("345");
        Assert.assertEquals(false,result);
    }*/
}

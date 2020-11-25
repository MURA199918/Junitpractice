import JunitPracticeproblem.UserValue;
import org.junit.Assert;
import org.junit.Test;

public class UservalidateTest {
    @Test
    public void FirstName_Check(){
        UserValue validate=new UserValue();
        boolean result=validate.FirstName("Murali");
        Assert.assertEquals(true,result);
    }

    @Test
    public void LastName_Check(){
        UserValue validate=new UserValue();
        boolean result=validate.LastName("hello");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Email_Check(){
        UserValue validate=new UserValue();
        boolean result=validate.Email("murali@example.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Mobile_Check(){
        UserValue validate=new UserValue();
        boolean result=validate.Mobile(" 91 9894119421");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Password_Check(){
        UserValue validate=new UserValue();
        boolean result=validate.Password("Muralis@18");
        Assert.assertEquals(true,result);
    }
}

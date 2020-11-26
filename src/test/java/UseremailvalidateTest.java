import JunitPracticeproblem.UserValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UseremailvalidateTest {
    private String email;
    private boolean expectedresult;
    public UseremailvalidateTest(String email, boolean expectedresult){
        super();
        this.email=email;
        this.expectedresult=expectedresult;
    }


    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},
                                             {"abc-100@yahoo.com", true},
                                             {"abc.100@yahoo.com", true},
                                             {"abc111@abc.com", true},
                                             {"abc-100@abc.net", true},
                                             {"abc.100@abc.com.au", true},
                                             {"abc@1.com", true},
                                             {"abc+100@gmail.com", true},
                                             {"abc-", false},
                                             {"abc@.com.my", false},
                                             {"abc123@gmail.a", false},
                                             {"abc123@.com.com", false},
                                             {".abc@abc.com", false},
                                             {"abc@*.com", false},
                                             {"abc.2002@gmail.com", true},
                                             {"abc@abc@gmail.com", false},
                                             {"abc@gmail.com.la", true},
                                             {"abc@gmail.com.aa.au", false}});
    }

    @Test
    public void emailsamplestest(){
        UserValue validate=new UserValue();
        boolean result=validate.Email(email);
        Assert.assertEquals(expectedresult,result);
    }

}

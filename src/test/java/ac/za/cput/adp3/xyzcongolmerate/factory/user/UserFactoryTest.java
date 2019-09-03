package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {

        String email="johnstones@gmail.com";
        String fname ="John";
        String lname="Stones";

        User user = UserFactory.buildUser(email,fname,lname);
        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(email,user.getUserEmail());
    }
}
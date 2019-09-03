package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
         Gender gender= GenderFactory.buildGender("male");
        Race race= RaceFactory.buildRace("black");
                User user = UserFactory.buildUser("johnstones@gmail.com","John","Stones");

        UserDemography userDemography=UserDemographyFactory.buildUserDemography(user.getUserEmail(),"Senior",gender.getGenderId(),race.getRaceId(),new Date(1994 ,11, 3));
        System.out.println(userDemography);
        Assert.assertNotNull(userDemography);
        Assert.assertEquals("Senior",userDemography.getUserTitle());
    }
}
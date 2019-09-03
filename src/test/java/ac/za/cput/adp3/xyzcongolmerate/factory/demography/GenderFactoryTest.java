package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {

        String description="male";

             Gender gender=GenderFactory.buildGender(description);
             System.out.println(gender);
        Assert.assertNotNull(gender);
        Assert.assertEquals(description,gender.getGenderDescription());
    }
}
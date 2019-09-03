package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {
        String roleName="HR";

        Role role=RoleFactory.buildRole(roleName);
        System.out.println(role);
        Assert.assertNotNull(role);
        Assert.assertEquals(roleName,role.getRoleName());
    }
}
package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {

         User user = UserFactory.buildUser("johnstones@gmail.com","John","Stones");
        Organisation organisation=OrganisationFactory.buildOrganisation("PPP");

        OrganisationUser organisationUser=OrganisationUserFactory.buildOrganisationUser(organisation.getOrgCode(),user.getUserEmail());
        System.out.println(organisationUser);
        Assert.assertNotNull(organisationUser);
        Assert.assertEquals("johnstones@gmail.com",organisationUser.getUserEmail());
    }
}
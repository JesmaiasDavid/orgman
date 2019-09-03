package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {
        String orgName;
        orgName="PPP";

        Organisation organisation =OrganisationFactory.buildOrganisation(orgName);
        System.out.println(organisation);
        Assert.assertNotNull(organisation);
        Assert.assertEquals(orgName,organisation.getOrgName());
    }
}
package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {


    @Test
    public void buildRace() {
        String description="black";

        Race race=RaceFactory.buildRace(description);
        System.out.println(race);
        Assert.assertNotNull(race);
        Assert.assertEquals(description,race.getRaceDescription());
    }
}
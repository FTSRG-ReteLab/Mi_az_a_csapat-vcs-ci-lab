package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainTachographTest {
    private TrainTachograph tachograph;

    @Before
    private void before() {
        tachograph = new TrainTachograph();
    }

    @Test
    private void hasValuesTest() {
        Assert.assertFalse(tachograph.values.isEmpty());
    }
}

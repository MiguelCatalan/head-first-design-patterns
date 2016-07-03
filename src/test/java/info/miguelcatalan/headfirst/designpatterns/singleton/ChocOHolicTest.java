package info.miguelcatalan.headfirst.designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ChocOHolicTest {

    @Test
    public void shouldGetAInstanceOfChocolateBoiler() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        assertNotNull(chocolateBoiler);
    }
}

package info.miguelcatalan.headfirst.designpatterns.adapter;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTestDrive {

    @Test
    public void shouldBeAWildTurkey() {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        assertEquals("Look at me, I'm a WildTurkey", turkeyAdapter.display());
    }

    @Test
    public void shouldWildTurkeyGobble() {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        assertEquals("Gobble gobble", turkeyAdapter.performQuack());
    }

    @Test
    public void shouldTurkeyGobbleFlyInShortDistances() {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        assertEquals("I'm flying a short distance", turkeyAdapter.performFly());
    }
}

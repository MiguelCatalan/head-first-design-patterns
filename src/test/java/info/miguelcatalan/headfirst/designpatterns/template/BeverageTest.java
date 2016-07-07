package info.miguelcatalan.headfirst.designpatterns.template;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BeverageTest {

    @Test
    public void shouldTeaBeACaffeineBeverage() {
        Tea tea = new Tea();

        assertThat(tea, instanceOf(CaffeineBeverage.class));
    }

    @Test
    public void shouldPrepareTea() {
        Tea tea = new Tea();

        tea.prepareRecipe();

        assertThat(tea.getRecipeUsed(), is(getTeaRecipe()));
    }

    @Test
    public void shouldCoffeeBeACaffeineBeverage() {
        Coffee coffee = new Coffee();

        assertThat(coffee, instanceOf(CaffeineBeverage.class));
    }

    @Test
    public void shouldPrepareCoffee() {
        Coffee coffee = new Coffee();

        coffee.prepareRecipe();

        assertThat(coffee.getRecipeUsed(), is(getCoffeeRecipe()));
    }

    private List<String> getTeaRecipe() {
        List<String> steps = new ArrayList<String>();
        steps.add("Boil water");
        steps.add("Steep tea");
        steps.add("Pour into cup");
        steps.add("Add some lemon");
        return steps;
    }

    private List<String> getCoffeeRecipe() {
        List<String> steps = new ArrayList<String>();
        steps.add("Boil water");
        steps.add("Drip coffee through filter");
        steps.add("Pour into cup");
        steps.add("Add sugar and milk");
        return steps;
    }
}

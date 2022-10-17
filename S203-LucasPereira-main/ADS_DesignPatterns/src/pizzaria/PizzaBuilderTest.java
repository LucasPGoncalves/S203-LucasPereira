package pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaBuilderTest {

	@Test
	public void test() {
		Pizza pizza = new PizzaBuilder()
			.setSize(1)
			.addChesse()
			.addPepperoni()
			.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}

}

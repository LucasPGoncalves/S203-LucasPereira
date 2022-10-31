package builder.pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaBuilderTest {

	@Test
	void deveConstruirPizzaValida() {
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

	@Test
	void deveInvalidarPizzaComTamanhoErrado(){
		try{
			Pizza pizza = new PizzaBuilder()
					.setSize(9)
					.addChesse()
					.addPepperoni()
					.getPizza();

			fail("Devia ter lancado exception");
		} catch (IllegalStateException e){
			e.printStackTrace();
		}
	}

	@Test
	void deveInvalidarPizzaSemIngredientes(){
		try{
			Pizza pizza = new PizzaBuilder()
					.setSize(2)
					.getPizza();

			fail("Devia ter lancado exception");
		} catch (IllegalStateException e){
			e.printStackTrace();
		}
	}
}

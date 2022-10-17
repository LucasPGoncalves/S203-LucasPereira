package pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addChesse() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public void validarIngredientes() {
		if(pizza.getFlagCheese() == null && pizza.getFlagPepperoni() == null) {
			throw new IllegalStateException("Sem Ingredientes");
		}
	}
	
	public void validarTamanho() {
		if(pizza.getSize() == null || pizza.getSize() > 3) {
			throw new IllegalStateException("Tamanho Invalido");
		}
	}
	
	public Pizza getPizza() {
		validarIngredientes();
		validarTamanho();
		return pizza;
	}
}

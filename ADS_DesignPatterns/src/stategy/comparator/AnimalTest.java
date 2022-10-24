package stategy.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class AnimalTest {
	
	
	@Test
	public void deveListarAnimaisPeloNome() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		Animal a6 = new Animal(6L, "Gato");
		
		listaDeAnimais.add(a1);
		listaDeAnimais.add(a2);
		listaDeAnimais.add(a3);
		listaDeAnimais.add(a4);
		listaDeAnimais.add(a5);
		listaDeAnimais.add(a6);
		
		System.out.println("Lista Original: ");
		listaDeAnimais.forEach( a -> System.out.println(a));
		
		listaDeAnimais.sort(new ComparadorPorNome());
		
		System.out.println("Lista Ordenada Por Nome: ");
		listaDeAnimais.forEach( a -> System.out.println(a));
		
		
	}
	
	@Test
	public void deveOrdenarListaDeAnimaisPeloID() {

			List<Animal> listaDeAnimais = new ArrayList<>();
			Animal a1 = new Animal(3L, "Tartaruga");
			Animal a2 = new Animal(9L, "Coelho");
			Animal a3 = new Animal(4L, "Cachorro");
			Animal a4 = new Animal(8L, "Gato");
			Animal a5 = new Animal(7L, "Girafa");
			Animal a6 = new Animal(1L, "Gato");
			
			listaDeAnimais.add(a1);
			listaDeAnimais.add(a2);
			listaDeAnimais.add(a3);
			listaDeAnimais.add(a4);
			listaDeAnimais.add(a5);
			listaDeAnimais.add(a6);
			
			listaDeAnimais.sort( Comparator.comparing(Animal::getId));
			System.out.println("Lista Ordenada Pelo ID: ");
			listaDeAnimais.forEach(a -> System.out.println(a));
	}
}

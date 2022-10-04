package builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroBuilderFluenteTest {

	@Test
	public void test() {
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		Carro carro = new CarroBuilderFluente()
		.buildMotor(motorVTEC)
		.buildPortas(portas)
		.buildComputadorBordo(computadorBordoSiemens)
		.buildFreioABS(freioBosch)
		.getCarro();
		
		assertNotNull(carro);
		assertNotNull(carro.getMotor());
		assertNotNull(carro.getPortas());
		assertNotNull(carro.getComputadorbordo());
		assertNotNull(carro.getFreioABS());
		assertEquals(carro.getPortas().length, 2);
	}

}

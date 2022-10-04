package builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroBuilderTest {

	@Test
	public void deveConstuirUmCarro() {
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		
		
		Carro carroPronto = builder.getCarro();
		
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPortas());
		assertNotNull(carroPronto.getComputadorbordo());
		assertNotNull(carroPronto.getFreioABS());
		assertEquals(carroPronto.getPortas().length, 2);
	}

}

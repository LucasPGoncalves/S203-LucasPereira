package builder;

public class CarroBuilderFluente {
	
	private Carro carro;
	
	public CarroBuilderFluente() {
		carro = new Carro();
	}

	public CarroBuilderFluente buildPortas(Porta portas[]) {
		carro.setPortas(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor m) {
		carro.setMotor(m);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorbordo(cb);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;
	}
	
	private void validarPorta() {
		if(carro.getPortas() == null) {
			throw new IllegalStateException("Sem Porta");
		}
		
		int numeroPortas = carro.getPortas().length;
		if(numeroPortas != 2 && numeroPortas != 4) {
			throw new IllegalStateException("Numero de Portas Ilegal");
		}
	}
	
	private void validarMotor() {
		if(carro.getMotor() == null) {
			throw new IllegalStateException("Sem Motos");
		}
	}
	
	public Carro getCarro() {
		validarPorta();
		validarMotor();
		return carro;
	}
}


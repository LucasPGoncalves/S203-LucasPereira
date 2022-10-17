package builder;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
	}

	void buildPortas(Porta portas[]) {
		carro.setPortas(portas);
	}
	
	void buildMotor(Motor m) {
		carro.setMotor(m);
	}
	
	void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorbordo(cb);
	}
	
	void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
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


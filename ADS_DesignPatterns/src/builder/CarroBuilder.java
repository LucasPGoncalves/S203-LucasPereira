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
}


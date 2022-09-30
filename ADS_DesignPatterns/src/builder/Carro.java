package builder;

public class Carro {
	
	private Porta[] portas;
	
	private Motor motor;
	
	private ComputadorBordo computadorbordo;
	
	private FreioABS freioABS;
	
	
	//acessores gerados com Ctrl + 3 > ggas
	
	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public ComputadorBordo getComputadorbordo() {
		return computadorbordo;
	}

	public void setComputadorbordo(ComputadorBordo computadorbordo) {
		this.computadorbordo = computadorbordo;
	}

	public FreioABS getFreioABS() {
		return freioABS;
	}

	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
	
	
	
}

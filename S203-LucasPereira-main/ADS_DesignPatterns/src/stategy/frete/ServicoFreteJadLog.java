package stategy.frete;

public class ServicoFreteJadLog implements Fretavel {
    @Override
    public double calculaValor(double pesoEmKg){
        //jadlog
            if(pesoEmKg < 30.00){
                return 0.00;
            } else {
                return 150.00;
            }
    }
}

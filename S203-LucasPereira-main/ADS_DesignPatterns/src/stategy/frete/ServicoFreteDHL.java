package stategy.frete;

public class ServicoFreteDHL implements Fretavel {
    @Override
    public double calculaValor(double pesoEmKg){
        //dhl
            if(pesoEmKg < 20.00){
                return 100.00;
            } else{
                return 90.00;
            }
    }
}

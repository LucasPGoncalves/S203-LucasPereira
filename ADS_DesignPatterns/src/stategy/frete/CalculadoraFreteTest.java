package stategy.frete;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraFreteTest {

    @Test
    void deveCalcularFreteParaDHL(){
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorObtido = calculadora.calculaValor("dhl", 10.0);
        assertEquals(valorObtido, 100.0);
    }

    @Test
    void deveCalcularFreteParaSedex(){
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorObtido = calculadora.calculaValor("sedex", 10.0);
        assertEquals(valorObtido, 70.00);
    }

    @Test
    void deveCalcularFreteParaJadLog() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorObtido = calculadora.calculaValor("jadlog", 10.0);
        assertEquals(valorObtido, 0);
    }

    @Test
    void deveLancarExceptionParaServicoDesconhecido(){
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorObtido = calculadora.calculaValor("awa", 10.0);
    }
}

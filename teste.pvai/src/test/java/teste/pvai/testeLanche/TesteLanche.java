package teste.pvai.testeLanche;

import org.junit.Test;
import teste.pvai.lanche.Lanche;

import static org.junit.Assert.assertEquals;

public class TesteLanche{

    @Test
    public void testeXBacon(){
        int codigo = 3;
        int quantidade = 2;
        double saidaEsperada = 10;

        double respostaObtida = Lanche.calcularValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada,respostaObtida);
    }
}
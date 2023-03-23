package teste.pvai.ordenacao;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestaOrdenacao {
	
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();
	//Saída esperada
	@Test()
	public void numeroDeElementosNegativo() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Tamanho Inválido do vetor");
		
		//Entrada
		int n = -1;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	@Test()
	public void numeroDeElementosInformadoDiferenteDoVetor() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Número de elementos divergente do" + "informado");
		
		//Entrada
		int n = 10;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	@Test
	public void elementosDoVetorOrdenados() {
		
		//Entrada
		int n = 5;
		int elementos[] = {1,2,3,4,5};
		
		//Saída esperada
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
	
	@Test
	public void elementosDoVetorDecrescente() {
		
		//Entrada
		int n = 5;
		int elementos[] = {5,4,3,2,1};
		
		//Saída esperada
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
	
	@Test
	public void elementosDoVetorAleatorios() {
		
		//Entrada
		int n = 5;
		int elementos[] = {7,2,3,1,4};
		
		//Saída esperada
		int saidaEsperada[] = {1,2,3,4,7};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
}
 
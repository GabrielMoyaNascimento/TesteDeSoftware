package teste.pvai.ordenacao;

import java.util.Arrays;

public class OrdenaVetor {

	public static int[] sort (int n, int[] elementos) {
		if(n < 0 || n > 65530) {
			throw new IndexOutOfBoundsException("Tamanho Inválido do vetor");
		}
		if(n != elementos.length) {
			throw new IndexOutOfBoundsException("Número de elementos divergente do" + "informado");
		}
		Arrays.sort(elementos);
		
		return elementos;
	}
}
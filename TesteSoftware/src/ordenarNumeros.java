import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ordenarNumeros {
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.print("Digite a quantidade de números a serem ordenados: ");
        int quantidade = sc.nextInt();
        
        if (quantidade < 0 || quantidade > 65530) {
            System.out.println("Tamanho inválido do vetor.");
            System.exit(0);
        }
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            
            try {
                numeros.add(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Conteúdo inválido do arquivo.");
                System.exit(0);
            }
        }
        
        if (numeros.size() != quantidade) {
            System.out.println("Número de elementos divergente do informado.");
            System.exit(0);
        }
        
        System.out.println("Números originais: " + numeros);
        Collections.sort(numeros);
        
        System.out.println("Números ordenados: " + numeros);
        sc.close();
    }
    
}

package jogodado;

import java.util.Random;

public class jogodado {

    public static void main(String[] args) {
        // Número de simulações
        int numSimulacoes = 100;

        // Contador para contar quantas vezes a soma é 7
        int contagemSomaSete = 0;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        for (int i = 0; i < numSimulacoes; i++) {
            // Simula o lançamento de dois dados
            int dado1 = random.nextInt(6) + 1; // Números de 1 a 6
            int dado2 = random.nextInt(6) + 1; // Números de 1 a 6

            // Calcula a soma dos dois dados
            int soma = dado1 + dado2;

            // Verifica se a soma é igual a 7
            if (soma == 7) {
                contagemSomaSete++;
            }
        }

        // Imprime o resultado da simulação
        System.out.println("Resultado da simulação:");
        System.out.println("Número total de simulações: " + numSimulacoes);
        System.out.println("Número de vezes que a soma foi 7: " + contagemSomaSete);
    }
}

import java.util.Scanner;

public class NewtonSqrt {
    
    // Função para calcular a raiz quadrada usando Newton-Raphson
    public static double raizQuadrada(double numero, double precisao) {
        double aproximacao = numero; // Chute inicial
        
        while (Math.abs(aproximacao * aproximacao - numero) > precisao) {
            aproximacao = (aproximacao + numero / aproximacao) / 2.0;
        }
        
        return aproximacao;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número para calcular a raiz quadrada: ");
            double numero = scanner.nextDouble();
            
            System.out.print("Digite o valor de precisão (ex: 0.0001): ");
            double precisao = scanner.nextDouble();
            
            double resultado = raizQuadrada(numero, precisao);
            
            System.out.println("A raiz quadrada de " + numero + " é aproximadamente: " + resultado);
        }
    }
}

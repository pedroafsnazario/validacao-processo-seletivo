import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("===DESAFIO CONTROLE DE FLUXO DIO===");
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        
        try {
            System.out.println("======");
            contar(parametroUm, parametroDois);
            System.out.println("======");
        }
        
        catch(ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        System.out.println("===================================");
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++) {
            
            System.out.println(i);
            
        }
       }

    }


package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       System.out.println("===PROCESSO SELETIVO===");
       //selecaoCandidatos(); -> Com base nos 10 candidatos ele vai selecionar aqueles com Salário Pretendido menor ou igual ao salario base
       //analisarCandidato(1900.0);
       //analisarCandidato(2200.0);
       //analisarCandidato(2000.0);
       imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String candidatos [] = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos, informando o indice do elemento.");
        
        //Uso de for e numeração
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice+1) + " é o" + candidatos[indice]);
        }

        //Forma abreviada de interação > for/each
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String candidatos [] = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

       int candidatosSelecionados = 0;
       int candidatosAtual = 0;
       double salarioBase = 2000.0;
       while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("> o candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("> o candidato " + candidato + " foi selecionado para a vaga.");
            candidatosSelecionados++;
        }
        else {
            System.out.println("> Candidato " + candidato + " não foi selecionado.");
        }

        candidatosAtual++;
       }
       System.out.println("===Todos os candidatos foram escolhidos.===");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta.");
        }
        else {
            System.out.println("Aguardando resultado dos demais candidatos..");
        }

    }
}

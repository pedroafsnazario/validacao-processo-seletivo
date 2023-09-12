package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       System.out.println("===PROCESSO SELETIVO===");
        selecaoCandidatos();
       //analisarCandidato(1900.0);
       //analisarCandidato(2200.0);
       //analisarCandidato(2000.0);
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

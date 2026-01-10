package Extras.projetos.resolucao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Transicao> tabelaTransicao = new HashMap<>();

        tabelaTransicao.put("q0_1", new Transicao('1', 'D', "q0"));
        tabelaTransicao.put("q0_0", new Transicao('0', 'D', "q0"));
        tabelaTransicao.put("q0__", new Transicao('_', 'E', "q1"));

        tabelaTransicao.put("q1_0", new Transicao('1', 'E', "qf"));
        tabelaTransicao.put("q1_1", new Transicao('0', 'E', "q1"));
        tabelaTransicao.put("q1_", new Transicao('_', 'N', "qf"));

        Set<String> estadosFinais = new HashSet<>(Collections.singletonList("qf"));

        MaquinaTuring maquina = new MaquinaTuring("0010_", tabelaTransicao, "q0", estadosFinais);
        maquina.rodar();
    }
}

class MaquinaTuring {
    private List<Character> fita;
    private int cabeca;
    private String estadoAtual;
    private Map<String, Transicao> tabelaTransicao;
    private Set<String> estadosFinais;
    private Set<String> historicoEstados = new HashSet<>();

    public MaquinaTuring(String entrada, Map<String, Transicao> tabelaTransicao, String estadoInicial, Set<String> estadosFinais) {
        this.fita = new ArrayList<>();
        for (char c : entrada.toCharArray()) {
            fita.add(c);
        }

        this.cabeca = 0;
        this.estadoAtual = estadoInicial;
        this.tabelaTransicao = tabelaTransicao;
        this.estadosFinais = estadosFinais;
    }

    public void rodar() {
        while (!estadosFinais.contains(estadoAtual)) {
            char simboloAtual = (cabeca < fita.size()) ? fita.get(cabeca) : '_';
            String chave = estadoAtual + "_" + simboloAtual;
            System.out.println("Processando chave: " + chave);

            if (historicoEstados.contains(chave + cabeca)) {
                System.out.println("Loop detectado! Encerrando execução.");
                break;
            }
            historicoEstados.add(chave + cabeca);

            Transicao transicao = tabelaTransicao.get(chave);
            if (transicao == null) {
                System.out.println("Nenhuma transição encontrada para: " + chave);
                break;
            }

            fita.set(cabeca, transicao.simboloParaEscrever);
            
            if (transicao.direcaoMover == 'D') {
                cabeca++;
                if (cabeca >= fita.size()) {
                    fita.add('_');
                }
            } else if (transicao.direcaoMover == 'E') {
                cabeca = Math.max(0, cabeca - 1);
            }

            estadoAtual = transicao.proximoEstado;
            mostrarFita();
        }
    }

    private void mostrarFita() {
        for (char c : fita) {
            System.out.printf("%s", c);
        }
        System.out.println("\nEstado: " + estadoAtual + " | Cabeça: " + cabeca);
    }
}

class Transicao {
    char simboloParaEscrever;
    char direcaoMover;
    String proximoEstado;

    public Transicao(char simboloParaEscrever, char direcaoMover, String proximoEstado) {
        this.simboloParaEscrever = simboloParaEscrever;
        this.direcaoMover = direcaoMover;
        this.proximoEstado = proximoEstado;
    }
}

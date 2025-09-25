public class Aula_2 {
    public static void main(String[] args) {
        deposito(8, 112, 74, 30); // argumentos
    }

    static void deposito(int truck, int boxes, int units, int days){
        System.out.println(truck*boxes*days);

        // static void -> declaracao padrao
        // deposito -> NOME DA FUNCAO, geralmente usamos verbos para definir o que é a funcao
        // () -> parenteses, usamos para definir o que chegará naquela funcao
        // (tipo nomeDaVarivel)
        // {} -> bloco de codigo que sera executado
    }

    // precisamos criar um método main para executar o código
    // o método main é o ponto de entrada do programa
    // Calcular a quantidade de caixas que entra num deposito
    // sabendo que por dia é descarregado 8 caminhões 
    // e cada caminhão tem 112 caixas
    // e cada caixa tem 74 unidades de produto.
    // quantas caixas serão armazenadas por mês (30 dias)?
    
    
}

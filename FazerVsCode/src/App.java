import java.util.Scanner;

public class App {
        //Comentário

    public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        //variável local 
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.printf(v2+" "+v1);
    }


    // public class Calculadora {

        public static void main(String[] args) throws Exception {
            Operadores op = new Operadores();

            // Operadores Aritméticos
            System.out.println("O resultado: é " + op.adicao(10,5));
            System.out.println("O resultado: é " + op.subtracao(10,5));
            System.out.println("O resultado: é " + op.multiplicacao(10,5));
            System.out.println("O resultado: é " + op.divisao(10,5));

            // Operadores de Atribuição
            System.out.println(op.atribuicaoSoma(10, 5));
            System.out.println(op.atribuicaoSubtracao(10, 5));
            System.out.println(op.atribuicaoMultiplicacao(10, 5));
            System.out.println(op.atribuicaoDividao(10, 5));
            System.out.println(op.atribuicaoSimples(10, 5));

            // Operadores de Comparação
            System.out.println(op.comparacaoIgual(10, 5));
            System.out.println(op.comparacaoDiferente(10, 5));
            System.out.println(op.comparacaoMenorQue(10, 5));
            System.out.println(op.comparacaoMaiorQue(10, 5));
            System.out.println(op.comparacaoMenorOuIgual(10, 5));
            System.out.println(op.comparacaoMaiorOuIgual(10, 5));

            // Operadores Lógicos
            System.out.println(op.logicoE(true, false));
            System.out.println(op.logicoOu(true, false));
            System.out.println(op.logicoOuExclusivo(true, false));
            System.out.println(op.logicoNao(true));
}


    }
// }

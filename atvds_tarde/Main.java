import java.util.Scanner; //Importamos o scanner
public class Main { //Classe Main
   public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); //Definimos o scanner

    System.out.println("Escreva o tamanho do lado:"); //Para o usuario definir o tamanho do lado
    float lado = scanner.nextFloat();


    System.out.println("Escreva a altura do triangulo:");//Para o usuario definir a altura do triangulo
    float altura = scanner.nextFloat();

    System.out.println("Escreva a base do triangulo:"); //Para o usuario definir a base do triangulo
    float base = scanner.nextFloat();

    Quadrado quadrado = new Quadrado(lado, 0); //Fizemos um objeto Quadrado
   Triangulo triangulo = new Triangulo(base, base, altura); //Fizemos um objeto Triangulo

    triangulo.exibirDetalhes(); //Funçao para exibir detalhes do triangulo

    quadrado.exibirDetalhes(); //Funçao para exibir detalhes do quadrado

    scanner.close(); //Fechamento do scanner
   }
}  //FEITO POR WILIAM KENZO, GIOVANA GOMES E JULIA DA SILVA
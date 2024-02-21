import java.util.Scanner; //biblioteca para habilitar a entrada de dados

public class MediaNotas {
    public static void main(String[] args) {
        double nota1, nota2,nota3, nota4;
        double media;

        Scanner scanner = new Scanner(System.in);  //Scanner importa a biblioteca automaticamente

        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextDouble(); //declarando a variavel que vai ser usada como tipo double
        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextDouble(); //declarando a variavel que vai ser usada como tipo double
        System.out.println("Digite a nota 3: ");
        nota3 = scanner.nextDouble(); //declarando a variavel que vai ser usada como tipo double
        System.out.println("Digite a nota 4: ");
        nota4 = scanner.nextDouble(); //declarando a variavel que vai ser usada como tipo double

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A media do aluno é: " + media); //sout
        System.out.printf("A média do aluno é: %.2f \n",media); //souf para mostrar com 2 casas decimais

        if(media < 30){
            //Reprovado
            System.out.println("Aluno Reprovado, com média: ");
        } else if(media >= 30 && media < 70){
            //Exame Final
            System.out.println("Aluno em exame final!");
        }else {
            //Aprovado
            System.out.println("Aluno aprovado!!!");
        }
    }
}

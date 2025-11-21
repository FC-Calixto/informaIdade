import java.time.Year;
import java.util.Scanner;

public class informaIdade {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: Validar nome do usuário
        //Não permitir números
        //Não permitir caracteres
        //Limitar quantidade de caracteres
        //Não permitir em branco ou nulo
        //Solicitar o nome do usuário
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        //TODO: Validar ano de nascimento do usuário
        //Não permitir letras
        //Não permitir caracteres
        //Limitar quantidade de caracteres
        //Formatar para AAAA
        //Não permitir em branco ou nulo
        //Ano informado tem que ser menor do que ano atual
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        //Calcular a idade do usuário
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        //Exibir a idade do usuário
        System.out.println("Olá " + nome + ", você têm " + idade + " anos.");

        scanner.close();
    }
}

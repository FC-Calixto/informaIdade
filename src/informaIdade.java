import java.time.Year;
import java.util.Scanner;

public class informaIdade {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar o nome do usuário
        String nome;
            while (true) {
                System.out.println("Digite o seu nome: (somente letras, espaços, até 50 caracteres)");
                nome = scanner.nextLine().trim();

                //Não permitir em branco ou nulo
                if (nome.isEmpty()) {
                    System.out.println("Erro: O nome não pode estar em branco!");
                    continue;
                }

                //Limitar quantidade de caracteres
                if (nome.length() > 50) {
                    System.out.println("Erro: O nome não pode exceder 50 caracteres!");
                    continue;
                }

                //Não permitir caracteres
                //Não permitir números
                if (!nome.matches("[\\p{L} ]+")) {
                    System.out.println("Erro: O nome deve conter apenas letras e espaços!");
                    continue;
                }
                break;
            }

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

import java.time.Year;
import java.util.Scanner;

public class informaIdade {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: Calcular a idade baseada na data de nascimento no formato DD/MM/AAAA

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

        //Solicitar ano de nascimento do usuário
        int anoNascimento = 0;
        int anoAtual = Year.now().getValue();

            while (true) {
                System.out.println("Digite o seu ano de nascimento: (Formato AAAA)");
                String inputAno = scanner.nextLine().trim();

                //Não permitir em branco ou nulo
                if (inputAno.isEmpty()) {
                    System.out.println("Erro: O ano de nascimento não pode estar em branco.");
                    continue;
                }

                //Validar formato AAAA
                if (!inputAno.matches("\\d{4}")) {
                    System.out.println("Erro: O ano deve conter exatamente 4 dígitos numéricos.");
                    continue;
                }

                //Não permitir letras e caracteres
                try {
                    anoNascimento = Integer.parseInt(inputAno);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Entrada inválida. Digite apenas números.");
                    continue;
                }

                //Validar ano de nascimento menor que o ano atual
                if (anoNascimento >= anoAtual) {
                    System.out.println("Erro: O ano de nascimento deve ser menor que o ano atual (" + anoAtual + ").");
                    continue;
                }
                break;
            }

        //Calcular a idade do usuário
        int idade = anoAtual - anoNascimento;

        //Exibir a idade do usuário
        System.out.println("Olá " + nome + ", você têm " + idade + " anos.");

        scanner.close();
    }
}

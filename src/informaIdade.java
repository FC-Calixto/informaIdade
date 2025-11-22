import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

        //Solicitar data de nascimento do usuário
        LocalDate dataNascimento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();

            while (true) {
                System.out.println("Digite sua data de nascimento: (Formato DD/MM/AAAA)");
                String inputData = scanner.nextLine().trim();

                //Não permitir em branco ou nulo
                if (inputData.isEmpty()) {
                    System.out.println("Erro: O ano de nascimento não pode estar em branco.");
                    continue;
                }

                //Remover caracteres não numéricos
                inputData = inputData.replaceAll("[^0-9]", "");

                //Inserir barras para formatar no padrão DD/MM/AAAA
                if (inputData.length() == 8) {
                    inputData = inputData.substring(0, 2) + "/"
                            + inputData.substring(2, 4) + "/"
                            + inputData.substring(4, 8);
                }

                //Não permitir data futura
                //Validar formato DD/MM/AAAA
                try {
                    dataNascimento = LocalDate.parse(inputData, formatter);

                    if (dataNascimento.isAfter(hoje)) {
                        System.out.println("Erro: A data de nascimento não pode ser futura");
                        continue;
                    }

                } catch (DateTimeException e) {
                    System.out.println("Erro: Entrada inválida. Use o formato DD/MM/AAAA, com dia e mês válidos.");
                    continue;
                }
                break;
            }

        //Calcular a idade do usuário
        int idade = Period.between(dataNascimento, hoje).getYears();

        //Exibir a idade do usuário
        System.out.println("Olá " + nome + ", você têm " + idade + " anos.");

        scanner.close();
    }
}

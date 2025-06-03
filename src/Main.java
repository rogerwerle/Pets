import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirForm();

        while (true) {
            exibirMenu();
            String entrada = scanner.nextLine();

            if(!entrada.matches("\\d+")) {
                System.out.println("Digite apenas números positivos.");
                continue;
            }

            int opcao = Integer.parseInt(entrada);
            if (opcao < 1 || opcao > 6) {
                System.out.println("Escolha uma opção válida. (1 - 6)");
                continue;
            }
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        }
    }

    private static void exibirForm() {
        File file = new File ("form.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exibirMenu() {
        System.out.println("\n==== Menu Inicial ====");
        System.out.println("1 - Cadastrar um novo pet");
        System.out.println("2 - Alterar os dados do pet cadastrado");
        System.out.println("3 - Deletar um pet cadastrado");
        System.out.println("4 - Listar todos os pets cadastrados");
        System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
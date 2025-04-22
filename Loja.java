import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    // Construtor
    public Loja(String nome) {
        this.nome = nome;
    }

    // Métodos de gerenciamento
    public void empregarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void demitirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void listarFuncionarios() {
        System.out.println("\nFuncionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void listarClientes() {
        System.out.println("\nClientes:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void listarFornecedores() {
        System.out.println("\nFornecedores:");
        for (Fornecedor f : fornecedores) {
            System.out.println(f);
        }
    }

    // Main interativo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();
        Loja loja = new Loja(nomeLoja);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Cadastrar fornecedor");
            System.out.println("4. Listar funcionários");
            System.out.println("5. Listar clientes");
            System.out.println("6. Listar fornecedores");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeF = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endF = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telF = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Sexo (M/F): ");
                    char sexo = scanner.nextLine().charAt(0);
                    System.out.print("Estado Civil (número): ");
                    int estadoCivil = scanner.nextInt();
                    System.out.print("Matrícula: ");
                    int matricula = scanner.nextInt();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nomeF, endF, telF, cpf, sexo, estadoCivil, matricula, salario, cargo);
                    loja.empregarFuncionario(funcionario);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeC = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endC = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telC = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfC = scanner.nextLine();
                    System.out.print("Sexo (M/F): ");
                    char sexoC = scanner.nextLine().charAt(0);
                    System.out.print("Estado Civil (número): ");
                    int estC = scanner.nextInt();
                    System.out.print("Renda: ");
                    double renda = scanner.nextDouble();
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Interesses: ");
                    String interesses = scanner.nextLine();
                    System.out.print("Profissão: ");
                    String profissao = scanner.nextLine();

                    Cliente cliente = new Cliente(nomeC, endC, telC, cpfC, sexoC, estC, renda, interesses, profissao);
                    loja.cadastrarCliente(cliente);
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeForn = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endForn = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telForn = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    System.out.print("Razão Social: ");
                    String razao = scanner.nextLine();
                    System.out.print("Produtos: ");
                    String produtos = scanner.nextLine();

                    Fornecedor fornecedor = new Fornecedor(nomeForn, endForn, telForn, cnpj, razao, produtos);
                    loja.cadastrarFornecedor(fornecedor);
                    break;

                case 4:
                    loja.listarFuncionarios();
                    break;

                case 5:
                    loja.listarClientes();
                    break;

                case 6:
                    loja.listarFornecedores();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

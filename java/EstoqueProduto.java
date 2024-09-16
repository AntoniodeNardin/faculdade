import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueProduto {
    private int idProduto;
    private String nomeProduto;
    private int quantidadeProduto;

    private static ArrayList<EstoqueProduto> estoque = new ArrayList<>();
    private static int contadorId = 1; 

    public EstoqueProduto(String nomeProduto, int quantidadeProduto) {
        this.idProduto = contadorId++;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    // Método para cadastrar produtos no estoque
    public static void cadastrarProduto(String nome, int quantidade) {
        EstoqueProduto produto = new EstoqueProduto(nome, quantidade);
        estoque.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso! ID: " + produto.getIdProduto());
    }

    // Método para remover produto do estoque pelo ID
    public static void removerProduto(int id) {
        boolean encontrado = false;
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getIdProduto() == id) {
                System.out.println("Produto " + estoque.get(i).getNomeProduto() + " removido com sucesso!");
                estoque.remove(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    // Método para exibir os produtos no estoque
    public static void exibirEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (EstoqueProduto produto : estoque) {
                System.out.println("ID: " + produto.getIdProduto() + " | Produto: " + produto.getNomeProduto() + " | Quantidade: " + produto.getQuantidadeProduto());
            }
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Remover Produto pelo ID");
            System.out.println("3 - Exibir Estoque");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // Cadastrar produto
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    cadastrarProduto(nomeProduto, quantidadeProduto);
                    break;
                case 2:
                    // Remover produto
                    System.out.print("Digite o ID do produto a ser removido: ");
                    int idProduto = scanner.nextInt();
                    removerProduto(idProduto);
                    break;
                case 3:
                    // Exibir estoque
                    exibirEstoque();
                    break;
                case 4:
                    // Sair
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (continuar);

        scanner.close();
    }
}

public class ListagemProdutos {
    public static void main(String[] args) {
        String nomeProduto1, nomeProduto2;
        double valorProduto1, valorProduto2;

        nomeProduto1="Livro";
        nomeProduto2="Celular";

        valorProduto1=49.95;
        valorProduto2=1470.76;

        System.out.println(">>> Listagem dos Produtos\n");
        System.out.println(exibirProduto(nomeProduto1,valorProduto1));
        System.out.println(exibirProduto(nomeProduto2,valorProduto2));



    }

    public static String exibirProduto(String produto, double valor) {
        return String.format("________________________________________________________\nNOME: %s\nPREÇO: R$ %.2f", produto, valor);
    }
}

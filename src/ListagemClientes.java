public class ListagemClientes {
    public static void main(String[] args) {
        String nomeCliente1, nomeCliente2;
        int anoNascimentoCliente1, anoNascimentoCliente2;

        nomeCliente1="Fulano";
        nomeCliente2="Sicrano";

        anoNascimentoCliente1=1980;
        anoNascimentoCliente2=2000;

        System.out.println(">>> Listagem dos Clientes\n");
        System.out.println(exibirCliente(nomeCliente1,anoNascimentoCliente1));
        System.out.println(exibirCliente(nomeCliente2,anoNascimentoCliente2));



    }

    public static String exibirCliente(String nome, int ano) {
        return String.format("________________________________________________________\nNOME: %s\nANO DE NASCIMENTO: %d", nome, ano);
    }
}

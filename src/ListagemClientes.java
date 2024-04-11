import java.util.Calendar;
import java.util.Date;

public class ListagemClientes {
    public static void main(String[] args) {
        String nomeCliente1, nomeCliente2;
        int anoNascimentoCliente1, anoNascimentoCliente2;

        nomeCliente1="Fulano";
        nomeCliente2="Sicrano";

        anoNascimentoCliente1=1980;
        anoNascimentoCliente2=2000;

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(new Date());

        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano Atual: " +calendario.get(Calendar.YEAR));
        System.out.println(exibirCliente(nomeCliente1,anoNascimentoCliente1));
        System.out.println(exibirCliente(nomeCliente2,anoNascimentoCliente2));

        //Testando novo cabeçalho
        System.out.println(retornarCabecalho(20));
        System.out.println(retornarCabecalho(40));

    }

    public static String exibirCliente(String nome, int ano) {
        return String.format("________________________________________________________\nNOME: %s\nANO DE NASCIMENTO: %d\nIdade: %d\nCaracterística Etária: %s", nome, ano,retornarIdade(ano),retornarClasseEtaria(retornarIdade(ano)));
    }

    public static int retornarIdade(int anoNascimento){
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(new Date());
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual-anoNascimento;
        return idade;
    }
    public static String retornarClasseEtaria(int idade){
        if (idade <= 17) {
            return "ADOLESCENTE";
        } else if (idade>=18 && idade<=29) {
            return "JOVEM";
        }else if (idade>=30 && idade<=59) {
            return "ADULTO";
        }else {
            return "IDOSO";
        }
    }
    public static String retornarCabecalho(int tamanho){
        String asteriscos="*";
        String cabecalho;
        for (int i = 0; i <= tamanho-1; i++) {
            asteriscos+="*";
        }
        cabecalho=asteriscos+"\nBem vindo ao COMEX\n"+asteriscos;
        return cabecalho;
    }
}

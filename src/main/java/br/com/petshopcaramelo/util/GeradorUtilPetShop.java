package br.com.petshopcaramelo.util;

/**
 *
 * @author jeferson.jesus
 */
public class GeradorUtilPetShop {

    public static String gerarNumero(int qtd) {
        String numeroGerado = "";
        int indice;
        for (int i = 0; i < qtd; i++) {
            indice = (int) (Math.random() * 10);
            numeroGerado += indice;
        }
        return numeroGerado;
    }

    public static String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "-" + gerarNumero(2);
    }

    public static String gerarSenha(int qtd) {
        String[] letras = {"a", "b", "c",
            "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0",
            "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String senha = "";
        int indice;
        for (int i = 0; i < qtd; i++) {
            indice = (int) (Math.random() * letras.length);
            senha += letras[indice];
        }
        return senha;
    }

    public static String gerarTelefoneFixo() {
        return "(48)" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public static String gerarTelefoneCelular() {
        return "(48) 9." + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public static String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/" + gerarNumero(4) + "-" + gerarNumero(2);
    }

    public static String gerarCp() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }
    
    public static String gerarComportamentos() {
        String[] comportamentos = {
            "Agressivo", "Medroso", "Normal"
        };
        int indice = (int) (Math.random() * comportamentos.length);
        return comportamentos[indice];
    }

    public static String gerarNome() {
        String[] nomes = {
            "Carlos", "Pedro", "Maria", "Ezequiel", "Bruna", "Adriele", "Morgana", "Barbara", "Joaquim", "Kiko", "Moacir", "Charlie", "Fabiana"
        };
        int indice = (int) (Math.random() * nomes.length);
        return nomes[indice] + " " + gerarSobrenome();
    }

    private static String gerarSobrenome() {
        String[] sobrenomes = {
            "Moraes", "Ribeiro", "Bento", "Silva", "Santos", "Garcia", "Gomes", "Gael", "Silveira", "Panizzi", "Mattos", "Belmont", "Brasil", "Pinto"
        };
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }

    public static String gerarnomeCompleto() {
        return gerarNome() + " " + gerarSobrenome();
    }

    public static String geraLogin() {
        return gerarNome().toLowerCase() + gerarSobrenome().toLowerCase() + "@" + "gmail.com";
    }

    public static String gerarCidade() {
        String[] cidades = {"Palhoça", "São José", "Florianópolis", "Biguaçu", "Santo Amaro", "Rio das Antas"
        };
        int indice = (int) (Math.random() * cidades.length);
        return cidades[indice];
    }

    public static String gerarBairro() {
        String[] bairros = {
            "Areias", "Jardim Eldorado", "Cmapinas", "Centro", "Canasvieiras", "Inglese", "Santinho", "Lagoa", "Jurere"
        };
        int indice = (int) (Math.random() * bairros.length);
        return bairros[indice];
    }

    public static String gerarUf() {
        String[] ufs = {
            "SC", "SP", "RO", "PR", "GO", "MT", "AC", "RR", "RJ", "PI"
        };
        int indice = (int) (Math.random() * ufs.length);
        return ufs[indice];
    }
    
    public static void main(String[] args) {
        System.out.println("Numero Gerado " + gerarNumero(3));
        System.out.println("Cpf Gerado " + gerarCpf());
        System.out.println("Senha Gerada " + gerarSenha(5));
        System.out.println("Telefone Fixo Gerado " + gerarTelefoneFixo());
        System.out.println("Telefone Celular Gerado " + gerarTelefoneCelular());
        System.out.println("Cpnj Gerado " + gerarCnpj());
        System.out.println("Cp Gerado " + gerarCp());
        System.out.println("Nome Gerado: " + gerarNome());
        System.out.println("Sobrenome Gerado: " + gerarSobrenome());
        System.out.println("Nome Completo Gerado: " + gerarnomeCompleto());
        System.out.println("Login Gerado: " + geraLogin());
        System.out.println("Cidade Gerada: " + gerarCidade());
        System.out.println("Bairro Gerado: " + gerarBairro());
        System.out.println("UF Gerado: " + gerarUf());
    }
}

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Matheus";
        String segundoNome = "Santos de Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome)
    {
        return "concatenar livremente " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
 
public class BoletimAluno {
    
    public static void main(String[] args) {
        
        int notaAluno = 7;

        //validação
        if (notaAluno < 7)
            System.out.println("aluno reprovado");
        else if(notaAluno == 7 )
            System.out.println("Recuperação");
        else
            System.out.println("Aluno aprovado");
    }

}

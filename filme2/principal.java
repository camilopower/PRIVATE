import modelos.Filme;

public class principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("o poderoso chefao");
        meuFilme.setAnoDeLancamento(1979);
        meuFilme.setDuracaoEmMinutos(180);


       
 
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.SomaDasAvaliacoes);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
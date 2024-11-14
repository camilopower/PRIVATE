package modelos;
public class Filme  {


    private String nome;
    private double SomaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;
    private int anoDeLancamento;
    private boolean incluidoNoPLano;

    // Exibe ficha técnica do filme
    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    // Avalia o filme, adicionando uma nota
      public  void avalia(double nota) {
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String getNome() {
        return nome;
    }
    
    public int geAnoDeLancamento() {
        return anoDeLancamento;
    }
    
    public boolean getIncluidoNoPlano() {
        return incluidoNoPLano;
    }
    
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPLano = incluidoNoPlano;
    }
    
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }




    // Retorna a média das avaliações
    public double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0.0;  // Evita divisão por zero
        }
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }
}
    


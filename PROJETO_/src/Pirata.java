public class Pirata {
    protected String nome;
    protected String comidaFavorita;
    protected int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        cozinheiro.prepararPrato(index);
        // Aumenta o poder baseado na dificuldade da receita
        if (cozinheiro.getLivroDeReceitas().get(index).getNome() == this.comidaFavorita){
            this.poder = this.poder + (cozinheiro.getLivroDeReceitas().get(index).getDificuldade() * 2);
        } else {
            this.poder = this.poder + cozinheiro.getLivroDeReceitas().get(index).getDificuldade();
        }
    }

    public Pirata lutar(Pirata pirata){
        if (pirata.getPoder() > this.poder){
            System.out.println(pirata.getNome() + " foi o vencedor!");
            return pirata;
        } else {
            System.out.println(this.getNome() + " foi o vencedor!");
            return this;
        }
    }

    public int getPoder() {
        return poder;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pirata{" +
                "nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", poder=" + poder +
                '}';
    }
}

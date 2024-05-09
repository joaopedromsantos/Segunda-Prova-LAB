import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> livroDeReceitas;

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
        this.livroDeReceitas = new ArrayList<>();
    }

    public void adicionarReceita(Receita receita){
        livroDeReceitas.add(receita);
    }

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }

    public String prepararPrato(int index){
        return livroDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas(){
        for (Receita livroDeReceita : livroDeReceitas) {
            try {
                System.out.println(livroDeReceita);
            } catch (NullPointerException e) {
                System.out.println("Erro " + e);
            }
        }
    }

    @Override
    public String toString() {
        return "Cozinheiro{" +
                "livroDeReceitas=" + livroDeReceitas +
                ", nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", poder=" + poder +
                '}';
    }
}

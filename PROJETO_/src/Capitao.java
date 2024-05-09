public class Capitao extends Pirata implements Comandar{

    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }


    public void conquistarNovoSeguidor(Pirata pirata){
        if(this.poder > pirata.getPoder()){
            this.numeroDeSeguidores ++;
        } else {
            System.out.println("Não conquistou seguidor, ele era mais forte");
        }
    }
    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");
    }



    @Override
    public String toString() {
        return "Capitao{" +
                "numeroDeSeguidores=" + numeroDeSeguidores +
                ", nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", poder=" + poder +
                '}';
    }
}

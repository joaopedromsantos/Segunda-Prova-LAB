public class Main {
    public static void main(String[] args) {
        Capitao capitao_1 = new Capitao("Valdo", "Macarrão", 70, 6);
        Capitao capitao_2 = new Capitao("Kon", "Pipoca", 55, 2);

        Espadachim espadachim_1 = new Espadachim("Humberto", "Figo", 33, "Esperta");

        Receita receita_1 = new Receita("Figo", 15);
        Receita receita_2 = new Receita("Pipoca", 5);
        Receita receita_3 = new Receita("Macarrão", 20);
        Receita receita_4 = new Receita("Arroz", 2);

        Cozinheiro cozinheiro_1 = new Cozinheiro("Lin", "Arroz", 50);


        cozinheiro_1.adicionarReceita(receita_1);
        cozinheiro_1.adicionarReceita(receita_2);
        cozinheiro_1.adicionarReceita(receita_3);
        cozinheiro_1.adicionarReceita(receita_4);

        capitao_1.lutar(capitao_2);

        capitao_1.darOrdens();

        espadachim_1.mudarRota();

        capitao_1.mudarRota();

        capitao_1.conquistarNovoSeguidor(cozinheiro_1);

        capitao_1.comer(cozinheiro_1, 2);
        System.out.println(cozinheiro_1.prepararPrato(2));

        cozinheiro_1.comer(cozinheiro_1, 0);
        System.out.println(cozinheiro_1.prepararPrato(0));

        cozinheiro_1.mostrarReceitas();

        System.out.println(cozinheiro_1);
        System.out.println(capitao_1);
        System.out.println(capitao_2);
        System.out.println(espadachim_1);

    }
}
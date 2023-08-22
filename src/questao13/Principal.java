package questao13;

class Pai {
    public Pai() {
        System.out.println("Construtor Pai");
    }
}

class Filho extends Pai {
    public Filho() {
        super();
        System.out.println("Construtor Filho");
    }
}

/*
 Se for retirado o super do construtor da classe Filho, ainda sim o construtor da classe Pai será chamado, 
 pois , automaticamente o compilador adiciona o construtor da classe Pai na classe Filho.
 Isso ocorre pois, quando não é declarado nenhum construtor na classe, o compilador adiciona um construtor 
 padrão sem parâmetros.
 */


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/031Cn0sG)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11530239)
# Atividade: Composição, Herança, Sobrecarga e Sobrescrita

## Orientações

1. Cada uma das questões deve ser entregue dentro de um pacote. Exemplo: "questao01","questao02",...,"questaoXX".

1. Dentro de cada pacote deve ter uma classe chamada Principal que deverá ter o método main.

1. Para todas as atividades, utilize a classe Principal para criar instâncias de objetos das classes criadas e realizar testes.

1. Para todas as questões, sempre que possível, aplique os tópicos discutidos em sala até o momento.

# Atividades

1. Tendo como base a classe **Data**, construa duas versões da classe **DataHora** que além de armazenar a data também armazene a hora. Construa uma versão utilizando herança e outra versão usando composição.

1. Considere a classe DataHora e Data da questão anterior. Escreva na classe Data um método **ehIgual** que deve receber uma instância de Data e retornar um valor booleano indicando se a data da instância atual é igual a data passada como parâmetro. Escreva na classe DataHora um método **ehIgual** que deve receber uma instância de DataHora e retornar um valor booleano indicando se a data e hora da instância atual é igual a data e hora passada como parâmetro.

1. Observe o diagrama de classe abaixo e implemente as classes. Crie uma nova classe que contenha os atributos comuns entre Cliente e Funcionário. Reformule as duas classes citadas, aplicando o conceito de herança.

   ![Imagem](https://github.com/IFNMG-Almenara-Classes/heranca-01/blob/main/images/assets/funcionario_cliente/funcionario_cliente.svg)

1. Escreva uma classe Politico que estenda da classe Pessoa e tem um campo adicional para representar o partido. Escreva também as classes Prefeito e Governador que herdem da classe politico e que contenham campos para representar a cidade ou estado governado.

   ```java
   public class Pessoa {
       private String nome;
       private String cpf;
       private String rg;
       private String email;

       public Pessoa(String nome, String cpf, String rg, String email) {
           this.nome = nome;
           this.cpf = cpf;
           this.rg = rg;
           this.email = email;
       }

       [get/set...]
   }
   ```

1. Identifique, explique e corrija o(s) erro(s) nas classes abaixo.

   ```java
   class Ponto2D {
       private double x;
       private double y;

       public ponto2D(double _x, double _y) {
           this.x = _x;
           this.y = _y;
       }

       public String toString() {
           return "(" + x + "," + y + ")";
       }
   }
   ```

   ```java
   class Ponto3D extends Ponto2D {
       private double z;

       public ponto3D(double _x, double _y, double _z) {
           this.x = _x;
           this.y = _y;
           this.z = _z;
       }
   }
   ```

1. Utilizando a classe Ponto2D da questão anterior, escreva uma classe Ponto3D que herde de Ponto2D e que sobrescreva o método **toString** para que ele retorne uma string no formato **(x,y,z)**.

1. Utilizando sobrecarga de construtores, adicione a classe **Ponto3D** das questões anteriores um construtor que receba um objeto **Ponto2D** e um valor para z.

1. Tendo como base a classe **Ponto3D** apresentado nas questões anteriores reescreva a classe **Ponto3D** usando composição.

1. Utilizando sobrecarga de métodos, adicione a classe **Ponto2D** dois métodos para calcular a distância entre dois pontos. Um método deve receber um objeto **Ponto2D** e outro deve receber dois valores double. A distância entre dois pontos é dada por: $$\sqrt{(x_2-x_1)^2+(y_2-y_1)^2}$$ Utilize o método **Math.sqrt** para calcular a raiz quadrada.

1. Faça o mesmo da questão anterior com a classe **Ponto3D**. Lembrando que a distância entre dois pontos de três dimensões é dada por $$\sqrt{(x_2-x_1)^2+(y_2-y_1)^2+(z_2-z_1)^2}$$

1. Identifique e explique o(s) erro(s) na classe abaixo.

   ```java
   class DataHora extends Data,Hora
   {
       public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo)
       {
           super(dia, mes, ano);
           super(hora, minuto, segundo);
       }

       public String toString()
       {
           return super.toString() + " " + super.toString();
       }
   }
   ```

1. Identifique e explique o(s) erro(s) na classe abaixo.

   ```java
   class DataHora extends Data {
        private Hora hora;

        public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo)
        {
            this.hora = new Hora(hora, minuto, segundo);
            super(dia, mes, ano);
        }

        public String toString(){
            return super.toString() + " " + hora.toString();
        }
    }
   ```

1. Explique o que aconteceria se removêssemos a palavra-chave **super** da primeira linha do construtor da classe **Filho**.

   ```java
   class Pai {
       public Pai() {
           System.out.println("Construtor Pai");
       }
   }
   ```

   ```java
   class Filho extends Pai {
       public Filho() {
           super();
           System.out.println("Construtor Filho");
       }
   }
   ```

1. Explique o que aconteceria se removêssemos a palavra-chave **super** da primeira linha do construtor da classe **Cachorro** e substituíssemos por **super.nome = nome**.

   ```java
   class Animal {
       protected String nome;

       public Animal(String nome) {
           this.nome = nome;
       }
   }

   class Cachorro extends Animal {
       public Cachorro(String nome) {
           super(nome);
       }
   }
   ```

1. Analise o diagrama abaixo e identifique quais campos podem ser modificados diretamente pela classe filha e quais não podem. Explique o motivo.

   ![Imagem](https://github.com/IFNMG-Almenara-Classes/heranca-01/blob/main/images/assets/funcionario_gerente/funcionario_gerente.svg)

1. Crie uma classe chamada Ingresso que possua um atributo valor e um método getValorFinal() que retorne à informação do valor do ingresso. Em seguida crie uma classe IngressoVIP, que herda da classe Ingresso os atributos e comportamentos e acrescente um atributo **valorAdicional**. O método getValorFinal() da classe IngressoVIP deve considerar que o valor do ingresso é o valor da superclasse somado ao valor Adicional do IngressoVIP. Cada uma das classes deve possuir um construtor que receba o valor de seus atributos. Construa um diagrama de classe.

1. Escreva um classe chamada Figura que represente um objeto geométrico. Essa classe deve possuir um atributo chamado cor, seu posicionamento em um plano (x,y) e um método chamado **getArea()** que retorna a área da figura. Em seguida crie as classes **Circulo**, **Quadrado**, **Retângulo** e **Triangulo** que herdam da classe Figura. Cada uma das classes deve possuir um construtor que receba o valor de seus atributos. Construa um diagrama de classe.

   - Círculo: deve possuir um atributo raio. Use a fórmula da área do círculo para calcular a área. **Math.PI** é uma constante que representa o valor de π.
     $$π * raio² $$
   - Quadrado: deve possuir um atributo lado. Use a fórmula da área do quadrado para calcular a área.
     $$lado²$$
   - Retângulo: deve possuir dois atributos lado1 e lado2. Use a fórmula da área do retângulo para calcular a área do retângulo.
     $$lado1 * lado2$$
   - Triângulo: deve possuir três atributos, lado1, lado2 e lado3. Use a fórmula de Heron para calcular a área do triângulo. A fórmula de Heron é dada por: $$\sqrt{s(s-lado1)(s-lado2)(s-lado3)}$$, onde s é a metade da soma dos lados do triângulo.
     $$s = \frac{lado1+lado2+lado3}{2}$$
     Utilize Math.sqrt() para calcular a raiz quadrada.

1. Crie uma classe chamada **Pessoa** que possua os atributos **nome** e **idade**. Em seguida crie uma classe **Aluno** que herde da classe **Pessoa** e possua os atributos **matricula** e **curso**. Por fim crie uma classe **Professor** que herde da classe **Pessoa** e possua os atributos **salario** e **disciplina**. Construa um diagrama de classe.  

1. A sobrecarga de métodos é um recurso que permite que uma classe possua métodos com o mesmo nome, mas com assinaturas diferentes. Assinatura de um método é a combinação do nome do método com a lista de parâmetros. considere a classe abaixo e responda.

   ```java
   public class Calculadora {
       public int soma(int a, int b) {
           return a + b;
       }

       public double soma(int x, int y) {
           return x + b;
       }
   }
   ```

   Qual o problema da classe acima?

1. A classe PetShop é responsável por dar banho em Gatos e Cachorros.

   ```java
   public class PetShop {
       public void darBanhoNoGato(Gato gato) {
           gator.falar();
           System.out.println("Dando banho em " + gato.getNome());
       }

       public void darBanhoNoCahorro(Cachorro cachorro) {
           cachorro.falar();
           System.out.println("Dando banho em " + cachorro.getNome());
       }
   }
   ```

   ```java
   public class Gato {
       private String nome;

       public Gato(String nome) {
           this.nome = nome;
       }

       public String getNome() {
           return nome;
       }

       public void falar() {
           System.out.println("Miau");
       }
   }
   ```

   ```java
   public class Cachorro {
       private String nome;

       public Cachorro(String nome) {
           this.nome = nome;
       }

       public String getNome() {
           return nome;
       }

       public void falar(){
           System.out.println("Au au");
       }
   }
   ```

   Agora, o PetShop passará a dar banho também em coelhos e também em tartarugas. Para cada animal, obrigatoriamente deverá existir um nome.
   <img src="https://github.com/IFNMG-Almenara-Classes/heranca-01/blob/main/images/coelho.webp" width="80" align="right"/>

   a) Aplique herança e construa uma hierarquia de classes para representar os animas e seus subtipos.

   b) Adicione na classe PetShop novos métodos para dar banho no coelho e na tartaruga. Para evitar redundância nas assinaturas dos métodos darBanho, utilize sobrecarga de métodos.

1. Considere as classes **Circulo**, **Quadrado**, **Retângulo** e **Triangulo** desenvolvidas em questões anteriores. Construa uma classe **Painel** e utilizando sobrecarga escreva métodos **desenhar(...)** que recebam como parâmetro um objeto de cada uma das classes de figuras e imprima na tela a posição, a cor e a área da figura. Por exemplo, se o método desenhar receber um objeto do tipo Circulo, deve imprimir na tela:

   ```
   Circulo de cor azul, posição (10, 20) e área 314.1592653589793.
   ```

1. Sobrescrita de métodos é um recurso que permite que uma classe filha possua um método com o mesmo nome e assinatura de um método da classe pai. Considere a classe abaixo e responda.

   ```java
   public class Calculadora {
       public int soma(int a, int b) {
           return a + b;
       }
   }

   public class CalculadoraCientifica extends Calculadora {
       @Override
       public int soma(double a, double b) {
           return a + b;
       }
   }
   ```

   Qual o problema da classe acima?

1. Lembram do IFBank? Então, ele cresceu! e agora gostaria de fornecer diferentes modalidades de Contas aos seus clientes. Durante a conversa com a gestão do banco ficou decididos que deve existir 3 modalidades de conta. Cada conta deverá ter o titular (Um objeto da classe Cliente), um número e o saldo. Contudo as diferenças entre as contas são as seguintes:
   <img src="https://github.com/IFNMG-Almenara-Classes/heranca-01/blob/main/images/cartao_ifbank.png" width="250" align="right"/>

   a) **Conta Corrente**: Possui limite de crédito de R$ 500,00. Cada operação de saque custa R$ 1,50 e cada operação de transferência custa R$ 2,00.

   b) **Conta Corrente Vip**: Possui limite de crédito de R$ 2000,00. Cada operação de saque custa R$ 1,00 e cada operação de transferência custa R$ 1,50.

   c) **Conta Poupança**: Não possui limite de crédito. A cada depósito deve ser adicionado 0,5% sobre o valor depositado. Não há cobrança nas operações, mas não permite transferência para contas que não sejam do mesmo titular.

   Com base na descrição das contas, construa uma hierarquia de classe para representa-las.

1. Durante o desenvolvimento de Jogos utilizando uma linguagem orientada a objetos, o reuso de código é constante. Em jogos ao estilo **Tibia** (imagem ao lado) e World of Warcraft, os personagens jogáveis as vezes podem assumir diferentes papéis, como ser um cavaleiro, um mago, um arqueiro ou um curandeiro. Cada um dos papéis promove um estilo de jogo diferente. Nesse estilo de jogo geralmente Cavaleiros utilizam armas como espadas e escudos, magos utilizam varinhas e arcos, arqueiros utilizam arcos e flechas e curandeiros utilizam varinhas e poções.

   <img src="https://github.com/IFNMG-Almenara-Classes/heranca-01/blob/main/images/tibia.jpg" width="250" align="right"/>

   Cada um dos papéis possui características próprias que os tornam mais fortes ou mais fracos em certos aspectos, o Cavaleiro e o Arqueiro podem não possuir o atributo mana (que em jogos de RPG representa um tipo de força interna / força mágica), já magos e curandeiros não podem possuem o atribuo força, já que a força é utilizada para atacar com armas físicas.

   Contudo, todos os personagens possuem nome, nível, nível de defesa, nível de agilidade e nível de inteligência. Além de informações relativas ao seu posicionamento no mapa, como coordenadas X e Y. Todos eles têm a capacidade de se mover, de atacar e de se defender. O dano causado no oponente dependerá dos seus atributos e dos atributos do oponente.

   Outros personagens não jogáveis como os monstros também podem assumir os mesmos papéis dos personagens jogáveis. Por exemplo, um monstro pode ser um Cavaleiro, um Mago, um Arqueiro ou um Curandeiro.

   Diante disso, elabora um diagrama de classes que represente a hierarquia de classes dos personagens jogáveis e não jogáveis. Adicione atributos e métodos que julgar necessário.

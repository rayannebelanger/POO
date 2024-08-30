public class AppQuadrado {

    public static void main(String[] args) throws Exception {
        
        Quadrado q1 = new Quadrado(4); //somente insiro o valor, já foi inicializada na classe
        q1.desenhar();

        System.out.println("A área do quadrado Q1 é: " + q1.calcularArea());
        System.out.println("O perímetro do quadrado Q1 é: " + q1.calcularPerimetro());

        Quadrado q2 = new Quadrado(); //sem construtor personalizado, inicializo os valores na Main
        q2.lado = 7;
        q2.desenhar();

        System.out.println("Área quadrado Q2: " + q2.calcularArea());
        System.out.println("Perímetro Q2: " + q2.calcularPerimetro());
    }
}
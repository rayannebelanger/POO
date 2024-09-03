public class Quadrado {
    
    double lado;

    Quadrado(){}

    Quadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado*lado;
    }

    double calcularPerimetro() {
        return lado*4;
    }

    void desenhar() {
        for(int i = 0; i < lado; i++) {
            for(int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

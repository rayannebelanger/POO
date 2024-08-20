public class Main {
    public static void main(String[] args) throws Exception {
        
        Carro carro2 = new Carro("Uno", "Fiat", 1995);
        System.out.println("Atributo inicializado na classe Carro: " + carro2.modelo + ", " + carro2.montadora + ", " + carro2.ano);

        Carro carro1 = new Carro();
        carro1.modelo = "Hb20";
        carro1.montadora = "Hyundai";

        System.out.println("Inicializada manualmente: " + carro1.modelo + ", " + carro1.montadora);

        Carro carro3 = new Carro("Hb20", "Hyundai");
        System.out.println("Com parametro fixo: " + carro3.modelo + ", " + carro3.montadora);

    }
}

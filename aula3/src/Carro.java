public class Carro {
    String modelo;
    String montadora;
    int ano;


Carro (String modelo, String montadora, int ano) {
    this.modelo = modelo;
    this.montadora = montadora;
    this.ano = ano;
}

Carro() {}

Carro(String modelo, String montadora) {
    this.modelo = modelo;
    this.montadora = montadora;
    this.ano = 2024; //valor fixo, um sistema que todos os carros tem o ano de 2024 sempre
}
}

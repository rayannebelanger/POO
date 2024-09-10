package exercicio;
   
    public class Produto {
        private String nome;
        private double valor;

        public Produto(String nome, double valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public String getNome() {
            return this.nome;
        }

        public double getValor() {
            return this.valor;
        }
    }

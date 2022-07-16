class Carro {

    String cor;
    String modelo;
    int capacidadeDoTanque;

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;

    }

    // constructor aqui

    void setCor(String cor) {
        // "set" serve para colocar um valor em um atributo
        this.cor = cor;
    }

    String getcor() {
        // retorna um valor
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }
    // get e set tanque

    void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;

    }

    int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    // metodo do total para encher o tanque

    double totalvalorTanque(double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;
    }
}

class carro {

    String cor;
    String modelo;
    int capacidadeDoTanque;

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

    void setCapacidadeTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;

    }

    int getCapacidadeTanque (){
        return capacidadeDoTanque;
    }

    // metodo do total para encher o tanque
    

}

class rodaAplicacao {
    public static void main (String[] args) {
 
            Carro carro1 = new Carro();

            carro1.setCor("Azul");
            carro1.setModelo("Fusca");
            carro1.setCapacidadeDoTanque(59);

            System.out.println(carro1.getModelo());
            System.out.println(carro1.getcor());
            System.out.println(carro1.getCapacidadeDoTanque());
            System.out.println(carro1.totalvalorTanque(6.39));

            
            Carro carro2 = new Carro("branco", "cadete", 66);
          
            System.out.println(carro2.getModelo());
            System.out.println(carro2.getcor());
            System.out.println(carro2.getCapacidadeDoTanque());
            System.out.println(carro2.totalvalorTanque(6.42));
    }
}

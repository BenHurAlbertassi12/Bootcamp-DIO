package poo;


import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
    
public static void main(String[] args) {
    Endereco endereco = new Endereco ();
    endereco.cep = "27275130";

    Cliente cliente = new Cliente ();

    cliente.adicionaEndereco(endereco);
    System.out.println("Endereco adcionado com sucesso!");
}}
package com.bancoPOO.entities;

public interface ContaService {
	void sacar(double valor);
	void depositar(double valor);
	void imprimirExtrato();
	void transferir(double valor, Conta contaDestino);

}

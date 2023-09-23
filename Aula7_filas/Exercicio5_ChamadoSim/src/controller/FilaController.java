package controller;

import javax.swing.JOptionPane;

import model.Fila;

public class FilaController {

	public int contCliente;
	Fila<Cliente> fila;
	Fila<Cliente> filaPrioritarios;
	Cliente cliente;

	public FilaController(Fila<Cliente> fila, Fila<Cliente> filaPrioritarios) {
		this.fila = fila;
		this.filaPrioritarios = filaPrioritarios;
	}

	public void inserirCliente(String nome, int senha, int opc) {
		Cliente cliente = new Cliente(nome, senha);
		fila.insert(cliente);
		JOptionPane.showMessageDialog(null, "O cliente " + cliente.nome + " entrou na fila");
	}

	public void inserirClientePrioriario(String nome, int senha, int opc) {
		Cliente cliente = new Cliente(nome, senha);
		filaPrioritarios.insert(cliente);
		JOptionPane.showMessageDialog(null, "O cliente prioritário " + cliente.nome + " entrou na fila");
	}

	public void chamarAtendimento() {
		try {
			if (fila.isEmpty() && filaPrioritarios.isEmpty()) {
				System.err.println("As duas filas estão vazias, não há clientes para chamar");
			} else {
				if (contCliente >= 3) {
					if (!fila.isEmpty()) {
						System.out.println("O cliente: " + fila.remove() + " foi removido");
						contCliente = 0;
					} else {
						System.out.println("O cliente Prioritário: " + filaPrioritarios.remove() + " foi removido");
						contCliente++;
					}
				} else if (!filaPrioritarios.isEmpty()) {
					System.out.println("O cliente Prioritário: " + filaPrioritarios.remove() + " foi removido");
					contCliente++;
				} else {
					System.out.println("O cliente: " + fila.remove() + " foi removido");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}

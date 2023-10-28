package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import fateczl.Lista.model.Lista;
import model.Cliente;

public class ModificacaoCadastroController {

	public ModificacaoCadastroController() {
		super();
	}

	private void novoArquivo(Lista<Cliente> lista, String nomeArquivo) throws IOException {
		File file = new File("C:\\TEMP\\" + nomeArquivo);
			int tamanho = lista.size();
			StringBuffer buffer = new StringBuffer();

			for (int i = 0; i < tamanho; i++) {
				try {
					buffer.append(lista.get(i).toString() + "\r\n");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			FileWriter Writer = new FileWriter(file);
			PrintWriter print = new PrintWriter(Writer);
			print.write(buffer.toString());
			print.flush();
			print.close();
			Writer.close();
	}
	
	
	public void novoCadastro(int idadeMin, int idadeMax, Double LimiteCredito) throws IOException {
		Lista<Cliente> listaNova = new Lista<>();
		File file = new File("C:\\TEMP\\cadastro.csv");
		if (file.exists() && file.isFile()) {
			FileInputStream fluxo = new FileInputStream(file);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();

			int idade;
			double credito;
			while (linha != null) {
				linha = linha.replace("\"", "");
				String[] dados = linha.split(";");
				idade = Integer.parseInt(dados[2]);
				credito = Double.parseDouble(dados[3]);
				try {

					if (idade > idadeMin && idade < idadeMax) {
						if (credito > LimiteCredito) {
							Cliente cliente = new Cliente();
							cliente.CPF = dados[0];
							cliente.Nome = dados[1];
							cliente.Idade = idade;
							cliente.LimiteCredito = credito;

							listaNova.addLast(cliente);
						}
					}
					linha = buffer.readLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			String nomeArquivo = "idade " + idadeMin + "-" + idadeMax + " limite" + LimiteCredito + ".csv";
			novoArquivo(listaNova, nomeArquivo);

			fluxo.close();
			leitor.close();
			buffer.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
	}
}

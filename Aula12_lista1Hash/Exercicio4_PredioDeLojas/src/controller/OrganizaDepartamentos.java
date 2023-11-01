package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import fateczl.Lista.model.Lista;
import model.departamento;
@SuppressWarnings("unchecked")
public class OrganizaDepartamentos {

	Lista<departamento>[] lista;
	
	
	public OrganizaDepartamentos() {
		lista = new Lista[4];
		inicializaLista();
	}


	private void inicializaLista() {
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			lista[i] = new Lista<>();
		}
	}
	
	public void lerArquivo(String nomeArquivo) throws Exception {
		File file = new File(nomeArquivo);
		if(file.exists() && file.isFile()) {
			FileInputStream fluxo = new FileInputStream(file);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while(linha != null) {
				if(linha.contains("terreo")) {
					linha = buffer.readLine();
					while(!linha.contains("primeiro andar")) {
						String[] atributosDep = linha.split(";");
						departamento dep = new departamento();
						dep.andar = 0;
						dep.nomeDepartamento = atributosDep[0];
						dep.descricao = atributosDep[1];
						adicionaDep(dep);
						linha = buffer.readLine();
					}
				}else if(linha.contains("primeiro andar")) {
					linha = buffer.readLine();
					while(!linha.contains("segundo andar")) {
						String[] atributosDep = linha.split(";");
						departamento dep = new departamento();
						dep.andar = 1;
						dep.nomeDepartamento = atributosDep[0];
						dep.descricao = atributosDep[1];
						adicionaDep(dep);
						linha = buffer.readLine();
					}
				}else if(linha.contains("segundo andar")) {
					linha = buffer.readLine();
					while(!linha.contains("terceiro andar")) {
						String[] atributosDep = linha.split(";");
						departamento dep = new departamento();
						dep.andar = 2;
						dep.nomeDepartamento = atributosDep[0];
						dep.descricao = atributosDep[1];
						adicionaDep(dep);
						linha = buffer.readLine();
					}
				}else if(linha.contains("terceiro andar")) {
					linha = buffer.readLine();
					while(linha != null) {
						String[] atributosDep = linha.split(";");
						departamento dep = new departamento();
						dep.andar = 3;
						dep.nomeDepartamento = atributosDep[0];
						dep.descricao = atributosDep[1];
						adicionaDep(dep);
						linha = buffer.readLine();
					}
				}
			}
			
			fluxo.close();
			leitor.close();
			buffer.close();
			
		}else {
			throw new Exception("Arquivo não encontrado");
		}
	}
	
	private void adicionaDep(departamento dep) throws Exception {
		int posicao = dep.hashCode(dep);
		lista[posicao].addLast(dep);
	}
	
	
	public void removerDep(departamento dep) throws Exception {
		int posicao = dep.hashCode(dep);
		int tamanhoLista = lista[posicao].size();
		boolean removido =false;
		for(int i=0; i < tamanhoLista; i++) {
			departamento depAtual = (departamento) lista[posicao].get(i);
			System.out.println(depAtual.nomeDepartamento);
			System.out.println(dep.nomeDepartamento);
			if(depAtual.nomeDepartamento == dep.nomeDepartamento) {
				lista[posicao].remove(i);
				removido = true;
				System.out.println("Departamento removido");
				break;
			}
		}
		if(!removido) {
			System.err.println("Departamento não encontrado!!");
		}
	}
	
	public void consultaDep(departamento dep) throws Exception {
		int posicao = dep.hashCode(dep);
		int tamanhoLista = lista[posicao].size();
		boolean removido = false;
		for(int i=0; i < tamanhoLista; i++) {
			departamento depAtual = (departamento) lista[posicao].get(i);
			if(depAtual.nomeDepartamento == dep.nomeDepartamento) {
				System.out.println(dep.toString());
				removido = true;
				break;
			}
		}
		if(!removido) {
			System.err.println("Departamento não encontrado!!");
		}
	}
}

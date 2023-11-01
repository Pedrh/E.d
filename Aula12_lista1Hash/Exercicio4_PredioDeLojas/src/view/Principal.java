package view;

import javax.swing.JOptionPane;

import controller.OrganizaDepartamentos;
import model.departamento;

public class Principal {

	public static void main(String[] args) {
		OrganizaDepartamentos organiza = new OrganizaDepartamentos();

		int opt;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Deseja: \n 1 - Inserir os departamentos \n 2 - Remover um departamento \n 3 - encontrar um departamento \n 9 - Sair do aplicativo"));
			try {
				switch (opt) {
				case 1:
					String nomeArquivo = "C:\\Users\\Familia\\OneDrive\\Documentos\\programas\\eclipse\\WorkSpace\\E.d\\Aula12_lista1Hash\\DadosParaExercicio4.csv";
					organiza.lerArquivo(nomeArquivo);
					break;
				case 2:
					String dadosDepartamento = JOptionPane.showInputDialog("Digite da seguinte forma: andar do departamento;nome do departamento");
					String[] atributosDep = dadosDepartamento.split(";");
					departamento dep = new departamento();
					dep.andar = Integer.parseInt(atributosDep[0]);
					dep.nomeDepartamento = atributosDep[1];
					organiza.removerDep(dep);
					break;
				case 3:
					dadosDepartamento = JOptionPane.showInputDialog("Digite da seguinte forma: andar do departamento;nome do departamento");
					atributosDep = dadosDepartamento.split(";");
					departamento encontrarDep = new departamento();
					encontrarDep.andar = Integer.parseInt(atributosDep[0]);
					encontrarDep.nomeDepartamento = atributosDep[1];
					organiza.consultaDep(encontrarDep);
					break;
				case 9:
					System.out.println("Sistema encerrando...");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Digite uma das opções mostradas!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (opt != 9);

	}

}

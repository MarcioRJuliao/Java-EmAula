// GabrielMarcio

package br.com.GabrielMarcioTeste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.GabrielMarcioDao.GabrielMarcioProfessorDAO; // Importe a classe GabrielMarcioProfessorDAO
import br.com.GabrielMarcioModel.GabrielMarcioProfessorModel;
import conexao.Conexao;

public class GabrielMarcioTesteInserirProfessor {
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();

        GabrielMarcioProfessorModel professor = new GabrielMarcioProfessorModel();
        GabrielMarcioProfessorDAO professorDAO = new GabrielMarcioProfessorDAO(con); // Instancie GabrielMarcioProfessorDAO

        professor.setNome(JOptionPane.showInputDialog("Insira o nome do Professor"));
        professor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário do Professor")));
        professor.setSexo(JOptionPane.showInputDialog("Insira o sexo do Professor"));
        professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do Professor")));
        professor.setCep(JOptionPane.showInputDialog("Insira o cep do Professor"));
        professor.setRua(JOptionPane.showInputDialog("Insira a rua do Professor"));
        
        professor.setMateria(JOptionPane.showInputDialog("Insira a matéria do Professor"));

        System.out.println(professorDAO.inserirGabrielMarcioProfessorModel(professor)); // Use professorDAO

        Conexao.fecharConexao(con);
    }
}

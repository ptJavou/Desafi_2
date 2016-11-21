package Model;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.ClienteDAO;
import Entities.Cliente;

public class ClienteService {

	public static Cliente cliente = new Cliente();
	public static boolean newCliente = false;
	
	public void logarCliente(JTextField textField, JPanel panel){
		ClienteDAO clienteDAO = new ClienteDAO();
		try {
			cliente = clienteDAO.buscarCliente(textField.getText());
			JOptionPane.showMessageDialog(panel, "Cliente Logado");
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(panel, "Cliente não encontrado");
		}
	}
}

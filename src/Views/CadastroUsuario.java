package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;

import Entities.Cliente;
import Model.ClienteService;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	ClienteService clienteService = new ClienteService();
	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public CadastroUsuario() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 85, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(122, 84, 133, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSobrnome = new JLabel("Sobrnome:");
		lblSobrnome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSobrnome.setBounds(269, 86, 77, 14);
		panel.add(lblSobrnome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(356, 84, 133, 20);
		panel.add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(67, 128, 46, 14);
		panel.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 127, 133, 20);
		panel.add(textField_2);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereo.setBounds(67, 175, 63, 14);
		panel.add(lblEndereo);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(150, 175, 341, 65);
		panel.add(textPane);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(67, 271, 133, 14);
		panel.add(lblDataDeNascimento);
		
		MaskFormatter dataNascimentoMask = new MaskFormatter("##/##/####");
		JFormattedTextField formattedTextField = new JFormattedTextField(dataNascimentoMask);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField.setBounds(217, 269, 92, 19);
		panel.add(formattedTextField);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(textField.getText());
				cliente.setCpf(textField_2.getText());
				cliente.setEndereco(textPane.getText());
				cliente.setDataNasc(formattedTextField.getText());
				
				ClienteService.cliente = cliente;
				ClienteService.newCliente = true;
				JOptionPane.showMessageDialog(panel, "Salvo");
			}
		});
		btnNewButton.setBounds(67, 358, 89, 23);
		panel.add(btnNewButton);
		
	}
}

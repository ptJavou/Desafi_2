package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Entities.Acessorio;
import Model.AcessorioSrevice;
import Model.FinalizarCompra;
import Model.TotalService;
import Model.VeiculoService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.math.BigDecimal;
import java.text.ParseException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JCheckBox;

import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	VeiculoService veiculoService = new VeiculoService();
	AcessorioSrevice acessorioSrevice = new AcessorioSrevice();

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		/**
		 * label veículos disponíveis
		 */
		JLabel lblImgCarro_1 = new JLabel("Ve\u00EDculos Dispon\u00EDveis");
		lblImgCarro_1.setForeground(Color.RED);
		lblImgCarro_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblImgCarro_1.setBounds(75, 36, 191, 34);
		panel.add(lblImgCarro_1);
		/**
		 * carregar a imagem a partir da combobox
		 */
		JLabel lblImgCarro = new JLabel("");
		lblImgCarro.setBounds(75, 81, 100, 69);
		panel.add(lblImgCarro);
		
		JLabel lblValor = new JLabel("");
		lblValor.setBounds(75, 161, 80, 14);
		panel.add(lblValor);
		
		JComboBox comboBox_1 = veiculoService.listarCarros();
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				veiculoService.mudarImagemCarro(comboBox_1, lblImgCarro, lblValor);
			}
		});	
		comboBox_1.setBounds(213, 130, 179, 20);
		panel.add(comboBox_1);
		
		
		/**
		 * label Acessórios Disponíveis
		 */
		JLabel lblAcessriosDisponveis = new JLabel("Acess\u00F3rios Dispon\u00EDveis");
		lblAcessriosDisponveis.setForeground(Color.RED);
		lblAcessriosDisponveis.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAcessriosDisponveis.setBounds(75, 263, 191, 34);
		panel.add(lblAcessriosDisponveis);
		
		
		
		
		//Checkboxes
		/**
		 * Ar codicionado
		 */
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ar Codicionado");
		chckbxNewCheckBox.setBounds(75, 304, 121, 23);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxNewCheckBox, new BigDecimal(3300));
			}
		});
		panel.add(chckbxNewCheckBox);
		
		/**
		 * Ar quente
		 */
		JCheckBox chckbxArquente = new JCheckBox("Ar Quente");
		chckbxArquente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxArquente, new BigDecimal(3300));
			}
		});
		chckbxArquente.setBounds(75, 347, 97, 23);
		panel.add(chckbxArquente);

		/**
		 * Diração hidráulica
		 */
		JCheckBox chckbxDireoHidrulica = new JCheckBox("Dire\u00E7\u00E3o Hidr\u00E1ulica");
		chckbxDireoHidrulica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxDireoHidrulica, new BigDecimal(2349));
			}
		});
		chckbxDireoHidrulica.setBounds(75, 395, 133, 23);
		panel.add(chckbxDireoHidrulica);
		
		/**
		 * Pintura Metálica
		 */
		JCheckBox chckbxPinturaMetlica = new JCheckBox("Pintura Met\u00E1lica");
		chckbxPinturaMetlica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxPinturaMetlica, new BigDecimal(3300));
			}
		});
		chckbxPinturaMetlica.setBounds(75, 439, 121, 23);
		panel.add(chckbxPinturaMetlica);
		
		/**
		 * trio Elétrico
		 */
		JCheckBox chckbxTrioEltrico = new JCheckBox("Trio El\u00E9trico");
		chckbxTrioEltrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxTrioEltrico, new BigDecimal(3500));
			}
		});
		chckbxTrioEltrico.setBounds(243, 304, 97, 23);
		panel.add(chckbxTrioEltrico);
		
		/**
		 * Câmbio Automático
		 */
		JCheckBox chckbxCmbioAutomtico = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
		chckbxCmbioAutomtico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxCmbioAutomtico, new BigDecimal(6999));
			}
		});
		chckbxCmbioAutomtico.setBounds(243, 347, 133, 23);
		panel.add(chckbxCmbioAutomtico);
		
		/**
		 * roda liga leve
		 */
		JCheckBox chckbxRodaLigaLeve = new JCheckBox("Roda Liga Leve");
		chckbxRodaLigaLeve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxRodaLigaLeve, new BigDecimal(920));
			}
		});
		chckbxRodaLigaLeve.setBounds(243, 395, 121, 23);
		panel.add(chckbxRodaLigaLeve);
		
		/**
		 * gps
		 */
		JCheckBox chckbxGps = new JCheckBox("GPS");
		chckbxGps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxGps, new BigDecimal(420));
			}
		});
		chckbxGps.setBounds(243, 439, 97, 23);
		panel.add(chckbxGps);
		
		
		/**
		 * camera de rá
		 */
		JCheckBox chckbxCmeraDeR = new JCheckBox("C\u00E2mera de R\u00E9");
		chckbxCmeraDeR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxCmeraDeR, new BigDecimal(1350));
			}
		});
		chckbxCmeraDeR.setBounds(426, 395, 121, 23);
		panel.add(chckbxCmeraDeR);
		
		/**
		 * banco de couro
		 */
		JCheckBox chckbxBancoDeCouro = new JCheckBox("Banco de Couro");
		chckbxBancoDeCouro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxBancoDeCouro, new BigDecimal(1490));
			}
		});
		chckbxBancoDeCouro.setBounds(426, 347, 121, 23);
		panel.add(chckbxBancoDeCouro);
		
		/**
		 * kit multimidia
		 */
		JCheckBox chckbxKitMultimdia = new JCheckBox("Kit Multim\u00EDdia");
		chckbxKitMultimdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acessorioSrevice.adicionarAcessorio(chckbxKitMultimdia, new BigDecimal(259));
			}
		});
		chckbxKitMultimdia.setBounds(426, 304, 97, 23);
		panel.add(chckbxKitMultimdia);
		
		JButton btnNewButton = new JButton("Calcular Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalService totalService = new TotalService();
				totalService.exibirTotal(panel);
			}
		});
		btnNewButton.setBounds(75, 494, 146, 23);
		panel.add(btnNewButton);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalizarCompra finalizarCompra = new FinalizarCompra();
				finalizarCompra.salvarVenda(panel);
				
			}
		});
		btnFinalizarCompra.setBounds(273, 494, 146, 23);
		panel.add(btnFinalizarCompra);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					CadastroUsuario cadastroUsuario = new CadastroUsuario();
					cadastroUsuario.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(647, 11, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnLogar = new JButton("logar");
		btnLogar.setForeground(Color.BLUE);
		btnLogar.setBorder(null);
		btnLogar.setBackground(SystemColor.menu);
		btnLogar.setBounds(548, 11, 89, 23);
		 btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		panel.add(btnLogar);
		
		
		
		
		
		
		
		
		
	}
}





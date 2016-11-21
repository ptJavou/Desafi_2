package Model;

import java.io.File;
import java.math.BigDecimal;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;

import Entities.Acessorio;
import Entities.Veiculo;
import Views.TelaPrincipal;

import java.util.List;
import java.util.ArrayList;

public class VeiculoService {

	
	private static List<String> listaCarros = new ArrayList<String>();
	public static Veiculo veiculo = new Veiculo();
	
	static{
		listaCarros.add("Selecione");
		listaCarros.add("Bravo");
		listaCarros.add("Doblô");
		listaCarros.add("Fiorino");
		listaCarros.add("Freemont");
		listaCarros.add("Idea");
		listaCarros.add("Linea");
		listaCarros.add("Palio");
		listaCarros.add("Punto");
	}
	
	public JComboBox<String> listarCarros(){
		JComboBox box = new JComboBox();
		for(String nomes : listaCarros){
			box.addItem(nomes);
		}
		
		return box;
	}
	
	public void mudarImagemCarro (JComboBox<String> box, JLabel lblImgCarro, JLabel lblValor){
		
		switch(box.getSelectedIndex()){
		case 0:
			imagemCarro(lblImgCarro, null);
			valorCarro(lblValor, null); break;
		
		case 1:
			imagemCarro(lblImgCarro, "bravo"); 
			valorCarro(lblValor, "72.120"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(72.120));
			 break;
		
		case 2:
			imagemCarro(lblImgCarro, "doblo"); 
			valorCarro(lblValor, "78.400"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(78.400));
			break;
			
		case 3:
			imagemCarro(lblImgCarro, "fiorino"); 
			valorCarro(lblValor, "53.340"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(53.340));
			break;
			
		case 4:
			imagemCarro(lblImgCarro, "freemont"); 
			valorCarro(lblValor, "109.590"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(109.590));
			break;
			
		case 5:
			imagemCarro(lblImgCarro, "idea"); 
			valorCarro(lblValor, "54.660"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(54.660));
			break;
			
		case 6:
			imagemCarro(lblImgCarro, "linea"); 
			valorCarro(lblValor, "65.860"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(65.860));
			break;
			
		case 7:
			imagemCarro(lblImgCarro, "palio2017"); 
			valorCarro(lblValor, "32.890"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(32.890));
			break;
			
		case 8:
			imagemCarro(lblImgCarro, "punto2017"); 
			valorCarro(lblValor, "53.310"); 
			veiculo.setNome((String)box.getSelectedItem());
			veiculo.setValor(new BigDecimal(53.310));
			break;
		}
		
	}
	
	public void imagemCarro(JLabel lblImgCarro, String nomeCarro){
		if (nomeCarro == null){
			lblImgCarro.setIcon(null);
		
		}else{
			String urlImage = "/Imagens/ImgsCarrosFiat/" + nomeCarro + ".png";
			lblImgCarro.setIcon(new ImageIcon(TelaPrincipal.class.getResource(urlImage)));
		}	
	}
	
	public void valorCarro (JLabel lblValor, String valor) {
		lblValor.setText("R$" + valor + ",00");
	}
	
	

	
}















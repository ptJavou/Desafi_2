package Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;

import Entities.Acessorio;

public class AcessorioSrevice {

	public static List<Acessorio> listaAcessorios = new ArrayList<Acessorio>(); 
	
	public void adicionarAcessorio(JCheckBox checkBox, BigDecimal valor){
		
		boolean flag = false;
		for (int i = 0 ; i < listaAcessorios.size() ; i++){
			
			if(checkBox.isSelected() && listaAcessorios.get(i).getNome().equals(checkBox.getText()) || checkBox.isSelected() && listaAcessorios.get(i).getNome().equals(checkBox.getText())){
				System.out.println("Acessório ja adicionado");
				flag = true;
			
			}else
				if(!checkBox.isSelected() && listaAcessorios.get(i).getNome().equals(checkBox.getText())){
					listaAcessorios.remove(i);
					flag = true;
				}
		}
		
		if(flag == false){
			listaAcessorios.add(new Acessorio(checkBox.getText(), valor));
		}
	}
}

package Model;
import java.math.BigDecimal;

import Entities.Acessorio;
import Entities.Veiculo;

import java.lang.StringBuilder;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TotalService {

	public BigDecimal calcularTotal(){
		
		BigDecimal total = BigDecimal.ZERO;
		
		for (Acessorio acessorio : AcessorioSrevice.listaAcessorios){
			total = total.add(acessorio.getValor());
		}
		total = total.add(VeiculoService.veiculo.getValor());
		
		return total;
	}
	
	public void exibirTotal(JPanel panel){
		StringBuilder sb = new StringBuilder();
		for(Acessorio acessorio : AcessorioSrevice.listaAcessorios){
			sb.append(acessorio.getNome() + " -> " + " R$" + acessorio.getValor() + ",00");
			sb.append(System.getProperty("line.separator"));
		}
		
		JOptionPane.showMessageDialog(panel, sb);
	}
}




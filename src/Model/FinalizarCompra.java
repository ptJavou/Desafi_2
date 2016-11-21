package Model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Entities.Acessorio;
import Entities.Venda;
import DAO.JPAUtil;

public class FinalizarCompra {

	EntityManager manager = JPAUtil.getEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void salvarVenda(JPanel panel){
		
		if(ClienteService.cliente.getCpf() == null){
			JOptionPane.showMessageDialog(panel, "Crie uma conta ou entre com uma já existente");
		
		}else{
			
			transaction.begin();
				TotalService totalService = new TotalService();
			
				Venda venda = new Venda();
				venda.setHora(new Date());
				venda.setData(new Date());
				venda.setAcessorios(AcessorioSrevice.listaAcessorios);
				venda.setCliente(ClienteService.cliente);
				venda.setVeiculo(VeiculoService.veiculo);
				venda.setTotal(totalService.calcularTotal());
				
				manager.persist(venda);
				manager.persist(VeiculoService.veiculo);
				for (Acessorio acessorio : AcessorioSrevice.listaAcessorios){
					manager.persist(acessorio);
				}
				
				if(ClienteService.newCliente){
					manager.persist(ClienteService.cliente);
				}
				
			transaction.commit();
			
		}
	}
}











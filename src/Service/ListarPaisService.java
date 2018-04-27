package Service;

import java.util.ArrayList;

import Model.Pais;
import DAO.PaisDAO;

public class ListarPaisService {
	PaisDAO dao;
	
	public ListarPaisService(){
		dao = new PaisDAO();
	}
	public ArrayList<Pais> listarPaises(){
		return dao.listarPaises();
	}
	public ArrayList<Pais> listarPaises(String chave){
		return dao.listarPaises(chave);
	}
	

}

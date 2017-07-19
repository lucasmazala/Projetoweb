package br.com.projetoweb.bean;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.google.gson.Gson;

import br.com.projetoweb.dao.SetorPublicoMunicipalDAO;
import br.com.projetoweb.entity.SetorPublicoMunicipal;

@ManagedBean
@ViewScoped
public class SetorPublicoMunicipalBEAN {

	SetorPublicoMunicipal setorPublicoMunicipal;
	List<SetorPublicoMunicipal> listSetorPublicoMunicipal;
	
	public void listar(){
		SetorPublicoMunicipalDAO setorPublicoMunicipalDAO = new SetorPublicoMunicipalDAO();
		listSetorPublicoMunicipal = setorPublicoMunicipalDAO.listar();
		
		Gson gson = new Gson();
		String createJson = gson.toJson(listSetorPublicoMunicipal);
		System.out.println(createJson);
		
		criarJson(createJson);
	}

	private void criarJson(String createJson){
		FileWriter writer = null;
		try {
			writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/setorPublicoMunicipal.json");
			writer.write(createJson);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(writer!= null){
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public SetorPublicoMunicipal getSetorPublicoMunicipal() {
		return setorPublicoMunicipal;
	}

	public void setSetorPublicoMunicipal(SetorPublicoMunicipal setorPublicoMunicipal) {
		this.setorPublicoMunicipal = setorPublicoMunicipal;
	}

	public List<SetorPublicoMunicipal> getListSetorPublicoMunicipal() {
		return listSetorPublicoMunicipal;
	}

	public void setListSetorPublicoMunicipal(List<SetorPublicoMunicipal> listSetorPublicoMunicipal) {
		this.listSetorPublicoMunicipal = listSetorPublicoMunicipal;
	}
	
}

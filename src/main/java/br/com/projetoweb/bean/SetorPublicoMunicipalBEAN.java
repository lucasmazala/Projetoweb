package br.com.projetoweb.bean;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.google.gson.Gson;

import br.com.projetoweb.dao.SetorPublicoMunicipalDAO;
import br.com.projetoweb.entity.SetorPublicoMunicipal;

@ManagedBean
@ViewScoped
public class SetorPublicoMunicipalBEAN {

	SetorPublicoMunicipal setorPublicoMunicipal;
	List<SetorPublicoMunicipal> setorPublicoMunicipalList;
	
	@PostConstruct // chama o método automáticamente depois do construtor da classe,sem ele não carregou as infs do bd
	public void listar(){
		SetorPublicoMunicipalDAO setorPublicoMunicipalDAO = new SetorPublicoMunicipalDAO();
		setorPublicoMunicipalList = setorPublicoMunicipalDAO.listar();
		
//		Gson gson = new Gson();
//		String createJson = gson.toJson(listSetorPublicoMunicipal);
//		System.out.println(createJson);
//		
//		criarJson(createJson);
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

	public List<SetorPublicoMunicipal> getSetorPublicoMunicipalList() {
		return setorPublicoMunicipalList;
	}

	public void setsetorPublicoMunicipalList(List<SetorPublicoMunicipal> setorPublicoMunicipalList) {
		this.setorPublicoMunicipalList = setorPublicoMunicipalList;
	}
	
}

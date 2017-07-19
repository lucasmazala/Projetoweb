package br.com.projetoweb.bean;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.google.gson.Gson;

import br.com.projetoweb.dao.SetorPrivadoMunicipalDAO;
import br.com.projetoweb.entity.SetorPrivadoMunicipal;

@ManagedBean
@ViewScoped
public class SetorPrivadoMunicipalBEAN {

	SetorPrivadoMunicipal setorPrivadoMunicipal;
	List<SetorPrivadoMunicipal> listSetorPrivadoMunicipal;
	
	public void listar(){
		 SetorPrivadoMunicipalDAO setorPrivadoMunicipalDAO= new SetorPrivadoMunicipalDAO();
		 listSetorPrivadoMunicipal = setorPrivadoMunicipalDAO.listar();
		 
		 Gson gson= new Gson();
		 String createGson = gson.toJson(listSetorPrivadoMunicipal);
		 System.out.println(createGson);
		 
		 criarJson(createGson);
	}
	
	private void criarJson(String createGson){
		FileWriter writer = null;
		try {
			writer= new FileWriter("C:/Users/Lucas/workspace/Projetoweb/src/main/webapp/resources/json/setorPrivadoMunicipal.json");
			writer.write(createGson);
			
		} catch ( IOException e) {
			// TODO: handle exception
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public SetorPrivadoMunicipal getSetorPrivadoMunicipal() {
		return setorPrivadoMunicipal;
	}
	public void setSetorPrivadoMunicipal(SetorPrivadoMunicipal setorPrivadoMunicipal) {
		this.setorPrivadoMunicipal = setorPrivadoMunicipal;
	}
	public List<SetorPrivadoMunicipal> getListSetorPrivadoMunicipal() {
		return listSetorPrivadoMunicipal;
	}
	public void setListSetorPrivadoMunicipal(List<SetorPrivadoMunicipal> listSetorPrivadoMunicipal) {
		this.listSetorPrivadoMunicipal = listSetorPrivadoMunicipal;
	}


}

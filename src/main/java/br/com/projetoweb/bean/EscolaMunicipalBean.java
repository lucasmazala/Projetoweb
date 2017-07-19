package br.com.projetoweb.bean;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.google.gson.Gson;
import org.omnifaces.util.Messages;

import br.com.projetoweb.dao.EscolaMunicipalDAO;
import br.com.projetoweb.entity.EscolaMunicipal;

@ManagedBean
@ViewScoped
public class EscolaMunicipalBean {

	EscolaMunicipal escMunicipal;
	List<EscolaMunicipal> escMunicipalList;
	
	

	public void listar() {
		try {
			EscolaMunicipalDAO escMunDAO = new EscolaMunicipalDAO();
			escMunicipalList= escMunDAO.listar();
		//	String json = gson.toJson(escMunicipalList);
			Gson gson = new Gson();
			String createJson = gson.toJson(escMunicipalList);
			System.out.println(createJson);
			criarJson(createJson);
			
//			EscolaMunicipal escM1= gson.fromJson(testJson,EscolaMunicipal.class);
//			problema https://www.youtube.com/watch?v=D-QPTvNDmPA
//			System.out.println();
//			
			
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao listar as informações da tabela escola municipal");
			erro.printStackTrace();
		}
	}

	private void criarJson(String createJson){
		FileWriter writer= null;
		try {
			writer= new FileWriter("C:/Users/Lucas/workspace/Projetoweb/src/main/webapp/resources/json/escolaMunicipal.json");
			// writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/escolaMunicipal.json"); erro de caminho nao sei pq
			 writer.write(createJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	public List<EscolaMunicipal> getEscMunicipalList() {
		return escMunicipalList;
	}

	public void setEscMunicipalList(List<EscolaMunicipal> escMunicipalList) {
		this.escMunicipalList = escMunicipalList;
	}

	public EscolaMunicipal getEscMunicipal() {
		return escMunicipal;
	}

	public void setEscMunicipal(EscolaMunicipal escMunicipal) {
		this.escMunicipal = escMunicipal;
	}
}

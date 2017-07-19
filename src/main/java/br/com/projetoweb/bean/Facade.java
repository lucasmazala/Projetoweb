//package br.com.projetoweb.bean;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//
//import org.omnifaces.util.Messages;
//
//import com.google.gson.Gson;
//
//import br.com.projetoweb.dao.EscolaMunicipalDAO;
//import br.com.projetoweb.dao.SetorPrivadoMunicipalDAO;
//import br.com.projetoweb.dao.SetorPublicoMunicipalDAO;
//import br.com.projetoweb.entity.EscolaMunicipal;
//import br.com.projetoweb.entity.SetorPrivadoMunicipal;
//import br.com.projetoweb.entity.SetorPublicoMunicipal;
//
//@ManagedBean
//@ViewScoped
//public class Facade {
//
//	SetorPrivadoMunicipal setorPrivadoMunicipal;
//	List<SetorPrivadoMunicipal> listSetorPrivadoMunicipal;
//	
//	public void listarSPM(){
//		 SetorPrivadoMunicipalDAO setorPrivadoMunicipalDAO= new SetorPrivadoMunicipalDAO();
//		 listSetorPrivadoMunicipal = setorPrivadoMunicipalDAO.listar();
//		 
//		 Gson gson= new Gson();
//		 String createGsonSPM = gson.toJson(listSetorPrivadoMunicipal);
//		 System.out.println(createGsonSPM);
//		 
//		 criarJsonSPM(createGsonSPM);
//	}
//	
//	private void criarJsonSPM(String createGsonSPM){
//		FileWriter writer = null;
//		try {
//			writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/setorPrivadoMunicipal.json");
//			writer.write(createGsonSPM);
//			
//		} catch ( IOException e) {
//			// TODO: handle exception
//		}finally{
//			if(writer!=null){
//				try {
//					writer.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	}
//	
//	public SetorPrivadoMunicipal getSetorPrivadoMunicipal() {
//		return setorPrivadoMunicipal;
//	}
//	public void setSetorPrivadoMunicipal(SetorPrivadoMunicipal setorPrivadoMunicipal) {
//		this.setorPrivadoMunicipal = setorPrivadoMunicipal;
//	}
//	public List<SetorPrivadoMunicipal> getListSetorPrivadoMunicipal() {
//		return listSetorPrivadoMunicipal;
//	}
//	public void setListSetorPrivadoMunicipal(List<SetorPrivadoMunicipal> listSetorPrivadoMunicipal) {
//		this.listSetorPrivadoMunicipal = listSetorPrivadoMunicipal;
//	}
//	
//	EscolaMunicipal escMunicipal;
//	List<EscolaMunicipal> escMunicipalList;
//	
//	
//
//	public void EMlistar() {
//		try {
//			EscolaMunicipalDAO escMunDAO = new EscolaMunicipalDAO();
//			escMunicipalList= escMunDAO.listar();
//		//	String json = gson.toJson(escMunicipalList);
//			Gson gson = new Gson();
//			String createJsonEM = gson.toJson(escMunicipalList);
//			System.out.println(createJsonEM);
//			criarJsonEM(createJsonEM);
//			
////			EscolaMunicipal escM1= gson.fromJson(testJson,EscolaMunicipal.class);
////			problema https://www.youtube.com/watch?v=D-QPTvNDmPA
////			System.out.println();
////			
//			
//		} catch (RuntimeException erro) {
//			Messages.addGlobalError("Ocorreu um erro ao listar as informações da tabela escola municipal");
//			erro.printStackTrace();
//		}
//	}
//
//	private void criarJsonEM(String createJsonEM){
//		FileWriter writer= null;
//		try {
//			 writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/escolaMunicipal.json");
//			 writer.write(createJsonEM);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			if(writer!=null){
//				try {
//					writer.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	}
//	
//	public List<EscolaMunicipal> getEscMunicipalList() {
//		return escMunicipalList;
//	}
//
//	public void setEscMunicipalList(List<EscolaMunicipal> escMunicipalList) {
//		this.escMunicipalList = escMunicipalList;
//	}
//
//	public EscolaMunicipal getEscMunicipal() {
//		return escMunicipal;
//	}
//
//	public void setEscMunicipal(EscolaMunicipal escMunicipal) {
//		this.escMunicipal = escMunicipal;
//	}
//	
//	SetorPublicoMunicipal setorPublicoMunicipal;
//	List<SetorPublicoMunicipal> listSetorPublicoMunicipal;
//	
//	public void listarSPublicoM(){
//		SetorPublicoMunicipalDAO setorPublicoMunicipalDAO = new SetorPublicoMunicipalDAO();
//		listSetorPublicoMunicipal = setorPublicoMunicipalDAO.listar();
//		
//		Gson gson = new Gson();
//		String createJsonSPublicoM = gson.toJson(listSetorPublicoMunicipal);
//		System.out.println(createJsonSPublicoM);
//		
//		criarJsonSPublicoM(createJsonSPublicoM);
//	}
//
//	private void criarJsonSPublicoM(String createJsonSPublicoM){
//		FileWriter writer = null;
//		try {
//			writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/setorPublicoMunicipal.json");
//			writer.write(createJsonSPublicoM);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally{
//			if(writer!= null){
//				try {
//					writer.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//	
//	
//	public SetorPublicoMunicipal getSetorPublicoMunicipal() {
//		return setorPublicoMunicipal;
//	}
//
//	public void setSetorPublicoMunicipal(SetorPublicoMunicipal setorPublicoMunicipal) {
//		this.setorPublicoMunicipal = setorPublicoMunicipal;
//	}
//
//	public List<SetorPublicoMunicipal> getListSetorPublicoMunicipal() {
//		return listSetorPublicoMunicipal;
//	}
//
//	public void setListSetorPublicoMunicipal(List<SetorPublicoMunicipal> listSetorPublicoMunicipal) {
//		this.listSetorPublicoMunicipal = listSetorPublicoMunicipal;
//	}
//
//}

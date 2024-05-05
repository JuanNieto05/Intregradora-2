package model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller{
	
	// Relacion
	private Place[] storage;
	private Community[] storage2;
	private Product[] storage3;
	private Species[] storage4;
	private ArrayList<Community> communities;
	private List<Species> speciesList;

	public Controller(){
		
		storage = new Place[200];
		storage2 = new Community[200];
		storage3 = new Product[20];
		storage4 = new Species[50];
		this.communities = new ArrayList<>();
		this.speciesList = new ArrayList<>();
	}
	
	
	public boolean storagePlace(String placeName, int placeDepartment, String square, int placeType, String placeOpeningDay, String communityName, String placePhoto, double financial){
		
		Place newPlace = new Place(placeName,placeDepartment,square,placeType,placeOpeningDay,communityName,placePhoto,financial);
		
		for(int i=0;i<storage.length;i++){
			
			if(storage[i]==null){
				
				storage[i]=newPlace;
				return true;
				
			}else if (storage[i].getPlaceName().equals(placeName)){
				
			return false;
			}
		}
		
		return false; 
		
	}

	public String listPlace(String placeName){

		String lista = "";
		for (int i = 0; i < storage.length; i++) {
			if(storage[i]!=null){
				lista += "\n" + storage[i].getPlaceName();
			}
		}
		return lista;

	}
	
	
	public Place searchPlace(String placeName){
		
		for(int i = 0; i<storage.length; i++){
			
			Place temporal = storage[i];
			
			if (temporal !=null){
				
				if (placeName.equals(temporal.getPlaceName())){
				
				return temporal;
				}
				
			}
			
		}
		
		return null;
		
	}

	public String listDepartment(){
		
		Department[] arrangementDepartment = Department.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangementDepartment.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangementDepartment[i];
			
		}
		
		return lista;
		
	}

	public String listType(){
		
		Type[] arrangementType = Type.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangementType.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangementType[i];
			
		}
		
		return lista;
		
	}
	
	public String showPlace(String placeName){
		
		Place temporal = searchPlace(placeName);
		
		if(temporal==null){
			
			return "EL lugar no se encuentra";
		}
		
		return temporal.toString();
		
	}

	public String showCommunity(String communityName){
		
		Community temporal = searchCommunity(communityName);
		
		if(temporal==null){
			
			return "EL lugar no se encuentra";
		}
		
		return temporal.toString();
		
	}

	public Community searchCommunity(String communityName){
		
		for(int i = 0; i<storage2.length; i++){
			
			Community temporal = storage2[i];
			
			if (temporal !=null){
				
				if (communityName.equals(temporal.getCommunityName())){
				
				return temporal;
				}
				
			}
			
		}
		
		return null;
		
	}
	public boolean storageCommunity(String communityName, int communityType, String communityBossName, String communityBossPhone, int communityProblems, double communityAmount, int communityDepartment){
		
		Community newCommunity = new Community(communityName,communityType,communityBossName,communityBossPhone,communityProblems,communityAmount,communityDepartment);
		
		for(int i=0;i<storage2.length;i++){
			
			if(storage2[i]==null){
				
				storage2[i]=newCommunity;
				return true;
				
			}else if (storage2[i].getCommunityName().equals(communityName)){
				
			return false;
			}
		}
		
		return false; 
		
	}

	public String listCommunity(String communityName){

		String lista = "";
		for (int i = 0; i < storage2.length; i++) {
			if(storage2[i]!=null){
				lista += "\n" + storage2[i].getCommunityName();
			}
		}
		return lista;

	}
	
	public String listTypeCommunity(){
		
		typeCommunity[] arrangementTypeCommunity = typeCommunity.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangementTypeCommunity.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangementTypeCommunity[i];
			
		}
		
		return lista;
		
	}

	public String listProblemCommunity(){
		
		ProblemCommunity[] arrangementProblemCommunity =ProblemCommunity.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangementProblemCommunity.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangementProblemCommunity[i];
			
		}
		
		return lista;
		
	}

	public String listProductType(){
		
		ProductType[] arrangemenProductType= ProductType.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangemenProductType.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangemenProductType[i];
			
		}
		
		return lista;
		
	}

	public boolean storageProduct(String communityName, String productName, double productNatural, int productType, String productHandMade){
		
		Product newProduct = new Product(communityName,productName,productNatural,productType,productHandMade);
		
		for(int i=0;i<storage3.length;i++){
			
			if(storage3[i]==null){
				
				storage3[i]=newProduct;
				return true;
				
			}else if (storage3[i].getProductName().equals(productName)){
				
			return false;
			}
		}
		
		return false; 
		
	}

	public String listProduct(String productName){

		String lista = "";
		for (int i = 0; i < storage3.length; i++) {
			if(storage3[i]!=null){
				lista += "\n" + storage3[i].getProductName();
			}
		}
		return lista;

	}

	public boolean eliminateProduct(String productName){
	
		int index = findProduct(productName);
		
		if (index != -1){
			
			storage3[index] = null;
			return true;
		}
		
		return false;
		
	}

	public int findProduct(String productName){
		
		for(int i = 0; i<storage3.length; i++){
			
			Product temporal = storage3[i];
			
			if (temporal !=null){
				
				if (productName.equals(temporal.getProductName())){
				
				return i;
				}
				
			}
			
		}
		
		return -1;
		
	}

	public boolean storageSpecies(String placeName, String speciesName, int speciesType, String speciesPhoto, int speciesAmount){
		
		Species newSpecies = new Species(placeName,speciesName,speciesType,speciesPhoto,speciesAmount);
		
		for(int i=0;i<storage4.length;i++){
			
			if(storage4[i]==null){
				
				storage4[i]=newSpecies;
				return true;
				
			}else if (storage4[i].getSpeciesName().equals(speciesName)){
				
			return false;
			}
		}
		
		return false; 
		
	}

	public String listSpecies(){

		String lista = "";
		for (int i = 0; i < storage4.length; i++) {
			if(storage4[i]!=null){
				lista += "\n" + storage4[i].getSpeciesName();
			}
		}
		return lista;

	}

	public Species searchSpecies(String speciesName){
		
		for(int i = 0; i<storage4.length; i++){
			
			Species temporal = storage4[i];
			
			if (temporal !=null){
				
				if (speciesName.equals(temporal.getSpeciesName())){
				
				return temporal;
				}
				
			}
			
		}
		
		return null;
		
	}
	
	public String showSpecies(String speciesName){
		
		Species temporal = searchSpecies(speciesName);
		
		if(temporal==null){
			
			return "La especie no se encuentra";
		}
		
		return temporal.toString();
		
	}

	public String listSpeciesType(){
		
		SpeciesType[] arrangementSpeciesType = SpeciesType.values();
		
		String lista = "";
		
		for (int i = 0; i < arrangementSpeciesType.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arrangementSpeciesType[i];
			
		}
		
		return lista;
		
	}

	public String departmentList() {

        Department[] arrangementDepartment = Department.values();

        String list = "";

        for (int i = 0; i < arrangementDepartment.length; i++) {

            list += "\n" + (i + 1) + "- " + arrangementDepartment[i];
        }

        return list;
    }


	/**
	 * Descripcion: Este metodo permite obtener la marca de Consola con mas unidades
	 * pre: El arreglo almacenamiento esta inicializado
	 * 
	 * @return String, mensaje con la consulta
	 */
	public String specieWithMoreAmount() {

		String msg = "";
		int acumuladoMarca = 0;
		int maximo = 0;

		String marcaMaxima = "";

		for (int i = 0; i < storage4.length; i++) {

			if (storage4[i] != null) {

				if (storage4[i] instanceof Species) {

					String speciesName = ((Species) storage4[i]).getSpeciesName(); //Polimorfismo + Downcasting

					for (int j = 0; j < storage4.length; j++) {

						if (storage4[j] instanceof Species) {

							if (((Species) storage4[j]).getSpeciesName().equals(speciesName)) { //Polimorfismo + Downcasting

								acumuladoMarca += storage4[j].getSpeciesAmount();

							}

						}

					}

					if (maximo < acumuladoMarca) {

						maximo = acumuladoMarca;
						marcaMaxima = speciesName;

					}

					acumuladoMarca = 0;

				}

			}

		}

		msg += "La especie con mas cantidad es: " + marcaMaxima + " con " + maximo + " unidades.";

		return msg;
	}






	public List<Species> getAllSpecies() {
		return new ArrayList<>(Arrays.asList(storage4)); // Asumiendo que 'storage4' es tu almacenamiento de especies
	}

	public String listPlacesWithNameAndArea() {
		String list = "";
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null) {
				list += "\n" + storage[i].getPlaceName() + " - area: " + storage[i].getSquare();
			}
		}
		return list;
	}

}


	
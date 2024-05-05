package model;

public class Species {

    private String placeName;
    private String speciesName;
	private int speciesType;
	private String speciesPhoto;
	private int speciesAmount;

    public Species(String placeName,String speciesName, int speciesType, String speciesPhoto, int speciesAmount){
		
        this.placeName = placeName;
		this.speciesName = speciesName; 
		this.speciesType = speciesType;
		this.speciesPhoto = speciesPhoto;
		this.speciesAmount = speciesAmount;
    }

    public String toString(){
		
		String msg = "";
		
		msg += "\nNombre : "+speciesName;
		msg += "\nTipo : "+speciesType;
		msg += "\nUrl: " +speciesPhoto;
        msg+= "\nCantidad :"+speciesAmount;
		
		return msg;
	}

    public String getPlaceName() {
        return placeName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getSpeciesType() {
        return speciesType;
    }

    public String getSpeciesPhoto() {
        return speciesPhoto;
    }

    public int getSpeciesAmount() {
        return speciesAmount;
    }

    public void setSpeciesAmount(int speciesAmount){
		
		this.speciesAmount = speciesAmount;
		
	}

    
}

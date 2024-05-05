package model;

public class Place {

	// Atributos deben de ser privados porque solamente deben ser accibles por la
	// clase.

	private String placeName;
	private int placeDepartment;
	private String square;
	private int placeType;
	private String placeOpeningDay;
	private String communityName;
	private String placePhoto;
	private double financial;

	// Constructor

	public Place(String placeName, int placeDepartment, String square, int placeType, String placeOpeningDay,
			String communityName, String placePhoto, double financial) {

		this.placeName = placeName;
		this.placeDepartment = placeDepartment;
		this.square = square;
		this.placeType = placeType;
		this.placeOpeningDay = placeOpeningDay;
		this.communityName = communityName;
		;
		this.placePhoto = placePhoto;
		this.financial = financial;

	}

	// Analizador
	public String toString() {

		String msg = "";

		msg += "Nombre : " + placeName;

		msg += "\nDepartamento : " + placeDepartment;
		msg += "\nArea : " + square;
		msg += "\nTipo : " + placeType;
		msg += "\nFecha de inaguracion : " + placeOpeningDay;
		msg += "\nComunidad presente : " + communityName;
		msg += "\nUrl: " + placePhoto;
		msg += "\nSostenimiento : " + financial;

		return msg;
	}

	// Analizador
	public String getPlaceName() {

		return this.placeName;

	}

	public String getSquare() {

		return this.square;
	}

	public Department getDepartment() {
		return getDepartment();
	}

}
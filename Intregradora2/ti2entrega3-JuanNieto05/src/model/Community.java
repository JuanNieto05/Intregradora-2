package model;

public class Community {
    
    private String communityName;
	private int communityType;
	private String communityBossName;
	private String communityBossPhone;
	private int communityProblems;
	private double communityAmount;
	private int communityDepartment;
    

    public Community(String communityName, int communityType, String communityBossName, String communityBossPhone, int communityProblems, double communityAmount, int communityDepartment) {
		
		this.communityName = communityName; 
		this.communityType = communityType;
		this.communityBossName = communityBossName;
		this.communityBossPhone = communityBossPhone;
		this.communityProblems = communityProblems;
		this.communityAmount = communityAmount;
		this.communityDepartment = communityDepartment;
	}

	public String toString() {

		String msg = "";

		msg += "Nombre : " + communityName;

		msg += "\nTipo de Comunidad : " + communityType;
		msg += "\nNombre de jefe : " + communityBossName;
		msg += "\nNumero de Jefe : " + communityBossPhone;
		msg += "\nProblemas de comunidad : " + communityProblems;
		msg += "\nCantidad de personas : " + communityAmount;
		msg += "\nDepartamento: " + communityDepartment;

		return msg;
	}



    public int getCommunityType() {
		return communityType;
	}



	public String getCommunityBossPhone() {
		return communityBossPhone;
	}



	public double getCommunityAmount() {
		return communityAmount;
	}



	public String getCommunityName() {
        return communityName;
    }

    public String getCommunityBossName() {
        return communityBossName;
    }

	public int getCommunityProblems() {
		return communityProblems;
	}

    
}


package model;

public class Product {
    
    private String communityName;
    private String productName;
    private double productNatural;
	private int productType;
    private String productHandMade;

    public Product(String communityName, String productName, double productNatural, int productType, String productHandMade){
		
        this.communityName = communityName;
		this.productName = productName; 
		this.productNatural = productNatural;
		this.productType = productType;
		this.productHandMade = productHandMade;
	}

    public String getCommunityName() {
        return communityName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductNatural() {
        return productNatural;
    }

    public int getProductType() {
        return productType;
    }

    public String getProductHandMade() {
        return productHandMade;
    }


}

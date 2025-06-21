package eCommerce;

public class Product{
  private int prodId;
  private String prodName, category;

  public Product(int prodId, String prodName, String category){
    this.prodId = prodId;
    this.prodName = prodName;
    this.category = category;
  }

  public int getProductId(){
    return prodId;
  }

  public String getProductName(){
    return prodName;
  }

  public String getCategory(){
    return category;
  }

  public String toString(){
    return "ID: "+prodId+", Name: "+prodName+", Category: "+category;
  }
}
package Domain;

import java.util.*;

public class ProductCatalog {
  private Hashtable productSpecifications = new Hashtable();

  public ProductCatalog() {
    ProductSpecification ps;
	createProductItem(1,100,"product 1", 1);
	createProductItem(2,200,"product 2", 2);
	createProductItem(3,300,"product 3", 3);
	createProductItem(4,400,"product 4", 4);
	

  }

public void createProductItem(int upc, int price, String specification, int indice) {
	ProductSpecification ps =
        new ProductSpecification(upc, price, specification);
    productSpecifications.put(new Integer(indice), ps);
}

  public ProductSpecification specification(int upc) {
    return (ProductSpecification) productSpecifications.get(new Integer(upc));
  }
}

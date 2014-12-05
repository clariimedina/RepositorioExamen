	package Domain;

import workflow.*;

public class Store {
	private ProductCatalog productCatalog = new ProductCatalog();
	private POST postCatalog = new POST( productCatalog );

	public POST getPOSTCatalog() {
		return postCatalog;
	}
}

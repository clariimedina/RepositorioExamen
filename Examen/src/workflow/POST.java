package workflow;

import Domain.*;


public class POST {
	private ProductCatalog productCatalog;
	private Sale sale;

	public POST( ProductCatalog catalog )
	{
		productCatalog = catalog;
	}

	public void endSale()
	{
		sale.becomeComplete();
	}

	public void EnterItem( int upc, int quantity )
	{
		if( isNewSale() )
		{
			sale = new Sale();
		}
		createEspecification(upc, quantity);
	}

	public void createEspecification(int upc, int quantity) {
		ProductSpecification spec = productCatalog.specification( upc );
		sale.makeLineItem( spec, quantity );
	}

	public void makePayment( float cashTendered )
	{
		sale.makePayment( cashTendered );
	}

	private boolean isNewSale()
	{
		return ( sale == null ) || ( sale.isComplete() );
	}

	public float getTotal()
    {
		return sale.total();
    }

	public Sale getSale()
	{
		return sale;
	}
}

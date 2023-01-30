package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
	
}

package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrederPage {
    public OrederPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "ConfirmAddressID")
     private WebElement deliveryOptions;
    @FindBy(xpath = "//label[@class='custom-control-label']")
   private  WebElement groupOrderBox;
    @FindBy(id="getAddressNextButton")
    private WebElement nextButton;
    @FindBy(id="addressPreview")
    private WebElement officeAddressText;



    public void getdeliveryOption(String option){
        BrowserUtils.selectBy(deliveryOptions,option,"text");
    }
    public void clickGrouporder(){
        groupOrderBox.click();
    }
    public void clickNextButton(){
        nextButton.click();
    }

}

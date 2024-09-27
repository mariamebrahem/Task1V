import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tset {
    WebDriver driver;

    By searchbox = By.id("twotabsearchtextbox");
    By searchicon =By.id("nav-search-submit-button");
    By firstitem= By.xpath("(//div/div/span[@data-component-type=\"s-product-image\"])[3]");
    By AddtocartButton =By.xpath("//input[@id=\"add-to-cart-button\"]");

    By cart= By.cssSelector("#nav-cart");
    By shoppingcart =By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h2");

    By DissmMsg =By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");

    By todays =By.xpath("//*[@id=\"nav-xshop\"]/a[1]");

    By seemore =By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a");

    By grocery =By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[15]/div/label/i");
    By disscount =By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[4]/div/span[2]/div/label/i");
    By chooseitem =By.xpath("(//a[@data-testid=\"product-card-link\"])[3]");
    Tset (WebDriver driver){
        this.driver =driver;
    }

    public void enterkey (String key){
        driver.findElement(searchbox).sendKeys(key);
    }
    public void clickonsearchicon (){
        driver.findElement(searchicon).click();
    }
    public void clickonFirstitem (){
        driver.findElement(firstitem).click();
    }
    public void clickonAddtocartButton (){
        driver.findElement(AddtocartButton).click();
    }
    public void clickoncart (){
        driver.findElement(cart).click();
    }
    public boolean gettext(){
       return driver.findElement(shoppingcart).isDisplayed();
    }

//scenario2

    public void dissMsg(){
        driver.findElement(DissmMsg).click();
    }
    public void clickontodays (){
        driver.findElement(todays).click();
    }
    public void clickonseemore (){
        driver.findElement(seemore).click();
    }
    public void choosegrocery(){
        driver.findElement(grocery).click();
    }
    public void choosedisscount(){
        driver.findElement(disscount).click();
    }
    public void chooseAnyitem(){
        driver.findElement(chooseitem).click();
    }
}

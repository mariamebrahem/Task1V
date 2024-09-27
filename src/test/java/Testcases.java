import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Testcases {

    WebDriver driver;
   Tset TsetObj;


    @BeforeClass
   public void setup(){

        driver =new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        TsetObj =new Tset(driver);
}
@Test(priority = 0)
    public void Scenario1(){

        TsetObj.enterkey("car accessories");
        TsetObj.clickonsearchicon();
        TsetObj.clickonFirstitem();
        TsetObj.clickonAddtocartButton();
        TsetObj.clickoncart();
    Assert.assertEquals(TsetObj.gettext(),true);

    }

    @Test(priority = 1)
    public void Scenario2(){
        TsetObj.dissMsg();
        TsetObj.clickontodays();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        TsetObj.clickonseemore();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        TsetObj.choosegrocery();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        TsetObj.choosedisscount();
        TsetObj.chooseAnyitem();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        TsetObj.clickonAddtocartButton();



    }
    @AfterClass
    public void quit(){

      //  driver.quit();

    }


}

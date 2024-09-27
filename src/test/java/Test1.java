import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.amazon.com/");

        /*try {
            // Navigate to the Amazon page with the captcha
           // driver.get("https://www.amazon.com/errors/validateCaptcha?amzn=HruECvfxhl1Bhm7ZXsG%2B0g%3D%3D&amzn-r=%2F&field-keywords...");

            // Wait for the captcha element to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement captchaElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img")));

            // Get the captcha text from the image
            String captchaText = captchaElement.getAttribute("alt");

            // Enter the captcha text into the input field
            WebElement captchaInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"captchacharacters\"]")));
            captchaInput.sendKeys(captchaText);

            // Click the "Continue shopping" button
            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[2]/div/span/span/button")));
            continueButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }*/


        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("car accessories");

        WebElement searchicon = driver.findElement(By.id("nav-search-submit-button"));
        searchicon.click();

        WebElement firstitem =driver.findElement(By.xpath("(//div/div/span[@data-component-type=\"s-product-image\"])[3]"));
        firstitem.click();

        WebElement AddtocartButton =driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
        AddtocartButton.click();

        WebElement cart =driver.findElement(By.cssSelector("#nav-cart"));
        cart.click();

        WebElement shoppingcart =driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h2"));
        System.out.println(shoppingcart.getText());

        WebElement todaysdeals =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        todaysdeals.click();
    }
}

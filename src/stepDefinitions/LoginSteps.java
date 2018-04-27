package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class LoginSteps {

    private WebDriver driver;

    @Given("the user is on the Liberty Mutual home page")
    public void goToLibertyMutualHomePage() {
        System.setProperty("webdriver.chrome.driver", "jars/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.libertymutual.com");
        System.out.println("User is on the login page");
    }

    @When("the user enters the Atlanta zipcode")
    public void enterAtlantaZipcodeAndGetQuote() {
        WebElement element = driver.findElement(By.className("icon-products-auto"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        driver.findElement(By.name("zipcode")).sendKeys("30317");

        driver.findElement(By.xpath("//*[contains(text(), 'Get a Quote')]")).click();
    }

    @Then("the user should see the city of Atlanta populated on the create quote screen")
    public void cityFieldShouldBePopulatedWithAtlanta() throws InterruptedException {
        Thread.sleep(20000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"city-customer-0\"]/span[2]/input"));
        assertThat(element.getAttribute("value"), is("Atlanta"));
        System.out.println("User sees account balance");
    }
}
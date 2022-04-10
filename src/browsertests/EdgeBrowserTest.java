package browsertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        //Website URL
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Setting the drivers
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Creating "driver" object
        WebDriver driver = new EdgeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("The current title of the page is: " + title);

        //Print URL
        String url = driver.getCurrentUrl();
        System.out.println("The current URL of the page is: " + url);

        //Print Page Source
        String pageSource = driver.getPageSource();
        System.out.println("The current page source of the page is: " + pageSource);

        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("cctiwari123@hotmail.co.uk");

        //Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Asdfghjkl123556");

        //Close Browser
        driver.close();
    }
}

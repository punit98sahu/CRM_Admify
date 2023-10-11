package Utilitiy;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

    private WebDriver driver;

    public WaitUtility(WebDriver driver) {
        this.driver = driver;
    }

    // Implicit wait
    public void implicitWait(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    // Page load wait
    public void pageLoadWait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
    }

    // Explicit wait
    public void explicitWait(int sec, WebElement ele) {
        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(sec));
        ww.until(ExpectedConditions.visibilityOf(ele));
    }

    // Fluent wait
    public void fluentWait(int sec, WebElement ele, int pollingFreq) {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(sec))
                .pollingEvery(Duration.ofSeconds(pollingFreq))
                .ignoring(NoSuchElementException.class);

        fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("fw"));
            }
        });
    }
}
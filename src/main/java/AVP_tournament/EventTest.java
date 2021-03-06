package AVP_tournament;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EventTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void event() {
    driver.get("http://34.130.141.211/");
    driver.manage().window().setSize(new Dimension(1050, 652));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("jamesbond101@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("123456");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".col-md-3:nth-child(2) .img-quick-start")).click();
    driver.findElement(By.xpath("//input[@value=\'\']")).click();
    driver.findElement(By.cssSelector(".event-input")).sendKeys("Avp Volleyball");
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Volleyball");
    driver.findElement(By.cssSelector(".col-2 > #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".container:nth-child(4) > .col-10")).click();
    driver.findElement(By.cssSelector(".main-width")).click();
    driver.findElement(By.cssSelector(".ant-picker-focused > .ant-picker-input")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > .ant-picker-cell:nth-child(5) > .ant-picker-cell-inner")).click();
    driver.findElement(By.cssSelector(".ant-picker-focused > .ant-picker-input")).click();
    driver.findElement(By.cssSelector("div.App div.new-event-profile.container.p-0:nth-child(2) div.row.mx-0 div.col-6.m-auto.text-center.p-0 div.row.main-width div.col-12.p-0:nth-child(4) div.container:nth-child(4) div.row.shadow-box div.col-7.p-0.text-right.box-shadow-text.m-auto.pr-1 div.ant-picker.ant-picker-borderless.pr-0.text-uppercase.p-0 > div.ant-picker-input")).click();
    driver.findElement(By.cssSelector("div.App div.new-event-profile.container.p-0:nth-child(2) div.row.mx-0 div.col-6.m-auto.text-center.p-0 div.row.main-width div.col-12.p-0:nth-child(4) div.container:nth-child(4) div.row.shadow-box div.col-7.p-0.text-right.box-shadow-text.m-auto.pr-1 div.ant-picker.ant-picker-borderless.pr-0.text-uppercase.p-0.ant-picker-focused div.ant-picker-input > input:nth-child(1)")).click();
    driver.findElement(By.xpath("//ul[2]/li[2]/div")).click();
    driver.findElement(By.cssSelector(".ant-picker-time-panel-column:nth-child(3) > .ant-picker-time-panel-cell:nth-child(2) > .ant-picker-time-panel-cell-inner")).click();
    driver.findElement(By.cssSelector(".ant-picker-time-panel-column:nth-child(2) > .ant-picker-time-panel-cell:nth-child(3) > .ant-picker-time-panel-cell-inner")).click();
    driver.findElement(By.cssSelector(".ant-picker-time-panel-column:nth-child(3) > .ant-picker-time-panel-cell:nth-child(2) > .ant-picker-time-panel-cell-inner")).click();
    driver.findElement(By.cssSelector(".ant-btn > span")).click();
    driver.findElement(By.cssSelector(".new-event")).click();
    driver.findElement(By.cssSelector(".DropdownBar > #points-hamburger > div")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".DropdownBar > #points-hamburger > div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("span li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".SubmitButton")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .container > .row > .col-6 > .ml-1 > #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".ant-picker-focused > .ant-picker-input")).click();
    driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/ul[2]/li[2]/div")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(2) > .ant-picker-time-panel-cell:nth-child(3) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(3) > .ant-picker-time-panel-cell:nth-child(2) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(2) > .ant-picker-time-panel-cell:nth-child(8) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(1) > .ant-picker-time-panel-cell:nth-child(7) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".ant-picker-focused > .ant-picker-input")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(1) > .ant-picker-time-panel-cell:nth-child(10) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-picker-time-panel-column:nth-child(3) > .ant-picker-time-panel-cell:nth-child(2) > .ant-picker-time-panel-cell-inner:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(13) .ant-btn")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(13) span:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".col-6:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".col-6:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".col-6:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    js.executeScript("window.scrollTo(0,1054.6666259765625)");
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(5) .col-6 img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".col-6 > .webkit_spinner_none")).click();
    driver.findElement(By.cssSelector("div:nth-child(7) > .container .col-6 > div:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    driver.findElement(By.cssSelector(".container:nth-child(8) .text-right > .img-fluid")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) .text-right")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(7) > .container:nth-child(8) > .row")).click();
    driver.findElement(By.cssSelector(".container:nth-child(8) .col-5 > .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(8) .col-5 > .form-control")).sendKeys("1");
    {
      WebElement element = driver.findElement(By.cssSelector(".container:nth-child(9) .form-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".container:nth-child(9) .form-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".container:nth-child(9) .form-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".container:nth-child(9) > .row")).click();
    driver.findElement(By.cssSelector(".container:nth-child(9) .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(9) .form-control")).sendKeys("2");
    driver.findElement(By.cssSelector(".mx-0")).click();
    driver.findElement(By.cssSelector(".container:nth-child(1) > .mt-0 > .col-1:nth-child(4)")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(8) > div:nth-child(3) #score-hamburger > div")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(4) .col-1 > #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(4)")).click();
    driver.findElement(By.cssSelector("div:nth-child(5) .col-1 > #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(6) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".container:nth-child(7) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".container:nth-child(8) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(8) > div:nth-child(9) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(8) > div:nth-child(9) #score-hamburger")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".col-12:nth-child(8) > div:nth-child(9) #score-hamburger"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".col-12:nth-child(8) > div:nth-child(9) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(9) > .container:nth-child(2) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".container:nth-child(4) > .col-10")).click();
    driver.findElement(By.cssSelector(".container:nth-child(3) #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".container:nth-child(6) > .col-10")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2) > .row > .text-capitalize")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2) > .row > .col-6 > .ml-1 > #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.name("leagueCost")).click();
    driver.findElement(By.name("leagueCost")).sendKeys("$20");
    driver.findElement(By.cssSelector(".container:nth-child(4) .col-6 > .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(4) .col-6 > .form-control")).sendKeys("2%");
    driver.findElement(By.cssSelector(".w-100")).click();
    driver.findElement(By.cssSelector(".w-100")).sendKeys("abcd");
    driver.findElement(By.cssSelector(".container:nth-child(6) .pr-2 > .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(6) .pr-2 > .form-control")).sendKeys("$1");
    driver.findElement(By.cssSelector(".container:nth-child(7) .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(7) .form-control")).sendKeys("$2");
    driver.findElement(By.cssSelector(".container:nth-child(8) .col-6 > .form-control")).click();
    driver.findElement(By.cssSelector(".container:nth-child(8) .col-6 > .form-control")).sendKeys("$3");
    driver.findElement(By.cssSelector(".col-12:nth-child(10) > div > .container .pr-1")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(11) .mt-0")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2) > .mt-0 > .col-1 > #score-hamburger img")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".container:nth-child(2) > .mt-0 > .col-1 > #score-hamburger img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".col-12:nth-child(11) > div > .container #score-hamburger img")).click();
    driver.findElement(By.cssSelector(".dropdown_animation li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".container:nth-child(4) label > img")).click();
    driver.findElement(By.id("file-input-pdf")).sendKeys("C:\\fakepath\\Prathamik_Shikshak_Rulebook_2019.pdf");
    driver.findElement(By.id("output")).click();
    {
      WebElement element = driver.findElement(By.id("output"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Testing demo'}", element);
    }
    driver.findElement(By.cssSelector(".tool:nth-child(1) > .tool--btn")).click();
    driver.findElement(By.cssSelector(".fa-align-left")).click();
    {
      WebElement element = driver.findElement(By.id("output"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("output"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("output"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".col-12:nth-child(12)")).click();
    driver.findElement(By.id("output")).click();
    driver.findElement(By.id("output")).click();
    {
      WebElement element = driver.findElement(By.id("output"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("output")).click();
    {
      WebElement element = driver.findElement(By.id("output"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Testing demo'}", element);
    }
    driver.findElement(By.cssSelector(".fa-bold")).click();
    driver.findElement(By.cssSelector(".col-6:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".col:nth-child(2) > input")).click();
    driver.findElement(By.id("yellow-button-hover")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("#score-hamburger img")).click();
    driver.findElement(By.id("events-span")).click();
    driver.findElement(By.cssSelector(".ant-collapse-item:nth-child(3) > .ant-collapse-header")).click();
    driver.findElement(By.cssSelector(".ant-collapse-item:nth-child(3) .col-sm-10:nth-child(1) .rectangle-heading")).click();
  }
}

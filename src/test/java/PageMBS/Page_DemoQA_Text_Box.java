package PageMBS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_DemoQA_Text_Box {
    WebDriver driver;

    By  txtName = By.id("search_name"); // Puede ser de diferentes tipos, name, cssSelector, id, xpath, etc.
    By comboGrade = By.id("search_grade");

    By ChBxPageSize5 = By.id("p5");
    By ChBxPageSize10 = By.id("p10");
    By ChBxPageSize15 = By.id("p15");

    By chPrivacy = By.id("privacypolicy");
    By chTerms = By.id("termsconditions");
    By btnSearch = By.id("search");

    public void StartDriver(WebDriver driver){
        this.driver = driver; // Se indica que el driver que nos envien es el que tenemos en nuestra clase
    }

    public void CloseDriver(){
        driver.close(); // Se indica que el driver que nos envien es el que tenemos en nuestra clase
    }

    public void WriteName(String name){
        driver.findElement(txtName).sendKeys(name); // Método para cada uno de los pasos
    }

    public void SelectComboGrade(String Grade){
        Select grade = new Select(driver.findElement(comboGrade));
        grade.selectByVisibleText(Grade); // Selecciona de acuerdo al texto que se envie
    }

    public void ClickPageSize(Integer pageSize){

        if (pageSize == 5){
            driver.findElement(ChBxPageSize5).click();

        }

        if (pageSize == 10){
            driver.findElement(ChBxPageSize10).click();
        }

        if (pageSize == 15){
            driver.findElement(ChBxPageSize15).click();
        }


    }

    public void AcceptPrivacy(){
        driver.findElement(chPrivacy).click();
    }

    public void AcceptTerms(){
        driver.findElement(chTerms).click();
    }

    public void BtnSearch(){
        driver.findElement(btnSearch).click();
    }
}

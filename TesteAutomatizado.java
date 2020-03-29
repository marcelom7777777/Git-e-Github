package br.com.caelum.teste;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {

    public static void main(String[] args) throws InterruptedException {
        //abre firefox
        WebDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //acessa o site do google
        driver.get("http://www.google.com.br/");

        //digita no campo com nome "q" do google
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("java");

        //submete o form
        //campoDeTexto.submit(); 
        
        Thread.sleep(5000);
        driver.findElement(By.name("btnI")).click();
        
    }
}
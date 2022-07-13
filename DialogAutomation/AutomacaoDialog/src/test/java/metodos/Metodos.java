package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public static void main(String[] args) {

	}

	public void abrirBrowser() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dialog.ci/");
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void preencher(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}
	
	public void evidenciarTeste(String nomeEvidencia) throws IOException {
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
	    File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
	    FileUtils.copyFile(scrFile, destFile);
	
	}



}

package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnFaleComAgente = By.xpath("//ul[@id='top-menu']//a[text()='FALE COM A GENTE']");

	public By btnNome = By.xpath("//input[@name='name']");

	public By btnEmail = By.xpath("//input[@id='rd-email_field-b8FdKMnXK32KQH7bX23TRA']");

	public By btnEmpresa = By.xpath("//input[@id='rd-text_field-X8Y6wJewJ-aHeUrIg03Pdg']");

	public By btnCargoAtual = By.xpath("//option[text()='Estudante']");

	public By btnCelular = By.xpath("//input[@id='rd-phone_field-WyvLn7SCJU_lLvT7qM9MqA']");

	public By btnQtdUsuarios = By.xpath("//select[@id='rd-select_field-rOz55CU1Gw1Sed8cyBjFDg']//option[text()='De 1 a 49']");

	public By btnUsoParceiros = By.xpath("//input[@id='rd-radio_buttons_field-r15GeHYpOABGC_0dqUP_wQ_Uso_em_parceiros']");

	public By btnEnviar = By.xpath("//button[@id='rd-button-l1fb07i8']");

}

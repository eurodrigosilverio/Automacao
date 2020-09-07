//Automação do site das lojas Americanas para a vaga de QA da Dextra.
//Autor Rodrigo de Alencar Silvério

package siteAmericanas;

//Bibliotecas
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Test;
 
public class DesafioQA {
	
	
	String url; //endereço do site alvo
	WebDriver driver; //objeto do Selenium WebDriver
	
	/*Método que executa antes de todos os testes. Inicializa o site das Lojas Americanas.
	 A anotação Before indica que o método deve ser executado antes de todos os testes.*/
	@Before
	public void iniciar() {
		url = "https://www.americanas.com.br/";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\84\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	/*Método que executa depois de todos os testes. Encerrra o site das Lojas Americanas. 
	A anotação After sinaliza que este método deve ser executado por último*/
	@After
	public void finalizar() {
		driver.quit();
	}
	
	private By validarEmail = By.className("inputGroup-error ");
	private By validarSenha = By.cssSelector("#password > div > span");
	private By validarCPF = By.cssSelector("#cpf > div");
	
	String emailInvalido = "E-mail já cadastrado";
	String senha = "fraca";
	String cpf = "Campo inválido";
	
	//Método para validar a mensagem de senha fraca
	@Test
	public void validarSenhaFraca() {
		driver.get(url); //Abrir o site das Lojas Americanas
		driver.findElement(By.id("h_usr-link")).click();//Abre menu para cadastrar novo usuário
		driver.findElement(By.className("usr-signup")).click();//Clica no link para cadastrar novo usuário
		driver.findElement(By.id("email-input")).sendKeys(Keys.chord("pauloteste@gmail.com"));//Preenche o campo de email com o valor "pauloteste@gmail.com"
		driver.findElement(By.id("password-input")).sendKeys(Keys.chord("12"));//Insere a senha com 2 caracteres
		driver.findElement(By.cssSelector("button.btn.btn-primary.submit-button.cadastroForm-submit")).click();//Clica no link de cadastrar novo usuário
		assertEquals(senha, driver.findElement(validarSenha).getText());//Valida se o que está armazenado em 'senha' é igual ao que veio do elemento 'validarsenha'
		}

	//Método para validar a mensagem de email já cadastrada
	@Test
	public void validarEmailCadastrado() {
		driver.get(url);//Abre o site das Lojas Americanas
		driver.findElement(By.id("h_usr-link")).click();//Abre menu para cadastrar novo usuário
		driver.findElement(By.className("usr-signup")).click();//Clica no link para cadastrar novo usuário
		driver.findElement(By.id("email-input")).sendKeys(Keys.chord("teste@hotmail.com"));//Preenche o campo de email com o valor "teste@hotmail.com"
		driver.findElement(By.id("password-input")).sendKeys(Keys.chord("teste2020"));//Insere a senha "teste2020"
		driver.findElement(By.cssSelector("button.btn.btn-primary.submit-button.cadastroForm-submit")).click();//Clica no link de cadastrar novo usuário
		assertEquals(emailInvalido, driver.findElement(validarEmail).getText());//Valida se o que está armazenado em 'emailvalido' é igual ao que veio do elemento 'validarEmail'
		}
	
	//Método para validar CPF inválido
	@Test
	public void validarCPF() {
		driver.get(url); //Abre o site das Lojas Americanas
		driver.findElement(By.id("h_usr-link")).click();//Abre menu para cadastrar novo usuário
		driver.findElement(By.className("usr-signup")).click();//Clica no link para cadastrar novo usuário
		driver.findElement(By.id("email-input")).sendKeys(Keys.chord("pauloteste@gmail.com"));//Preenche o campo de email com o valor "pauloteste@gmail.com"
		driver.findElement(By.id("password-input")).sendKeys(Keys.chord("teste2020"));//Insere a senha "teste2020"
		driver.findElement(By.id("cpf-input")).sendKeys(Keys.chord("776.634.765-2"));//Insere cpf inválido
		driver.findElement(By.cssSelector("button.btn.btn-primary.submit-button.cadastroForm-submit")).click();//Clica no link de cadastrar novo usuário
		assertEquals(cpf, driver.findElement(validarCPF).getText());//Valida se a mensagem armazenada em 'cpf' é igual ao que veio do elemento validarCPF
		}
	
	@Test
	//Método para cadastrar novo usuário
	public void cadastrarNovoUsuario() {
		driver.get(url); //Abrir o site das Lojas Americanas.
		driver.findElement(By.id("h_usr-link")).click();//Abre o menu para cadastrar novo usuário
		driver.findElement(By.className("usr-signup")).click();//Clica no link para cadastrar novo usuário
		driver.findElement(By.id("email-input")).sendKeys(Keys.chord("pauloteste@gmail.com"));//Preenche o campo de email com o valor "pauloteste@gmail.com"
		driver.findElement(By.id("password-input")).sendKeys(Keys.chord("teste2020"));//Insere a senha "teste2020"
		driver.findElement(By.id("cpf-input")).sendKeys(Keys.chord("776.634.765-22"));//Insere CPF válido
		driver.findElement(By.id("name-input")).sendKeys(Keys.chord("Paulo Andrade"));//Insere nome e sobrenome
		driver.findElement(By.id("birthday-input")).sendKeys(Keys.chord("19/05/1990"));//Insere a data de nascimento
		driver.findElement(By.cssSelector("#gender > div:nth-child(2) > label")).click();//Seleciona o sexo do cliente
		driver.findElement(By.id("phone-input")).sendKeys(Keys.chord("(19) 98215-8448"));//Insere telefone do cliente
		driver.findElement(By.cssSelector("button.btn.btn-primary.submit-button.cadastroForm-submit")).click();//Clica no link de cadastrar novo usuário
		driver.findElement(By.id("h_search-input")).clear();//Limpa a caixa de busca na home da loja
		driver.findElement(By.id("h_search-input")).sendKeys(Keys.chord("Moto G6"));//Busca pelo telefone "Moto G6"
		driver.findElement(By.id("h_search-btn")).click();//Clica no ícone de busca
		driver.findElement(By.cssSelector("#content-middle > div:nth-child(6) > div > div > div > div.row.product-grid.no-gutters.main-grid > div:nth-child(1) > div > div.RippleContainer-sc-1rpenp9-0.dMCfqq > a > section > div.product-card-photo.Photo-bwhjk3-4.feDKYY.ViewUI-sc-1ijittn-6.iXIDWU > div > div > picture > img")).click();//Localiza o celular "Moto G6" e clica na imagem para poder seguir com a compra	
	}
	
	
	
}

package Teste_base2_mantis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados da Funcionalidade Login")
public class Teste01LoginTests {
    public Teste01LoginTests() {
    }

    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testRegistrarUmNovoUsuarioComDadosValidos() {
        //Abrir o navegador
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        //Abrir o site do Mantis
        navegador.get("https://mantis-prova.base2.com.br/login_page.php");

        // Clicar no botão que tem o ID igual a "username"
        navegador.findElement(By.id("username")).click();

        //Clicar escrever no ID "username" meu login
        navegador.findElement(By.id("username")).sendKeys(new CharSequence[]{"cristiana_carvalho"});

        //Clicar no botão no class: width-40 pull-right btn btn-success btn-inverse bigger-110
        navegador.findElement(By.cssSelector(".btn-success")).click();

        // Vou clicar no id "password" e escrever a senha
        navegador.findElement(By.id("password")).sendKeys(new CharSequence[]{"1234"});

        //Vou clicar no botão entrar
        navegador.findElement(By.cssSelector(".btn-success")).click();
    }
}

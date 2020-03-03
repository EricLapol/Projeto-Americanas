package americanas;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	static String url = "https://www.americanas.com.br/";
	public static WebDriver driver;
	static String nomePasta = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
	
	public static void Print(String nomePrint) throws IOException {

		File foto = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(foto,
				new File("C:\\Users\\Computador\\FTS125-workspace\\Americanas\\target\\Prints\\" + nomePasta
						+ "\\" + nomePrint + ".png"));
	}
	
	@Before
	public void primeiroIniciar() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Computador\\FTS125-workspace\\Americanas\\drivers\\chrome\\80\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	@After
	public void primeiroFinalizar() {
		driver.quit();
	}
	
}

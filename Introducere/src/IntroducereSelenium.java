
public class IntroducereSelenium {

	public static void main(String[] args) {
		//Invoking Browser
	   //chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.hrome.driver", "C:\\Users\\40746\\Downloads\\chromedriver_win32.exe");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://instagram.com/");
		System.out.println(driver.getCurrentUrl);
		driver.close();
		
		driver.get("https://myelectrica.ro/index.php?pagina=login");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("myelectrica_utilizator")).sendKeys("mail@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("1234");
		driver.findElement(By.id("myelectrica_login_btn")).click();

		driver.close();	
	}

}

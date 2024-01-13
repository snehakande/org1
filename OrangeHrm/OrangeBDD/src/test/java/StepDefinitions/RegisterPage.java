package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPage {
	WebDriver driver;

	@Given("user is on the register page")
	public void user_is_on_the_register_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/reg");

	}

	@When("user enter valid firstname, lastname , username and password")
	public void user_enter_valid_firstname_lastname_username_and_password(DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		String fname = ls.get(0).get(0);
		String lname = ls.get(0).get(1);
		String uname = ls.get(0).get(2);
		String pass = ls.get(0).get(3);

		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(uname);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);

	}

	@When("user select valid DOB")
	public void user_select_valid_dob(DataTable dataTable) {

		List<List<String>> ls = dataTable.cells();

		String date = ls.get(0).get(0);
		String month = ls.get(0).get(1);
		String year = ls.get(0).get(2);

		WebElement wbdate = driver.findElement(By.name("birthday_day"));
		Select sel1 = new Select(wbdate);
		sel1.selectByVisibleText(date);

		WebElement wbmonth = driver.findElement(By.name("birthday_month"));
		Select sel2 = new Select(wbmonth);
		sel2.selectByVisibleText(month);

		WebElement wbyear = driver.findElement(By.name("birthday_year"));
		Select sel3 = new Select(wbyear);
		sel3.selectByVisibleText(year);

	}

	@When("user select the gender")
	public void user_select_the_gender(DataTable dataTable) {

		List<Map<String,String>> mp = dataTable.asMaps();
		
		String gender = mp.get(0).get("gender");
		
		List<WebElement> ls =driver.findElements(By.xpath("//label[@Class='_58mt']"));
		
		for(WebElement abc: ls)
		{
			String b = abc.getText();
				
			if(b.equalsIgnoreCase(gender))
			{
				abc.click();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

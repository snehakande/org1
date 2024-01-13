package Steps;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo1 {

	@Given("user is on register page")
	public void user_is_on_register_page() {
		
	}

	@When("user enter firstname , lastname and username")
	public void user_enter_firstname_lastname_and_username(DataTable dataTable) {

		// List<List<String>> ls = dataTable.asLists();
		 List<List<String>> ls = dataTable.cells();

		//List<Map<String, String>> mp = dataTable.asMaps();
		
		for(List<String> abc: ls)
		{
			String a = abc.get(0);
			System.out.println(a);
			
			String b = abc.get(1);
			System.out.println(b);
			
			String c = abc.get(2);
			System.out.println(c);
			
			System.out.println("------------------------------------");

		}
		
	}

	@When("user select dob")
	public void user_select_dob() {
		System.out.println("------------------------------------");
		System.out.println("user select dob");
	}

	@When("use select gender")
	public void use_select_gender() {
		System.out.println("use select gender");

	}

}

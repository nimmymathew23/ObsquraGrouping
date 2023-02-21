package grouping;

import org.testng.annotations.DataProvider;

public class DataClass {
	@DataProvider(name="searchdata")
	public Object[][] searchValue(){
		Object[][] data={{"phone"},{"beautyitems"},{"kitchen"}};
		return data;
}
}

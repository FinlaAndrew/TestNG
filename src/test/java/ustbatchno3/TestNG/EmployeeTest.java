package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class EmployeeTest {

@Test
	public void testforEmployee() {
		Employee e = new Employee ("Finla",23,"Angular");
		assertEquals(e.getName(),"Finla");
		
}

}

package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class VishwaTest {
	
@Test
	public void vmtest() {
	int expected =2000;
	  
	  Vishwadetails v =new Vishwadetails("Hyderabad", 2000, 900);
	  String city="hyderabad";
	  List<Vishwadetails> details=Arrays.asList(v);
	  int ch=1,sq=1;
	  
	  assertEquals(expected, Viswasamudra.construction(details, ch, city, sq));
	  ch=2;
	  
	  expected=900;
	  assertEquals(expected, Viswasamudra.construction(details, ch, city, sq));
	  
}

}

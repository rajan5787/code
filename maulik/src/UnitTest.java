import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	Developer delTest;
	App appTest;
	AppUser appUserTest;
	String sName[]={"apple","mango","melon"};
	String sDes[]={"fruit1","fruit2","fruit3"};
	@Before
	public void setUp() throws Exception {
		delTest =new Developer();
		appTest =new App();
		appUserTest =new AppUser();
	}
	
	@Test
	public void test1() {
		for(int i=0;i<sName.length;i++){
			assertEquals(true,delTest.UploadApp(sName[i],sDes[i])); 
		}
	}
	
	
	@Test
	public void test2() {
		for(int i=0;i<sName.length;i++){
			assertEquals(sName[i],appTest.showname(i)); 
		}
	}
	

	
}

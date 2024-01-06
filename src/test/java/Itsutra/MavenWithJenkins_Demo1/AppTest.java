package Itsutra.MavenWithJenkins_Demo1;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Asserting Test");

        assertTrue( true );
    }
    
    @BeforeTest
    public void GetStartwithBrowser()
    {
    	System.out.println("Initliazing the Browser");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
    	
    }
    
    @AfterTest
    public void CloseBrowser()
    {
    	System.out.println("Closing Browser");

    	driver.close();
    }
}

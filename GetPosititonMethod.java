package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;

public class GetPosititonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		Point ele=driver.manage().window().getPosition();

		System.out.println("Start X="+ele.getX());
		System.out.println("Start Y="+ele.getY());
	}
}
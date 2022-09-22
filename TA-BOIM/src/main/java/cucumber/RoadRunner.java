package cucumber;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class RoadRunner {

	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			Main.main(new String[]
			{
				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
				"classpath:hrms/sceneoutlinefix",
				"-p","pretty",
				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
				"-m"
			});
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main Class Execption : "+e);
		}
	}
	
//	public static void main(String[] args) {
//		
//		int k=0;
//		Scanner sc = new Scanner(System.in);
//		boolean isTrue=true;
//		while(isTrue)
//		{
//			k = sc.nextInt();
//			
//			if(k==1) {
//				isTrue=sceneOne();
//			}
//			else if(k==2)
//			{
//				isTrue=sceneTwo();
//			}
//			else if(k==3)
//			{
//				isTrue=sceneThree();
//			}
//			else if(k==4)
//			{
//				isTrue=sceneFour();
//			}
//			else if(k==5)
//			{
//				isTrue=sceneFive();
//			}
//		}
//	}
//	
//	private static boolean sceneOne()
//	{
//		try {
//			Main.main(new String[]
//			{
//				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
//				"-p","pretty",
//				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
//				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
//				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
//				"-m"
//			});
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Main Class Execption : "+e);
//		}
//		return true;
//	}
//	
//	private static boolean sceneTwo()
//	{
//		try {
//			Main.main(new String[]
//			{
//				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
//				"-p","pretty",
//				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
//				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
//				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
//				"-m"
//			});
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Main Class Execption : "+e);
//		}
//		return true;
//	}
//	
//	private static boolean sceneThree()
//	{
//		try {
//			Main.main(new String[]
//			{
//				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
//				"-p","pretty",
//				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
//				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
//				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
//				"-m"
//			});
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Main Class Execption : "+e);
//		}
//		return true;
//	}
//	
//	private static boolean sceneFour()
//	{
//		try {
//			Main.main(new String[]
//			{
//				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
//				"-p","pretty",
//				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
//				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
//				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
//				"-m"
//			});
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Main Class Execption : "+e);
//		}
//		return true;
//	}
//	
//	private static boolean sceneFive()
//	{
//		try {
//			Main.main(new String[]
//			{
//				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
//				"-p","pretty",
//				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
//				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
//				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
//				"-m"
//			});
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Main Class Execption : "+e);
//		}
//		
//		return true;
//	}
}
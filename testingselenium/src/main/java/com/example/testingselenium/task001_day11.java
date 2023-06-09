package com.example.testingselenium;




import com.aventstac.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


	public class task001_day11 {
	public static void main(String args[])
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(spark);
		ExtentTest  test = extend.createTest("FaceBook","Login for facebook");
		test.log(Status.FAIL, "Sample test");
		ExtentTest  test1 = extend.createTest("FaceBook","Login for facebook");
		test1.log(Status.PASS, "Sample test");
		ExtentTest  test2 = extend.createTest("FaceBook","Login for facebook");
		test2.log(Status.SKIP, "Sample test");
		extend.flush();
		System.out.print("Finished");
	}
}
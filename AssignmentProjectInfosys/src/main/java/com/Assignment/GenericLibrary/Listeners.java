package com.Assignment.GenericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName() + " - Method Started", true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName() + "- Method Success", true);

	}

	public void onTestFailure(ITestResult result) {

		Reporter.log(result.getName() + " - Method Failed", true);

	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName() + " - Method Skipped", true);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log(result.getName() + " - Method Failed with Time Out", true);
	}

	public void onStart(ITestContext context) {

		Reporter.log(context.getName() + " - Started", true);

	}

	public void onFinish(ITestContext context) {

		Reporter.log(context.getName() + "- Finished", true);

	}

}

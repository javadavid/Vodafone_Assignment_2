package com.vodafone.testautomation.src;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Viswam Devireddy
 * @since September 5, 2016
 */
public class BrowserDriver {

	/**
	 * Static object of Selenium web driver class
	 */
	private static WebDriver mDriver = getCurrentDriver();
	/**
	 * Wait period for Web driver on particular event
	 */
	static WebDriverWait wait;

	/**
	 * Static method to initialize Selenium Web Driver
	 * @return
	 */
	public synchronized static WebDriver getCurrentDriver() {
		if (mDriver == null) {
			try {

				mDriver = new FirefoxDriver();
				wait = new WebDriverWait(mDriver, 30);
				FileReaderUtil.readFile();

			} catch (Exception e) {
				System.out.println("Exception in  WebDriver::getCurrentDriver: " + e.getStackTrace());
				Assert.fail(e.getMessage());
			}

			finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}
		}
		return mDriver;
	}

	/**
	 * Browser clean up while closing
	 *
	 */
	private static class BrowserCleanup implements Runnable {
		public void run() {
			System.out.println("Closing the browser");
			close();
		}
	}

	/**
	 * Method to destory the web driver
	 */
	public static void close() {
		try {
			getCurrentDriver().quit();
			mDriver = null;

		} catch (UnreachableBrowserException e) {
			System.out.println("cannot close browser: unreachable browser");
		}
	}

	/**
	 * This method loads the given URL in the browser
	 * @param url: url to the page to load
	 */
	public static void loadPage(String url) {
		System.out.println("Directing browser to:" + url);
		try {
			mDriver.get(url);
		} catch (Exception e) {
			System.out.println("Exception in  WebDriver::loadPage: " + e.getMessage());
		}

	}

	/**
	 * This method will navigate to My Vodafone link by clicking the curresponding the link (anchor tag with name)
	 * @param section
	 */
	public static void navigateMyVodafoneLink(String section) {
		System.out.println("Directing browser to My Vodafone:" + section);
		try {
			WebElement inputElement = mDriver.findElement(By.xpath("//div/ul/li/a[text()='My Vodafone']"));
			((JavascriptExecutor) mDriver).executeScript("arguments[0].click();", inputElement);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception in  WebDriver::navigateMyVodafoneLink: " + e.getMessage());
		}

	}

	/**
	 * This method will navigate to 'Login' page/ link
	 * @param section
	 */
	public static void navigateLoginLink(String section) {
		System.out.println("Directing browser to Login:" + section);
		try {
			WebElement inputElement = mDriver.findElement(By.xpath("//div//a[text()='Login']"));
			((JavascriptExecutor) mDriver).executeScript("arguments[0].click();", inputElement);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception in  WebDriver::navigateLoginLink: " + e.getMessage());
		}

	}

	/**
	 * This method will click the login button with userid and password
	 * The userid and password will be read from the properties file available in "src/main/resources/datafile.properties" file
	 */

	public static void login() {
		System.out.println("Trying to login");

		try {
			// Enter the wrong input as user name
			
			getCurrentDriver().findElement(By.id("myvfLoginOnlineId")).sendKeys(FileReaderUtil.getProperty("username"));

			// Enter Password
			getCurrentDriver().findElement(By.id("myvfLoginPassword")).sendKeys(FileReaderUtil.getProperty("password"));

			WebElement btnLogin = getCurrentDriver().findElement(By.id("sign-in-button"));
			((JavascriptExecutor) mDriver).executeScript("arguments[0].click();", btnLogin);
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Exception in  WebDriver::login: " + e.getMessage());
		}

	}

	/**
	 * This method will get the response after clicking the login button
	 * @return
	 */
	public static String getResponse() {
		System.out.println("Getting Response");
		String expMsg = getCurrentDriver().findElement(By.cssSelector("div.submitError")).getText();
		return expMsg;
	}
}

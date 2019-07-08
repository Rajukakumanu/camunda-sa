package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.TimeZone;

import com.aventstack.extentreports.ExtentTest;
import locators.CommonLocatorsPage;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefination.Hooks;

import com.csvreader.CsvReader;
import com.cucumber.listener.Reporter;

/**
 * This User actions class consists of all the common actions/Methods used for
 * this SA Application project
 *
 * @author kakur
 */

public class UserActions extends password_Encrypt implements CommonLocatorsPage {
    public static WebDriver driver;
    public static Properties properties = new Properties();
    public static Logger log = Hooks.log;
    public static String desDir;
    public static String csvDesDir;
    public static String requestS;
    public static String saIdStatus;
    public static CsvReader csvFile;
    public static int numOfHeaders;

    public UserActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = SA_REVIEW)
    public static WebElement review;

    @FindBy(xpath = DATE_PICKER_ICON)
    List<WebElement> datePickerIcon;

    @FindBy(xpath = MONTH_VIEW)
    WebElement monthView;

    @FindBy(xpath = MONTH_LIST)
    List<WebElement> monthList;

    @FindBy(xpath = SA_REQUEST_BUTTON)
    public static WebElement viewRequestButton;

    @FindBy(xpath = SA_QUICK_SEARCH)
    public static WebElement quickSearch;

    @FindBy(xpath = SA_FUTURE_DATE)
    WebElement futureDate;

    @FindBy(xpath = SA_GOTO_FINDINGS_POPUP)
    public static WebElement findingsPopup;

    @FindBy(xpath = SA_SAID)
    public static WebElement saStatus;

    @FindBy(xpath = SA_CANCEL_BUTTON)
    public static WebElement cancelButton;

    @FindBy(xpath = SA_CANCEL_OK)
    public static WebElement cancelOK;

    /**
     * This Method is to Click on SA form Logout Button
     */
    public void clickReview() {
        waitForPageToLoad();
        click(review, "review", 20);
    }

    /**
     * This Method is to wait for the action
     */
    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This Method is to check the status of the request
     */
    public String getSaStatus(String status) {
        waitForPageToLoad();
        saIdStatus = saStatus.getText();
        if (status.contains("CANCELLED")) {
            requestS = saIdStatus.split("\\s")[1];
            log.info("the status of the sa request is " + requestS);
            Assert.assertEquals(requestS, status);
            waitForPageToLoad();
        } else {
            requestS = saIdStatus.split(":")[1];
            log.info("the status of the sa request is " + requestS);
            Assert.assertTrue("Check the status of the request is ",
                    requestS.contains(status));
            waitForPageToLoad();
        }

        return requestS;
    }

    /**
     * Enters javaScript key input in text box
     *
     * @param element
     * @param sElementName
     * @param sInputValue
     * @param int          time
     */
    public void nativeType(WebElement element, String sElementName,
                           String inputText, int time) {
        try {
            waitForElementToLoad(element, sElementName, 10);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].value= inputText;", element);
        } catch (StaleElementReferenceException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName
                    + " is not attached to the page document");
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName + " was not found in DOM");
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Some Exception occured while clicking on "
                    + sElementName);
        }
    }

    /**
     * gets specified property value from TestData.properties file
     *
     * @param sKey return {@link String}
     */
    public static String getConfigProperty(String sKey) {
        String sKeyValue = null;
        try {
            FileInputStream inputStream = new FileInputStream(new File(
                    System.getProperty("user.dir") + File.separator + "src"
                            + File.separator + "test" + File.separator
                            + "resources" + File.separator + "TestData"
                            + File.separator + "env.properties"));
            properties.load(inputStream);
            sKeyValue = properties.getProperty(sKey);
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return sKeyValue;
    }

    /**
     * /** Returns a webelement based on index from the list of webelements
     *
     * @param listXpath
     * @param iElementIndex
     * @return {@link WebElement}
     */
    public WebElement getListWebElement(String listXpath, int iElementIndex) {
        List<WebElement> list = driver.findElements(By.xpath(listXpath));
        WebElement listElement = list.get(iElementIndex);
        return listElement;
    }

    /**
     * Clicks on webelement using javascript executor
     *
     * @param element
     * @param sElementName
     * @param iWaitTime
     */

    public void nativeClick(WebElement element, String sElementName,
                            int iWaitTime) {
        waitForPageToLoad();
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Error occured while native click on " + sElementName);
        }
    }

    /**
     * Enters key input in text box
     *
     * @param element
     * @param sElementName
     * @param sInputValue
     */
    public void type(WebElement element, String sElementName,
                     String sInputValue, int time) {
        try {
            waitForElementToLoad(element, sElementName, 10);
            element.clear();
            element.sendKeys(sInputValue);
        } catch (StaleElementReferenceException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName
                    + " is not attached to the page document");
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName + " was not found in DOM");
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Some Exception occured while clicking on "
                    + sElementName);
        }
    }

    /**
     * This method is to enter text in drop down fields
     *
     * @param element
     * @param sElementName
     * @param sInputValue
     * @param time
     */
    public void dropDownType(WebElement element, String sElementName,
                             String sInputValue, int time) {
        try {
            waitForElementToLoad(element, sElementName, 10);
            element.clear();
            element.sendKeys(sInputValue + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName
                    + " is not attached to the page document");
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName + " was not found in DOM");
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Some Exception occured while clicking on "
                    + sElementName);
        }
    }

    /**
     * Navigates to application URL
     */
    public void getToUrl(String sURL) {
        driver.get(sURL);
        waitForPageToLoad();
    }

    /**
     * Hovers the mouse on passed webelement
     *
     * @param HoverElement
     * @param sHoverEleName
     */
    public void mouseHover(WebElement HoverElement, String sHoverEleName) {
        try {
            Actions builder = new Actions(driver);
            builder.moveToElement(HoverElement).build().perform();
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Error occured while hovering " + HoverElement);
        }
    }

    /**
     * Selects an option from the dropdown
     *
     * @param element
     * @param sSize
     */
    public void selectDropdown(WebElement element, int index) {
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }

    /**
     * Returns first selected option from a dropdown
     *
     * @param dropDownElement
     * @return
     */
    public String getFirstSelectedOption(WebElement dropDownElement) {
        Select dropdown = new Select(dropDownElement);
        String firstOption = dropdown.getFirstSelectedOption().getText();
        return firstOption;
    }

    /**
     * Switches to passed iframe
     *
     * @param element
     */
    public void swithToFrame(WebElement element) {
        driver.switchTo().frame(element);
        waitForPageToLoad();
    }

    /**
     * Comes out of the iframe
     */
    public void swithToDefalutContent() {
        driver.switchTo().defaultContent();
    }

    /**
     * Purpose- This function to read the text
     *
     * @param WebElement
     * @param button
     * @param time
     */
    public void scrolldownAndClick(WebElement sectionEle, WebElement button,
                                   int time) {

        nativeClick(sectionEle, "sectionEle", time);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", button);
        waitForPageToLoad();
        nativeClick(button, "button", time);
    }

    /**
     * Purpose- This function to take the screen shots where ever specified
     *
     * @param screenShotName
     */

    public static void saveScreenShotToReports(String screenShotName) {
        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);

            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

            File DestFile = new File(System.getProperty("user.dir")
                    + File.separator + "maven-cucumber-report" + File.separator
                    + "screenshots" + File.separator + screenShotName + ".png");

            FileUtils.copyFile(SrcFile, DestFile);
            Reporter.addScreenCaptureFromPath(DestFile.toString());
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
    }

    /**
     * This method is to inputStream desired file
     *
     * @param sFilePath
     * @return
     */
    public static FileInputStream getFileInputStream(String sFilePath) {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(sFilePath);
            fileInputStream = new FileInputStream(file);
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return fileInputStream;
    }

    /**
     * Purpose- This function to read the text
     *
     * @param WebElement
     * @param sElement
     * @param time       return {@link eleText}
     */
    public String getText(WebElement element, String sElement, int time) {
        String eleText = null;
        try {

            isElementPresent(element, sElement, time);
            eleText = element.getText().trim();
        } catch (StaleElementReferenceException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElement
                    + " is not attached to the page document");
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElement + " was not found in DOM");
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Some Exception occured while clicking on " + sElement);
        }
        return eleText;
    }

    /**
     * Purpose- This function lets the webdriver wait until the page loads
     * completely
     *
     * @throws TimeoutException
     */
    public void waitForPageToLoad() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }

    }

    /**
     * Method - Method for User Click, waits until the element is loaded and
     * then performs a click action
     *
     * @param element
     * @param waitTime
     */

    public void click(WebElement element, String sElementName,
                      int optionWaitTime) {

        try {
            waitForElementToLoad(element, sElementName, optionWaitTime);
            element.click();
        } catch (StaleElementReferenceException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName
                    + " is not attached to the page document");
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName + " was not found in DOM");
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Some Exception occured while clicking on "
                    + sElementName);
        }
    }

    /**
     * Web driver waits for visibility of specified web element for the amount
     * of time specified.
     *
     * @param element
     * @param sElementName
     * @param waitTime
     * @return true or false
     */
    public boolean waitForElementToLoad(WebElement element,
                                        String sElementName, int waitTime) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {

            log.error(e.getStackTrace());
            Assert.fail("Element " + sElementName
                    + " was not visible in time - " + waitTime);
            return false;
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + element
                    + "is not attached to the page document");
            return false;
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Unable to find the element " + sElementName);
            return false;
        }
        return true;
    }

    /**
     * Returns true if the webelemnt is presents on webpage
     *
     * @param element
     * @param sElementName
     * @param waitTime
     * @return
     * @throws UnreachableBrowserException
     */
    public boolean isElementPresent(WebElement element, String sElementName,
                                    int waitTime) throws UnreachableBrowserException {
        boolean bFlag = false;

        try {
            WebDriverWait wait = new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.visibilityOf(element));
            if (element.isDisplayed() || element.isEnabled()) {
                bFlag = true;
            }
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
            Assert.fail("- No such element as " + sElementName);
        } catch (TimeoutException e) {
            log.error(e.getStackTrace());
            Assert.fail("- Timed out after waiting for the element "
                    + sElementName);
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Element for " + sElementName + " is not displayed");
        }
        return bFlag;
    }

    /**
     * Returns true if the web element is present and enabled on webpage
     *
     * @param locator
     * @param waitTime
     * @return
     */
    public boolean isElementEnabled(WebElement element, int waitTime) {
        boolean bFlag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            if (element.isDisplayed() && element.isEnabled()) {
                bFlag = true;
            }
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
        } catch (TimeoutException e) {
            log.error(e.getStackTrace());
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + element + " is not displayed");
        }
        return bFlag;
    }

    /**
     * Returns true if the web spinner element is present
     *
     * @param locator
     * @param waitTime
     * @return
     */
    public static boolean isSpinnerEnabled(WebElement element) {
        boolean bFlag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOf(element));
            if (element.isDisplayed()) {
                bFlag = true;
            }
        } catch (NoSuchElementException e) {
            log.error(e.getStackTrace());
        } catch (TimeoutException e) {
            log.error(e.getStackTrace());
        } catch (Exception e) {
            log.error(e.getStackTrace());
            Assert.fail("Element " + element + " is not displayed");
        }
        return bFlag;
    }

    /**
     * This is the method to encrypt and decode the password
     *
     * @param intText
     */

    public void password(String[] intText) {
        String strToEncode = "Smak1986";
        String key = "unlock";
        String strEncryptedString = encryptXOR(strToEncode, key);
        log.info("Encrypted string: " + strEncryptedString);
        String decodedPwd = decryptXOR(strEncryptedString, key);
        log.info("Decrypted string: " + decodedPwd);
    }

    /**
     * This is the method to pick the latest file from dir
     *
     * @param dirPath return File
     */
    public static File getLatestFilefromDir(String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
       /* if (files == null || files.length == 0) {
            return null;
        }*/
        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile;
    }

    public int readExcelDocument() throws EncryptedDocumentException,
            IOException {
        String home = getConfigProperty("DownloadPath");
        log.info("Print Src location " + home);
        File srcLatestFile = getLatestFilefromDir(home);
        log.info("Print  location latest file " + srcLatestFile);
        desDir = System.getProperty("user.dir") + File.separator + "Download";
        File desFilePath = new File(desDir);
        try {
            FileUtils.copyFileToDirectory(srcLatestFile, desFilePath);
            if (srcLatestFile.delete()) {
                log.info("Print File is deleted from src location");
            } else {
                log.info("Print File is not deleted");
            }
        } catch (IOException exp) {
            log.error(exp.getStackTrace());
        }
        log.info("======== File Path ======== "
                + getLatestFilefromDir(desDir).getAbsolutePath());

        FileInputStream fis = new FileInputStream(new File(
                getLatestFilefromDir(desDir).getAbsolutePath()));
        HSSFWorkbook workBook = new HSSFWorkbook(fis);
        Sheet sheet = workBook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        return rowCount;
    }

    public int readCSVFile() {
        String home = getConfigProperty("DownloadPathCSV");
        log.info("Print Src location " + home);
        File srcLatestFile = getLatestFilefromDir(home);
        log.info("Print  location latest file " + srcLatestFile);
        csvDesDir = System.getProperty("user.dir") + File.separator + "Download"
                + File.separator + "CSV";
        File desFilePath = new File(csvDesDir);
        try {
            FileUtils.copyFileToDirectory(srcLatestFile, desFilePath);
            if (srcLatestFile.delete()) {
                log.info("Print File is deleted from src location");
            } else {
                log.info("Print File is not deleted");
            }
        } catch (IOException exp) {
            log.error(exp.getStackTrace());
        }
        log.info("======== File Path ======== "
                + getLatestFilefromDir(csvDesDir).getAbsolutePath());

        try {
            csvFile = new CsvReader(getLatestFilefromDir(csvDesDir)
                    .getAbsolutePath());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            csvFile.readHeaders();
        } catch (IOException e) {
            e.printStackTrace();
        }
        numOfHeaders = csvFile.getHeaderCount();
        log.info("print the  num of headers "+numOfHeaders);

        for (int i = 0; i < numOfHeaders; i++) {

            try {
                log.info("print the header" + csvFile.getHeader(i));
                csvFile.readRecord();
                String rows = csvFile.getRawRecord();
                log.info("print rows data " + rows);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        csvFile.close();
        return numOfHeaders;

    }

    public String readPDFDocument() {
        String home = getConfigProperty("DownloadPath");
        log.info("Print Src location " + home);
        File srcLatestFile = getLatestFilefromDir(home);
        log.info("Print  location latest file " + srcLatestFile);
        desDir = System.getProperty("user.dir") + File.separator + "Download";
        File desFilePath = new File(desDir);
        try {
            FileUtils.copyFileToDirectory(srcLatestFile, desFilePath);
            if (srcLatestFile.delete()) {
                log.info("Print File is deleted from src location");
            } else {
                log.info("Print File is not deleted");
            }
        } catch (IOException exp) {
            log.error(exp.getStackTrace());
        }
        log.info("======== File Path ======== "
                + getLatestFilefromDir(desDir).getAbsolutePath());

        String pdfFileInText = null;
        PDDocument document;
        try {
            document = PDDocument.load(new File(getLatestFilefromDir(desDir)
                    .getAbsolutePath()));
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            PDFTextStripper tStripper = new PDFTextStripper();
            if (!document.isEncrypted()) {
                stripper.setSortByPosition(true);
                pdfFileInText = tStripper.getText(document);
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    log.info(line);
                    document.close();
                }
            }
        } catch (IOException e) {
            log.error(e.getStackTrace());
        }
        return pdfFileInText;
    }

    /**
     * This Method is to pick the current date form date picker component
     *
     * @throws InterruptedException
     */
    public void selectDatePicker() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        String todayStr = Integer.toString(todayInt);
        log.info("Print the current date " + todayStr);
        for (WebElement dateIcon : datePickerIcon) {
            log.info("date Icon is " + datePickerIcon.size());
            click(dateIcon, "dateIcon", 10);
            for (WebElement cell : monthList) {
                if (cell.getText().equalsIgnoreCase(todayStr)) {
                    log.info("print cell text " + cell.getText());
                    nativeClick(cell, "cell", 10);
                    break;
                }
            }
        }
    }

    /**
     * This Method is to pick the future date form date picker component
     *
     * @throws InterruptedException
     */
    public void selectFutureDate() throws InterruptedException {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        String todayStr = Integer.toString(todayInt);
        log.info("Print the current date " + todayStr);
        click(datePickerIcon.get(0), "dateIcon", 10);
        waitForPageToLoad();
        wait(2000);
        click(futureDate, "futureDate", 20);
        waitForPageToLoad();
        click(futureDate, "futureDate", 20);
        for (WebElement cell : monthList) {
            if (cell.getText().equalsIgnoreCase(todayStr)) {
                log.info("print cell text " + cell.getText());
                nativeClick(cell, "cell", 10);
                break;

            }
        }
    }

    /**
     * This is template Method to capture all dropdown values and validate them
     *
     * @throws InterruptedException
     */

    public void captureDropdownValues() throws Exception {
        String[] exp = {"Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        WebElement dropdown = driver.findElement(By.id("date_mon"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();

        for (WebElement we : options) {
            boolean match = false;
            for (int i = 0; i < exp.length; i++) {
                if (we.getText().equals(exp[i])) {
                    System.out.println("Matched");
                    match = true;
                }
            }
            Assert.assertTrue(match);
        }
    }

}

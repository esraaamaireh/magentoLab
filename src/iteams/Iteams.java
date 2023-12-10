package iteams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import auth.parameters;

public class Iteams extends parameters {
    @BeforeTest()
    public void PreTest() throws InterruptedException {
        driver.get(iteams);
        driver.manage().window().maximize();
    }

    @Test(priority = 1, testName = "choose Random Iteams")
    public void IteamsChoosen() throws InterruptedException {
        List<WebElement> items = driver.findElements(By.cssSelector(".item.product.product-item"));

        int randItems = random.nextInt(items.size());

        items.get(randItems).click();
        Thread.sleep(2000);
        WebElement productSpan = driver.findElement(By.cssSelector(".page-title-wrapper.product"));
        softAssert.assertTrue(productSpan.isDisplayed(), "Product span is not displayed");
        softAssert.assertAll();

        Thread.sleep(1000);
    }

    @Test(priority = 2, testName = "choose Random Size")
    public void SizeAdding() throws InterruptedException {
        List<WebElement> sizes = driver.findElements(By.cssSelector(".swatch-option.text"));

        int randSize = random.nextInt(sizes.size());

        sizes.get(randSize).click();
        Thread.sleep(3000);

        String actualSize = driver.findElement(By.cssSelector(".swatch-option.text.selected")).getText();
        String expectedSize = driver.findElement(By.xpath("//*[@class='swatch-attribute-selected-option']"))
                .getText(); // Fix the Xpath

        softAssert.assertEquals(actualSize, expectedSize, "Size mismatch message");
        softAssert.assertAll();
    }

    @Test(priority = 3, testName = "choose Random Colors")
    public void Color() throws InterruptedException {
        List<WebElement> colors = driver.findElements(By.cssSelector(".swatch-option.color"));

        int randColor = random.nextInt(colors.size());

        colors.get(randColor).click();
        String actualColor = driver.findElement(By.cssSelector(".swatch-option.color.selected")).getText();

       
        String ExpectedColor = driver.findElement(By.xpath("//*[@aria-checked='true']")).getText();
    

        softAssert.assertEquals(actualColor, ExpectedColor, "Color mismatch message");
        softAssert.assertAll();
    }

    @Test(priority = 4, testName = "choose Random Iteams number and check if it added to my cart")
    public void Quantity() throws InterruptedException {
        int randQuantity = random.nextInt(10000);

        WebElement QNumber = driver.findElement(By.id("qty"));
        QNumber.clear();
        QNumber.sendKeys(String.valueOf(randQuantity));

        WebElement button = driver.findElement(By.id("product-addtocart-button"));
        button.click();
        Thread.sleep(10000);

       
        String successMessage = driver.findElement(By.cssSelector(".message-success.success.message")).getText();
        softAssert.assertTrue(successMessage.contains("you added"), "Success message doesn't contain expected text");


    }

    @AfterTest()
    public void PostTest() {
driver.close();    }
}

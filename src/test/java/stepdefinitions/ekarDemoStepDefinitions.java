package stepdefinitions;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import pages.DemoPages;
import utilities.Driver;

import java.time.Duration;

public class ekarDemoStepDefinitions {
    DemoPages demoPages = new DemoPages();

    @Given("Launch Ekar Demo Apps")
    public void lunch_ekar_demo_apps() throws InterruptedException {
        Driver.getAppiumDriver();
        Thread.sleep(3000);
    }

    @Then("I check Pin location is visible")
    public void ı_check_pin_location_is_visible() {
        Assert.assertTrue(demoPages.pinDrop.isDisplayed());
        System.out.println("Your Current Location is; "+demoPages.pinDrop.getAttribute("content-desc"));
    }

    @Then("I check My location is correct")
    public void ı_check_my_location_is_correct() {
        Assert.assertTrue(demoPages.pinDrop.getAttribute("content-desc").contains("Turkey"));
    }

    @When("I click on Pin Drop")
    public void ı_click_on_pin_drop() throws InterruptedException {
        demoPages.pinDrop.click();
        Thread.sleep(3000);
    }

    @And("I enter a text in Comment box")
    public void ıEnterATextInCommentBox() {
        demoPages.commentBox.sendKeys("This is text Message");
    }

    @And("I click on Next button")
    public void ıClickOnNextButton() {
        demoPages.nextBtn.click();
    }

    @Then("I verify {string} message is disabled")
    public void ıVerifyMessageIsDisabled(String errorMessage) {
        Assert.assertEquals(errorMessage,demoPages.warnMessage.getText());
        Thread.sleep(2000);
    }

    @And("I click Frontside")
    public void ıClickFrontside() {
        demoPages.frontImg.click();
    }

    @And("I click Backside")
    public void ıClickBackside() {
        demoPages.backImg.click();
    }

    @And("I click Leftside")
    public void ıClickLeftside() {
        demoPages.leftImg.click();
    }

    @And("I click Rightside")
    public void ıClickRightside() {
        demoPages.rightImg.click();
    }

    @And("I click on select a Image from galery")
    public void ıClickOnSelectAImageFromGalery() {
        demoPages.selectImageFromGallery.click();
    }

    @And("I select a Image from gallery")
    public void ıSelectAImageFromGallery() {
        demoPages.ImageFromGallery.click();
    }

    @And("I scroll to the Comment box")
    public void ıScrollToTheCommentBox() {
        AndroidTouchAction actions = new AndroidTouchAction(Driver.getAppiumDriver());

        actions.tap(ElementOption.element(demoPages.commentTab)).perform();

        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize(); // Cihazın ekran boyutlarını verir
        System.out.println("Dimensions : "+dimension);
        int startY = (int) (dimension.height*0.9); //1920*0.9
        int startX = (int) (dimension.width*0.5); //1080*0.5

        int endY = (int) (dimension.height*0.1); //1980*0.1
        int endX = (int) (dimension.width*0.5); //1080*0.5

        actions.press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX,endY))
                .release()
                .perform();
        
        //  ((AndroidDriver<?>) Driver.getAppiumDriver()).
        //        findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"))");  //UI Selector ScrollInto View Method
        
    }

    @And("I click on Pictures tab")
    public void ıClickOnPicturesTab() {
        demoPages.pictures.click();
    }
}

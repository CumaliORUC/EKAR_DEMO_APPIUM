package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class DemoPages {
    public DemoPages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Turkey')]")
    public MobileElement pinDrop;

    @AndroidFindBy(id = "in.testdemo.map:id/next_btn")
    public MobileElement nextBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Comment')]")
    public MobileElement commentTab;

    @AndroidFindBy(id = "in.testdemo.map:id/cmd_txt")
    public MobileElement commentBox;

    @AndroidFindBy(id = "in.testdemo.map:id/front_img")
    public MobileElement frontImg;

    @AndroidFindBy(id = "in.testdemo.map:id/back_img")
    public MobileElement backImg;

    @AndroidFindBy(id = "in.testdemo.map:id/left_img")
    public MobileElement leftImg;

    @AndroidFindBy(id = "in.testdemo.map:id/right_img")
    public MobileElement rightImg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select image from gallery']")
    public MobileElement selectImageFromGallery;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'PICTURES')]")
    public MobileElement pictures;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ALBUMS')]")
    public MobileElement albums;

    @AndroidFindBy(xpath = "//com.sec.samsung.gallery.glview.composeView.ThumbObject")
    public MobileElement ImageFromGallery;
}
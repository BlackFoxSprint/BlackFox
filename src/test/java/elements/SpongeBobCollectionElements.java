package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SpongeBobCollectionElements extends AbstractBasePage {

    public SpongeBobCollectionElements(WebDriver driver) {
        super(driver);
    }

    public static final String PUMA_SPONGEBOB_BTN = "//a[contains(text() ,'SPONGEBOB')]";
    public static final String PRODUCTS_NAME_LIST = "//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2']";
    public static final String FILTER_BTN = "//span[text()='Filters']";
    public static final String GENDER_BTN = "//span[contains(text(), 'Gender')]";
    public static final String GIRLS_CATEGORY = "//input[@id='Girls']";
//    public static final String MEN_CATEGORY = "//input[@id='Men']";
    public static final String MEN_CATEGORY = "//input[@id='Men']//../div";
//    public static final String UNISEX_CATEGORY = "//input[@id='Unisex']";
    public static final String UNISEX_CATEGORY = "//input[@id='Unisex']//../div";
    public static final String PORSCHE_JACKET_PRODUCT = "//h3[contains(text(), 'Porsche Legacy MT7')]";
    public static final String SIZE_M_btn = "//span[text()='M']";
    public static final String ADD_TO_CART_BTN = "//div[contains(text(),'Add to Cart')]";
    public static final String OPEN_CART_BTN = "//a[contains(text(), 'View cart')]";
    public static final String CHECKOUT_BTN = "//a[contains(text(), 'Checkout')]";
    public static final String FIRST_NAME_FIELD = "//input[@placeholder='First name']";
    public static final String LAST_NAME_FIELD = "//input[@placeholder='Last name']";
    public static final String CONTINUE_PAYMENT_BTN = "//div[contains(text(), 'Continue to payment')]";
    public static final String WARNING_EMPTY_FIELDS = "//p[text()= 'Please fill out this field.']";
    public static final String ADDRESS_FIELD = "//input[@id='shipping-address-address1']";
    public static final String CITY_FIELD = "//input[@id='shipping-address-city']";
    public static final String POSTAL_CODE_FIELD = "//input[@id='shipping-address-postal-code']";
    public static final String EMAIL_FIELD = "//input[@id='email']";
    public static final String COMPANY_FIELD = "//input[@id='address2']";
    public static final String PHONE_NUMBER_FIELD = "//input[@id='phone-number']";
}

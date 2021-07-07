package com.ilCarro.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage{

   private By signUpTabLocator = By.cssSelector("[href='/signup']");
   private By nameLocator = By.cssSelector("#first_name");
   private By lastNameLocator = By.cssSelector("#second_name");
   private By emailLocator = By.cssSelector("#email");
   private By passwordLocator = By.cssSelector("#password");
   private By checkPolicyLocator = By.cssSelector("#check_policy");
   private By submitButtonLocator = By.cssSelector("[type='submit']");
   private By loginFormLocator = By.xpath("//div[@class='signup__registration_title ']/h2[contains(.,'Log in')]");



   public RegistrationPage(){
        Configuration.startMaximized = true;
        open("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    public void clickOnSignUpTab(){
        $(signUpTabLocator).click();
    }
    public void checkPolicy(){
        $(checkPolicyLocator).click();
    }
    public void clickOnSubmitButton(){
        $(submitButtonLocator).click();
    }

    public void fillRegistrationForm(String name, String lastName, String email, String password){
        $(nameLocator).val(name);
        $(lastNameLocator).val(lastName);
        $(emailLocator).val(email);
        $(passwordLocator).val(password);

    }

    public void validRegistration(){
        $(loginFormLocator).shouldBe(Condition.visible, Duration.ofMillis(3000));
    }








}

package com.ilCarro.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private By loginTabLocator = By.xpath("//ul[@class='header__nav desktop']/li/a[@href='/login']");
    private By emailLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.cssSelector("[type='submit']");
    private By logoutTabLocator = By.xpath("//a[contains(.,'logOut')]");

    public LoginPage(){
        Configuration.startMaximized = true;
        open("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    public void loginData(String email, String password){
        $(loginTabLocator).click();
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(submitBtnLocator).click();

    }

    public void validLogin(){
        $(logoutTabLocator).shouldBe(Condition.visible).waitUntil(Condition.visible,4000);
    }
}

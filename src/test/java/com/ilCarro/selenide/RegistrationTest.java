package com.ilCarro.selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

    RegistrationPage registration;


    @BeforeMethod
    public void setUp(){
        registration = new RegistrationPage();

    }

    @Test
    public void loginPositiveTest(){
        registration.clickOnSignUpTab();
        registration.fillRegistrationForm("Dark","Krum","darkkrum@gmail.com","Dr12345678");
        registration.checkPolicy();
        registration.clickOnSubmitButton();
        registration.validRegistration();
    }

}

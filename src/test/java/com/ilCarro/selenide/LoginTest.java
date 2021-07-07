package com.ilCarro.selenide;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    LoginPage login;

    @BeforeMethod
    public void setUp(){
        login = new LoginPage();
    }

    @Test
    public void loginPositiveTest(){
        login.loginData("saralid11@gmail.com","sl12345660");
    }
}

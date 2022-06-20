package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;





import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegistrationTest {


    @Test
    void shouldRegisterByAccount() {
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("(//input[contains(@class,'input__control')])[1]").setValue("Иванов Иван");
        $("[name='phone']").setValue("+792000000000");
        $("[data-test-id=agreement]>.checkbox__box").click();
        $$("button").find(exactText("Продолжить")).click();


    }
}


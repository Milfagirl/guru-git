package com.milfagirl;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormSubmit {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
    @Test
    void newTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Svetlana");
        $("#lastName").setValue("Ryabova");
        $("#userEmail").setValue("1@inbox.ru");
        $("#userNumber").setValue("9378388888");
        $(".custom-control-label").click();
        $("#submit").scrollIntoView(true);
        $("#submit").click();

    }

}

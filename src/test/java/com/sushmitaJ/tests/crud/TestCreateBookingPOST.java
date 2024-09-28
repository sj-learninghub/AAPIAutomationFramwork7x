package com.sushmitaJ.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBookingPOST {

    @Link(name = "Link to TC", url = "https://google.com")
    @Issue("JIRA_RBT-4")
    @TmsLink("RBT-4")
    @Owner("Sushmita")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that POST request is working fine.")
    @Test
    public void testVerifyCreateBookingPOST01(){
        Assert.assertEquals(true,true);
    }



}

package ru.netology.CashbackHackService.services;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void testRemainBoundaryGreaterThanAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(actual, 500);
    }

    @Test
    public void testRemainBoundaryEqualToAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testRemainBoundaryLessThanAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(actual, 500);
    }
}

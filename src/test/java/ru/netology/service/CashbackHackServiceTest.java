package ru.netology.service;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void testAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount4500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 4500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }
}
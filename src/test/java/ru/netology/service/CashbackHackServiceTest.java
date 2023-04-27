package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCashBackSum999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1200() {
        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1800() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}
package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    public CashbackHackService Service = new CashbackHackService();

    @Test
    public void shouldCashBackSum999() {
        int actual = Service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1() {
        int actual = Service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1000() {
        int actual = Service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1200() {
        int actual = Service.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackSum1800() {
        int actual = Service.remain(1800);
        int expected = 200;
        assertEquals(actual, expected);
    }

}
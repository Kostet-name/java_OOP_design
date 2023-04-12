package ru.netology.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testNumberOfStation() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(20, radio.getNumberOfStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(19, radio.getMaxStation());
    }

    @Test
    public void shouldSetStationIfMax25Station() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(17);

        Assertions.assertEquals(17, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationIfMax25Station() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(24);

        Assertions.assertEquals(24, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNotMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMaxStationIfMax25Station() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(25);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAnyStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNextMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNextMaxStationIfMax20Station() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseNextMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDowngradePrevMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDowngradePrevMinStationIfMax20Station() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);

        radio.prevStation();

        Assertions.assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldDowngradePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDowngradePrevMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAnyVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());

        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDowngradeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.downgradeVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDowngradeMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.downgradeVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDowngradeMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.downgradeVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(1);

        Assertions.assertEquals(1, radio.getMinVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);

        Assertions.assertEquals(100, radio.getMaxVolume());
    }
}

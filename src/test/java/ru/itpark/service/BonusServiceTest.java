package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    @DisplayName("Should calculate Standard card")
    void calculateBonusStandard() {
        var service = new BonusService();
        var result = service.calculateBonus(3_000, 12_000);

        String standard = "Standard card";
        assertEquals(standard, result);
    }

    @Test
    @DisplayName("Should calculate Silver card")
    void calculateBonusSilver() {
        var service = new BonusService();
        var result = service.calculateBonus(5_000, 12_000);

        String silver = "Silver card";
        assertEquals(silver, result);
    }

    @Test
    @DisplayName("Should calculate Gold card")
    void calculateBonusGold() {
        var service = new BonusService();
        var result = service.calculateBonus(140_000, 12_000);

        String gold = "Gold card";
        assertEquals(gold, result);
    }

    @Test
    @DisplayName("Should calculate Gold card")
    void calculateBonusCard() {
        var service = new BonusService();
        var result = service.calculateBonus(0, 0);

        String noCard = "No card";
        assertEquals(noCard, result);
    }
}
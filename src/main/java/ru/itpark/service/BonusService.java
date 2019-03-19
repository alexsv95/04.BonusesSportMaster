package ru.itpark.service;

public class BonusService {
    public String calculateBonus(int totalPurchase, int currentPurchase) {

        String noCard = "No card";
        String Standard = "Standard card";
        String Silver = "Silver card";
        String Gold = "Gold card";

        if (totalPurchase + currentPurchase >= 10 && totalPurchase + currentPurchase < 15_001) {
            return Standard;
        } else if (totalPurchase + currentPurchase >= 15_001 && totalPurchase + currentPurchase < 150_000) {
            return Silver;
        } else if (totalPurchase + currentPurchase >= 150_000) {
            return Gold;
        }
        return noCard;
    }
}


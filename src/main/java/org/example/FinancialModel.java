package org.example;
import java.util.HashMap;

public class FinancialModel {
    private HashMap<String, Double> stockPrices;

    public FinancialModel() {
        this.stockPrices = new HashMap<>();
    }

    public double getStockPrice(String market) {
        return this.stockPrices.getOrDefault(market, 0.0);
    }

    public void setStockPrice(String market, double price) {
        this.stockPrices.put(market, price);
    }

    public double calculateMarketValue(int sharesOutstanding) {
        return this.stockPrices.values().stream().mapToDouble(price -> price * sharesOutstanding).sum();
    }

    public double calculatePriceToBookRatio(double bookValue, int sharesOutstanding) {
        double marketValue = calculateMarketValue(sharesOutstanding);
        return marketValue / bookValue;
    }
}


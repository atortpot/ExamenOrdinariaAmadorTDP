package org.example;
public class FinancialView {
    public void displayStockPrice(String market, double price) {
        System.out.println("Market: " + market + " | Current stock price: " + price);
    }

    public void displayMarketValue(double marketValue) {
        System.out.println("Total market value: " + marketValue);
    }

    public void displayPriceToBookRatio(double ratio) {
        System.out.println("Price-to-Book Ratio: " + ratio);
    }
}


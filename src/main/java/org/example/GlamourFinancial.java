package org.example;
public interface GlamourFinancial {
    double getStockPrice(String market);
    void updateStockPrice(String market, double price);
    double calculateMarketValue(int sharesOutstanding);
    double calculatePriceToBookRatio(double bookValue);
}


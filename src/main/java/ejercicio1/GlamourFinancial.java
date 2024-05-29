package ejercicio1;
public interface GlamourFinancial {
    double getStockPrice(String market);
    void setStockPrice(String market, double price);
    double calculateMarketValue(int sharesOutstanding);
    double calculatePriceToBookRatio(double bookValue, int sharesOutstanding);
}



package ejercicio1 ;
import java.util.HashMap;
import java.util.Map;

public class FinancialModel implements GlamourFinancial {
    private Map<String, Double> stockPrices;

    public FinancialModel() {
        this.stockPrices = new HashMap<>();
    }

    @Override
    public double getStockPrice(String market) {
        return this.stockPrices.getOrDefault(market, 0.0);
    }

    @Override
    public void setStockPrice(String market, double price) {
        this.stockPrices.put(market, price);
    }

    @Override
    public double calculateMarketValue(int sharesOutstanding) {
        return this.stockPrices.values().stream().mapToDouble(price -> price * sharesOutstanding).sum();
    }

    @Override
    public double calculatePriceToBookRatio(double bookValue, int sharesOutstanding) {
        double marketValue = calculateMarketValue(sharesOutstanding);
        if (bookValue == 0) throw new IllegalArgumentException("Book value cannot be zero.");
        return marketValue / bookValue;
    }
}


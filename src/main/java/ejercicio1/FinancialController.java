package ejercicio1 ;
public class FinancialController {
    private FinancialModel model;
    private FinancialView view;

    public FinancialController(FinancialModel model, FinancialView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStockPrice(String market, double price) {
        model.setStockPrice(market, price);
        view.displayStockPrice(market, price);
    }

    public void showMarketValue(int sharesOutstanding) {
        double marketValue = model.calculateMarketValue(sharesOutstanding);
        view.displayMarketValue(marketValue);
    }

    public void showPriceToBookRatio(double bookValue, int sharesOutstanding) {
        double ratio = model.calculatePriceToBookRatio(bookValue, sharesOutstanding);
        view.displayPriceToBookRatio(ratio);
    }
}


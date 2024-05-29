package ejercicio1;
public class FinancialApp {
    public static void main(String[] args) {
        FinancialModel model = new FinancialModel();
        FinancialView view = new FinancialView();
        FinancialController controller = new FinancialController(model, view);

        controller.updateStockPrice("NASDAQ", 150.50);
        controller.updateStockPrice("NYSE", 145.75);
        controller.showMarketValue(1000000);
        controller.showPriceToBookRatio(5000000.00, 1000000);
    }
}




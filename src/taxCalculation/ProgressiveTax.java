package taxCalculation;

public class ProgressiveTax implements Taxable {
    float base13 = 5000000;
    @Override
    public float calculate(float base) {
        float ProgressiveTax;
        if (base > base13) {
            float base15 = base - base13;
            ProgressiveTax = (float) (base13*0.13 + base15*0.15);
            System.out.println("Прогрессивный налог: " + ProgressiveTax);
        } else {
            ProgressiveTax = (float) (base*0.13);
            System.out.println("Налог НДФЛ: " + ProgressiveTax);
        }
        return ProgressiveTax;
    }
}

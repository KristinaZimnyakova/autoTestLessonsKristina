package taxCalculation;

public class PIT extends Tax implements Taxable {
    float base13 = 5000000;
    @Override
    public float calculate(float base) {
        float PIT;
        if (base > base13) {
            float base15 = base - base13;
            PIT = (float) (base13*0.13 + base15*0.15);
            System.out.println("Прогрессивный налог: " + PIT);
        } else {
            PIT = (float) (base*0.13);
            System.out.println("Налог НДФЛ: " + PIT);
        }
        return PIT;
    }
}

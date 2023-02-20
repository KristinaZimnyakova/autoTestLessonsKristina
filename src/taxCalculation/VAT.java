package taxCalculation;

public class VAT extends Tax implements Taxable{
    @Override
    public float calculate(float base) {
        float VAT = (float) (base*0.2);
        System.out.println("Налог НДС: " + VAT);
        return VAT;
    }
}

package taxCalculation;

public class ValueAddedTax implements Taxable{
    @Override
    public float calculate(float base) {
        float ValueAddedTax = (float) (base*0.2);
        System.out.println("Налог НДС: " + ValueAddedTax);
        return ValueAddedTax;
    }
}

package taxCalculation;

import java.util.ArrayList;

public class RunTax {
    public static void main(String[] args){
        float base = 6000000;
        ValueAddedTax valueAddedTax = new ValueAddedTax();
        ProgressiveTax progressiveTax = new ProgressiveTax();
        ArrayList<Float> tax = new ArrayList<>();
        tax.add(valueAddedTax.calculate(base));
        tax.add(progressiveTax.calculate(base));
        for (float i: tax) {
        }
    }

}

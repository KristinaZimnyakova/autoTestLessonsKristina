package taxCalculation;

import java.util.ArrayList;
import java.util.List;

public class RunTax {
    public static void main(String[] args){
        float base = 6000000;
        ValueAddedTax valueAddedTax = new ValueAddedTax();
        ProgressiveTax progressiveTax = new ProgressiveTax();
        List<Taxable> taxableList = new ArrayList<>();
        taxableList.add(valueAddedTax);
        taxableList.add(progressiveTax);
        for (Taxable i: taxableList) {
            i.calculate(base);
        }
    }

}

package taxCalculation;

import java.util.ArrayList;

public abstract class Tax {

       float calculate (float base) {
        VAT vat = new VAT();
        PIT pit = new PIT();
        ArrayList<Float> tax = new ArrayList<>();
        tax.add(vat.calculate(base));
        tax.add(pit.calculate(base));
        for (float i: tax) {
        }
        return base;
    }
    


}

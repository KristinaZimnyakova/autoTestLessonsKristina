package taxCalculation;

import java.util.ArrayList;

public class RunTax {
    public static void main(String[] args){
        VAT vat = new VAT();
        PIT pit = new PIT();
        ArrayList<Float> tax = new ArrayList<>();
        tax.add(vat.calculate(6000000));
        tax.add(pit.calculate(6000000));
        for (float i: tax) {
        }
    }

}

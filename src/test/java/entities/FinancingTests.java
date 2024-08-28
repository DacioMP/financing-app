package entities;

import factory.FinancingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FinancingTests {

    @Test
    public void constructorShouldCreateObjWhenValidData() {
        Financing fin = FinancingFactory.createValidFinancing();

        Assertions.assertInstanceOf(Financing.class, fin);
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            Financing fin = FinancingFactory.createInvalidFinancing();
        });
    }

    @Test
    public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
        Financing fin = FinancingFactory.createValidFinancing();
        double updatedTotalAmount = 90000.0;

        fin.setTotalAmount(updatedTotalAmount);

        Assertions.assertEquals(updatedTotalAmount, fin.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fin = FinancingFactory.createValidFinancing();
            double updatedTotalAmount = 120000.0;

            fin.setTotalAmount(updatedTotalAmount);
        });
    }

    @Test
    public void setIncomeShouldUpdateIncomeWhenValidData() {
        Financing fin = FinancingFactory.createValidFinancing();
        double updatedIncome = 4000.0;

        fin.setIncome(updatedIncome);

        Assertions.assertEquals(updatedIncome, fin.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fin = FinancingFactory.createValidFinancing();
            double updatedIncome = 1500.0;

            fin.setIncome(updatedIncome);
        });
    }

    @Test
    public void setMonthsShouldUpdateMonthsWhenValidData() {
        Financing fin = FinancingFactory.createValidFinancing();
        int updatedMonths = 96;

        fin.setMonths(updatedMonths);

        Assertions.assertEquals(updatedMonths, fin.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fin = FinancingFactory.createValidFinancing();
            int updatedMonths = 40;

            fin.setMonths(updatedMonths);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly() {
        Financing fin = FinancingFactory.createValidFinancing();
        double expectedValue = 20000.0;

        double result = fin.entry();

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly() {
        Financing fin = FinancingFactory.createValidFinancing();
        double expectedValue = 1000.0;

        double result = fin.quota();

        Assertions.assertEquals(expectedValue, result);
    }
}

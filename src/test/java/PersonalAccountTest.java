import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonalAccountTest {

    @Test
    public void setIncome() {
        PersonalAccount account = new PersonalAccount(1200.00, 0);

        double expected = 1200.00;
        double actual = account.setIncome(account.getIncome());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncomeFractionNumbers() {
        PersonalAccount account = new PersonalAccount(150.83, 0.0);

        double expected = 150.83;
        double actual = account.setIncome(account.getIncome());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncomeIncorrect() {
        PersonalAccount account = new PersonalAccount(-100.0, 0.0);

        double expected = 0;
        double actual = account.setIncome(account.getIncome());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCost() {
        PersonalAccount account = new PersonalAccount(0.0, 5600.0);

        double expected = 5600.0;
        double actual = account.setCost(account.getCost());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCostFractionNumbers() {
        PersonalAccount account = new PersonalAccount(0.0, 126.16);

        double expected = 126.16;
        double actual = account.setCost(account.getCost());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCostIncorrect() {
        PersonalAccount account = new PersonalAccount(0.0, -260.0);

        double expected = 0;
        double actual = account.setCost(account.getCost());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncome() {
        PersonalAccount account = new PersonalAccount(1000.0, 0.0);

        double expected = 60;
        double actual = account.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeFractionNumbers() {
        PersonalAccount account = new PersonalAccount(1000.21, 0.0);

        double expected = 60.0126;
        double actual = account.taxIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncomeWithCost() {
        PersonalAccount account = new PersonalAccount(1000.0, 200.0);

        double expected = 60;
        double actual = account.taxIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncomeZero() {
        PersonalAccount account = new PersonalAccount(0.0, 0.0);

        double expected = 0;
        double actual = account.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeIncorrect() {
        PersonalAccount account = new PersonalAccount(-100.0, 0.0);

        double expected = 0;
        double actual = account.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduce() {
        PersonalAccount account = new PersonalAccount(1000.0, 200.0);

        double expected = 120;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceFractionNumbers() {
        PersonalAccount account = new PersonalAccount(1000.21, 200.0);

        double expected = 120.0315;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceNegativeBase() {
        PersonalAccount account = new PersonalAccount(800.0, 850.0);

        double expected = 0;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceZero() {
        PersonalAccount account = new PersonalAccount(0.0, 0.0);

        double expected = 0;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceIncorrect() {
        PersonalAccount account = new PersonalAccount(100.0, -10.0);

        double expected = 15;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceIncorrect2() {
        PersonalAccount account = new PersonalAccount(-100.0, -10.0);

        double expected = 0;
        double actual = account.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

}

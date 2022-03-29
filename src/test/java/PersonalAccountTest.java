import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonalAccountTest {

    @Test
    public void plusIncome() {
        PersonalAccount personalAccount = new PersonalAccount(1200.0, 0.0);

        double expected = 1200.0;
        double actual = personalAccount.plusIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusIncomeFractionNumbers() {
        PersonalAccount personalAccount = new PersonalAccount(150.83, 0.0);

        double expected = 150.83;
        double actual = personalAccount.plusIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusIncomeIncorrect() {
        PersonalAccount personalAccount = new PersonalAccount(-100.0, 0.0);

        double expected = 0;
        double actual = personalAccount.plusIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusCost() {
        PersonalAccount personalAccount = new PersonalAccount(0.0, 5600.0);

        double expected = 5600.0;
        double actual = personalAccount.plusCost();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusCostFractionNumbers() {
        PersonalAccount personalAccount = new PersonalAccount(0.0, 126.16);

        double expected = 126.16;
        double actual = personalAccount.plusCost();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusCostIncorrect() {
        PersonalAccount personalAccount = new PersonalAccount(0.0, -260.0);

        double expected = 0;
        double actual = personalAccount.plusCost();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncome() {
        PersonalAccount personalAccount = new PersonalAccount(1000.0, 0.0);

        double expected = 60;
        double actual = personalAccount.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeFractionNumbers() {
        PersonalAccount personalAccount = new PersonalAccount(1000.21, 0.0);

        double expected = 60.0126;
        double actual = personalAccount.taxIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncomeWithCost() {
        PersonalAccount personalAccount = new PersonalAccount(1000.0, 200.0);

        double expected = 60;
        double actual = personalAccount.taxIncome();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void taxIncomeZero() {
        PersonalAccount personalAccount = new PersonalAccount(0.0, 0.0);

        double expected = 0;
        double actual = personalAccount.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeIncorrect() {
        PersonalAccount personalAccount = new PersonalAccount(-100.0, 0.0);

        double expected = 0;
        double actual = personalAccount.taxIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduce() {
        PersonalAccount personalAccount = new PersonalAccount(1000.0, 200.0);

        double expected = 120;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceFractionNumbers() {
        PersonalAccount personalAccount = new PersonalAccount(1000.21, 200.0);

        double expected = 120.0315;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceNegativeBase() {
        PersonalAccount personalAccount = new PersonalAccount(800.0, 850.0);

        double expected = 0;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceZero() {
        PersonalAccount personalAccount = new PersonalAccount(0.0, 0.0);

        double expected = 0;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceIncorrect() {
        PersonalAccount personalAccount = new PersonalAccount(100.0, -10.0);

        double expected = 15;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxIncomeReduceIncorrect2() {
        PersonalAccount personalAccount = new PersonalAccount(-100.0, -10.0);

        double expected = 0;
        double actual = personalAccount.taxIncomeReduce();

        Assertions.assertEquals(expected, actual);

    }
}

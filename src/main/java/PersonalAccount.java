public class PersonalAccount {
    private double income;
    private double cost;

    public PersonalAccount(double income, double cost) {
        this.income = income;
        this.cost = cost;
    }

    public double plusIncome() {
        double income = 0.00;
        if (this.income >= 0) {
            income += this.income;
        } else {
            System.out.println("Введенное значение: " + this.income + " некорректно!");
        }
        return income;
    }

    public double plusCost() {
        double cost = 0;
        if (this.cost >= 0) {
            cost += this.cost;
        } else {
            System.out.println("Введенное значение: " + this.cost + " некорректно!");
        }
        return cost;
    }

    public double taxIncome() {
        double rate = 0.06;

        double tax = plusIncome() * rate;

        return tax;
    }

    public double taxIncomeReduce() {
        double rate = 0.15;

        double tax = (plusIncome() - plusCost()) * rate;
        if (tax < 0) {
            tax = 0;
        }
        return tax;
    }
}

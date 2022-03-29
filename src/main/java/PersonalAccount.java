public class PersonalAccount {
    private double income;
    private double cost;

    public PersonalAccount(double income, double cost) {
        this.income = income;
        this.cost = cost;
    }

    public double getIncome() {
        return income;
    }

    public double getCost() {
        return cost;
    }

    public double plusIncome() {
        double income = 0.00;
        if (getIncome() >= 0) {
            income += getIncome();
        } else {
            System.out.println("Введенное значение: " + getIncome() + " некорректно!");
        }
        return income;
    }

    public double plusCost() {
        double cost = 0;
        if (getCost() >= 0) {
            cost += getCost();
        } else {
            System.out.println("Введенное значение: " + getCost() + " некорректно!");
        }
        return cost;
    }

    public double taxIncome() {
        double tax;
        double rate = 0.06;
        if (getIncome() < 0) {
            tax = 0;
        } else {
            tax = getIncome() * rate;
        }
        return tax;
    }

    public double taxIncomeReduce() {
        double tax;
        double rate = 0.15;
        if (getIncome() < 0) {
            tax = 0;
        } else {
            if (getIncome() - getCost() < 0) {
                tax = 0;
            } else {
                if (getCost() < 0) {
                    tax = getIncome() * rate;
                } else {
                    tax = (getIncome() - getCost()) * rate;
                }
            }
        }
        return tax;
    }
}

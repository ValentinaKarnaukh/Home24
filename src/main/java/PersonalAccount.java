public class PersonalAccount implements Account {
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

    @Override
    public double setIncome(double newIncome) {
        if (newIncome < 0) {
            newIncome = 0;
        } else {
            income += newIncome;
        }

        return newIncome;
    }

    @Override
    public double setCost(double newCost) {
        if (newCost < 0) {
            newCost = 0;
        } else {
            cost += newCost;
        }

        return newCost;
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

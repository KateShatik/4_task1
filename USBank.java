import java.util.Currency;

/**
 * Created by Катя on 25.11.2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }
}

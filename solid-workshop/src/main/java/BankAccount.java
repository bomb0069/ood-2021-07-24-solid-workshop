public class BankAccount {

    private String type;

    public void transferMoney(BankAccount target, double amount) {
        // Logic

        // 1. Local
        if ("LOCAL".equals(target.getType())){
                // TODO
        }

        // 2. Inter
        if ("INTER".equals(target.getType())) {
            // TODO
        }
    }

    public String getType() {
        return type;
    }
}
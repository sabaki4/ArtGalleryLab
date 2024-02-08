public class Customer {

    private String name;
    private int wallet;

    public Customer(String inputName, int inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}

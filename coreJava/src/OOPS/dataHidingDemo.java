package OOPS;


class ATM{
    private String username;

    private String pass;

    private String bal;

    public String getUsername() {//getter
        return username;
    }

    public void setUsername(String username) {//setter
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public String getBal() {
        return bal;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }
}


public class dataHidingDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.getBal());
    }
}

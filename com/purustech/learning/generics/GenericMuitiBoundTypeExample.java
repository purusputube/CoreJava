package com.purustech.learning.generics;

public class GenericMuitiBoundTypeExample <T extends GeneralAccount & Account>
 {
    T account;

    public T getAccount() {
        return account;
    }

    public void setAccount(T account) {
        this.account = account;
    }

    public static void main(String[] args) {
        GenericMuitiBoundTypeExample<JanDhanAccount> tenRupee = new GenericMuitiBoundTypeExample();
        // if we pass above SavingsAccount then it will give compiler error, since its not extending and implementing

    }
}

interface Account{
    // method 1 ();
    // method 2();
    // default method --> method2

}

class GeneralAccount implements Account {
    // method1 () {...}
    // method2
}

class SavingsAccount implements Account {
// method1
    // method2
}

class JanDhanAccount extends GeneralAccount {
// method1

    /* method2 {
            sout ("Method not implemented ")
    } */

}

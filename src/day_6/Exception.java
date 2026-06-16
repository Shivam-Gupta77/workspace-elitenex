package day_6;

public class Exception {
}

class AccountNotExistExcepiton extends RuntimeException{
    public AccountNotExistExcepiton(String message){
        super(message);
    }
}

class AmountCannotBeNegative extends RuntimeException{
    public AmountCannotBeNegative(String message){
        super(message);
    }
}

class AmountIsGreaterThanCurrentBalance extends  RuntimeException{
    public AmountIsGreaterThanCurrentBalance(String message){
        super(message);
    }
}

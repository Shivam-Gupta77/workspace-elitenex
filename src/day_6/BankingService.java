package day_6;

import java.util.ArrayList;
import java.util.Random;

public class BankingService implements IBankingService{
    static ArrayList<Account> accounts = new ArrayList<>();
    static Random random = new Random();

    @Override
    public void createAccount(String holderName, AccountType accountType, double initialBalance) {
        String bankName = "State Bank Of India";
        int id = 10 + random.nextInt(90);

        int accountNum = 1000 + random.nextInt(9000);
        String accountNumber;

        Account newAccount = null;

        if(accountType.equals(AccountType.SAVING) && initialBalance >= 1000){
            accountNumber = "SB" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else if (accountType.equals(AccountType.CURRENT) && initialBalance >=0){
            accountNumber = "CR" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else if(accountType.equals(AccountType.SALARY) && initialBalance > 0){
            accountNumber = "SL" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else{
            throw new AmountCannotBeNegative("Insufficient Balance to create new Account");
        }

        accounts.add(newAccount);
    }

    @Override
    public void working() {
        System.out.println("working");
    }

    @Override
    public void showDetails(String accountNumber) {
        Account account = accountExistOrNot(accountNumber);
        if(account != null){
            System.out.println("\n=== Your Account details ===");
            System.out.println("Bank Name: " + account.getBankName());
            System.out.println("Account Holder Name: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Your Balance: " + account.getBalance());

        }else{
            throw new AccountNotExistExcepiton("There is not account with this account number: " + accountNumber);
        }
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        Account account = accountExistOrNot(accountNumber);

        if(account != null){
            if(amount > 0){
                account.deposit(amount);
                System.out.println("Deposit successfully");
            }else{
                throw new AmountCannotBeNegative("Amount cannot be negative or zero");
            }
        }else{
            throw new AccountNotExistExcepiton("There is not account with this account number: " + accountNumber);
        }
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        Account account = accountExistOrNot(accountNumber);

        if(account != null){
            if(amount < 0){
                throw new AmountCannotBeNegative("Amount cannot be negative or zero");
            }
            if(amount > account.getBalance()){
                throw new AmountIsGreaterThanCurrentBalance("Amount is greater than current balance. Your current balance: " + account.getBalance());
            }
            account.withdraw(amount);
            System.out.println("Withdraw successfully");
        }else{
            throw new AccountNotExistExcepiton("There is not account with this account number: " + accountNumber);
        }
    }

    @Override
    public void transfer(String fromAccount, String toAccount, double amount) {
        Account from = accountExistOrNot(fromAccount);
        Account to = accountExistOrNot(toAccount);

        if(from != null && to != null){
            from.withdraw(amount);
            to.deposit(amount);
        }else{
            throw new AccountNotExistExcepiton("Account not exist with these account numbers");
        }
    }

    @Override
    public void statement(String accountNumber) {
        Account account = accountExistOrNot(accountNumber);

        if(account != null){
            account.displayBankTransactions();
        }else{
            throw new AccountNotExistExcepiton("There is not account with this account number: " + accountNumber);
        }
    }

    @Override
    public Account accountExistOrNot(String accountNumber) {
        for(Account account : BankingService.accounts){
            if(accountNumber.equals(account.getAccountNumber())){
                return account;
            }else{
                throw new AccountNotExistExcepiton("There is not account with this account number: " + accountNumber);
            }
        }
        return null;
    }
}

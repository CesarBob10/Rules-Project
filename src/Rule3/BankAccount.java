/**
 * @author Julio Cebrero
 * 
 * Rule 06-MET03-J: Methods that perform a security check must be
 * declared private or final
 */
package src.Rule3;

/**
 * Represents a BankAccount class that helps demonstrates the rule by
 * having methods that contain security checks declared as final or private
 * to prevent malicous subclasses from overriding and omiting checks.
 */
public class BankAccount {

    /** The current balance of the account */
    private double balance;

    /** The name of the account owner */
    private String owner;

    /**
     * Constructs a BankAccount with an owner and starting balance
     * @param owner the name of the account owner
     * @param balance the starting balance of the account
     */
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    /**
     * Withdraws an amount from the account.
     * Declared final to prevent subclasses from overriding and
     * omitting the security checks.
     * @param amount the amount to widthraw, must be positive
     * @throws IllegalArgumentException if amount is zero or negative
     * @throws SecurityException if amount exceeds current balance
     */
    public final void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive!");
        }
        if(amount>balance){
            throw new SecurityException("Insufficient funds!");
        }
        balance-=amount;
        System.out.println("Withdrew: $"+amount);
    }

    /**
     * Checks if a user is authorized to access the account.
     * @param user the name of the user requesting access
     * @return true if the user is authorized
     * @throws SecurityException if the user is not the account owner
     */
    private boolean isAuthorized(String user){
        if(!user.equals(this.owner)){
            throw new SecurityException("Unauthorized Access!");
        }
        return true;
    }

    /**
     * Displays the current balance after verifying authoriztion.
     * Declared final to prevent subclasses from overriding and omitting
     * the authorization check.
     * @param user the name of the user requesting the balance
     * @throws SecurityException if the user is not authorized
     */
    public final void viewBalance(String user){
        isAuthorized(user);
        System.out.println("Balance $"+ balance);
    }
}

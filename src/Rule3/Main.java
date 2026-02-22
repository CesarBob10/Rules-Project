/**
 * @author Julio Cebrero
 * 
 * Rule 06-MET03-J: Methods that perform a security check must be
 * declared private or final
 */
package src.Rule3;

/**
 * Main class that demontrates that security methods declared as final or private
 * cannot be overridden to bypass security checks.
 */
public class Main {

    /**
     * Entry point of the program. Demonstrates valid and invalid interactions
     * with the BankAccount security methods.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        //Valid fully initialized BankAccount
        BankAccount account1=new BankAccount("Bob", 2000.0);

        //Valid withdrawl
        account1.withdraw(500.0);

        //Invalid withdrawl - negative amount
        try{
            account1.withdraw(-100.0);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        //Invalid withdrawl - insufficient funds
        try{
            account1.withdraw(9999.0);
        }catch(SecurityException e){
            System.out.println("Error: "+ e.getMessage());
        }

        //Authorized balance check
        account1.viewBalance("Bob");

        //Unauthorized balance check
        try{
            account1.viewBalance("John");
        }catch(SecurityException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

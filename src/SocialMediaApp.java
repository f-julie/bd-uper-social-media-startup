public class SocialMediaApp {

    private Account[] accounts;

    /**
     * Build at least 3 accounts and load them into the accounts array.
     * Make up your own information about the accounts, but make each one unique.
     * Make sure each account also has some messages, and use some varying amounts of messages.
     */
    public void loadDemoAccounts() {
        // TODO: Finish this method.
    }

    /**
     * Simulates an account posting a new message.
     * The account should have an extra message when this method is over.
     * @param account the account which is posting a message
     * @param time the timestamp of when the message occurred
     * @param text the text of the message
     */
    public void postMessage(Account account, TimeStamp time, String text) {
        // TODO: Finish this method.
    }

    /**
     * Print all the usernames. They should be alphabetized.
     * This should work with any number of accounts.
     */
    public void printUserNames() {
        System.out.println("Usernames:");
        // TODO: Finish this method.
    }

    /**
     * Print the number of accounts in each state. Don't print states without accounts.
     * This method should work with any number of accounts.
     * Example result:
     * Alabama: 2
     * Arizona: 5
     * California: 17
     * ...
     */
    public void printStateCounts() {
        System.out.println("Accounts per State:");
        // TODO: Finish this method.
    }

    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();

        app.loadDemoAccounts();

        System.out.println("Testing a Message Being Added");
        System.out.println("First Account Before Adding a new Message:");
        System.out.println(app.accounts[0]);
        System.out.println("First Account After Adding a new Message:");
        app.postMessage(app.accounts[0], new TimeStamp(MonthEnum.March, 30, 10, 05), "Going through a guided lecture");
        System.out.println(app.accounts[0]);


        System.out.println();
        app.printUserNames();

        System.out.println();
        app.printStateCounts();
    }

}

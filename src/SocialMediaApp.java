import javax.swing.plaf.nimbus.State;
import java.sql.SQLOutput;
import java.util.Arrays;

public class SocialMediaApp {

    private Account[] accounts;

    /**
     * Build at least 3 accounts and load them into the accounts array.
     * Make up your own information about the accounts, but make each one unique.
     * Make sure each account also has some messages, and use some varying amounts of messages.
     */
    public void loadDemoAccounts() {
        // TODO: Finish this method.
        // Account 1
        LoginInfo loginInfo1 = new LoginInfo("sam481", "12345678");
        Address address1 = new Address("45 Main Street", "Amsterdam", StateEnum.Michigan, "48821");
        AccountDetails accountDetails1 = new AccountDetails("Samantha", loginInfo1, address1);

        TimeStamp firstMessage1TimeStamp = new TimeStamp(MonthEnum.May, 14, 12, 00);
        Message firstMessage1 = new Message(firstMessage1TimeStamp, "Played basketball");
        TimeStamp secondMessage1TimeStamp = new TimeStamp(MonthEnum.June, 1, 2, 34);
        Message secondMessage1 = new Message(secondMessage1TimeStamp, "I had a birthday.");
        TimeStamp thirdMessage1TimeStamp = new TimeStamp(MonthEnum.June, 2, 5, 01);
        Message thirdMessage1 = new Message(thirdMessage1TimeStamp, "I went on a trip.");

        Message[] messages1 = {firstMessage1, secondMessage1, thirdMessage1};

        Account account1 = new Account(accountDetails1, messages1);

        // Account 2
        LoginInfo loginInfo2 = new LoginInfo("sam481", "12345678");
        Address address2 = new Address("45 Main Street", "Amsterdam", StateEnum.Michigan, "48821");
        AccountDetails accountDetails2 = new AccountDetails("Samantha", loginInfo2, address2);

        TimeStamp firstMessage2TimeStamp = new TimeStamp(MonthEnum.May, 14, 12, 00);
        Message firstMessage2 = new Message(firstMessage2TimeStamp, "Played basketball");
        TimeStamp secondMessage2TimeStamp = new TimeStamp(MonthEnum.June, 1, 2, 34);
        Message secondMessage2 = new Message(secondMessage2TimeStamp, "I had a birthday.");
        TimeStamp thirdMessage2TimeStamp = new TimeStamp(MonthEnum.June, 2, 5, 01);
        Message thirdMessage2 = new Message(thirdMessage2TimeStamp, "I went on a trip.");

        Message[] messages2 = {firstMessage2, secondMessage2, thirdMessage2};

        Account account2 = new Account(accountDetails2, messages2);

        // Account 3
        LoginInfo loginInfo3 = new LoginInfo("sam481", "12345678");
        Address address3 = new Address("45 Main Street", "Amsterdam", StateEnum.Michigan, "48821");
        AccountDetails accountDetails3 = new AccountDetails("Samantha", loginInfo3, address3);

        TimeStamp firstMessage3TimeStamp = new TimeStamp(MonthEnum.May, 14, 12, 00);
        Message firstMessage3 = new Message(firstMessage3TimeStamp, "Played basketball");
        TimeStamp secondMessage3TimeStamp = new TimeStamp(MonthEnum.June, 1, 2, 34);
        Message secondMessage3 = new Message(secondMessage3TimeStamp, "I had a birthday.");
        TimeStamp thirdMessage3TimeStamp = new TimeStamp(MonthEnum.June, 2, 5, 01);
        Message thirdMessage3 = new Message(thirdMessage3TimeStamp, "I went on a trip.");

        Message[] messages3 = {firstMessage3, secondMessage3, thirdMessage3};

        Account account3 = new Account(accountDetails3, messages3);


        accounts = new Account[]{account1, account2, account3};

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
        // Option 1
        Message message = new Message(time, text);
        account.addMessage(message);

        // Option 2
        // account.addMessage(new Message(time, text));
    }

    /**
     * Print all the usernames. They should be alphabetized.
     * This should work with any number of accounts.
     */
    public void printUserNames() {
        System.out.println("Usernames:");
        // TODO: Finish this method.
        String[] names = new String[accounts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = accounts[i].getDetails().getLoginInfo().getUsername();
        }
        Arrays.sort(names);

        // Option 1
        for (String name : names) {
            System.out.println(name);
        }

        // Option 2
        // System.out.println(Arrays.toString(names));
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

        int [] tallies = new int[50];
        for (Account account : accounts) {
            StateEnum accountState = account.getDetails().getAddress().getState();
            tallies[accountState.ordinal()]++;
        }

        StateEnum[] stateNames = StateEnum.values();
        for (int i = 0; i < tallies.length; i++) {
            if (tallies[i] > 0) {
                System.out.println(stateNames[i] + "\t" + tallies[i]);
            }
        }
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

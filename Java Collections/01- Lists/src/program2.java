/*
    Java Masterclass
    Kareem Abdelkader
    Implement a browser history tracker using a LinkedList
*/


import java.util.LinkedList;

class BrowserHistory {
    private LinkedList<String> history;

    public BrowserHistory() {
        this.history = new LinkedList<>();
    }

    //Method to visit a new page
    public void visitPage(String url) {
        history.add(url);
        System.out.println("Visited: " + url);
    }

    //Method to go back to the previous page
    public void goBack() {
        if (!history.isEmpty()) {
            String lastPage = history.removeLast();
            System.out.println("Going back from: " + lastPage);
        } else {
            System.out.println("No history available.");
        }
    }

    //Method to show browsing history
    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No browsing history.");
        } else {
            System.out.println("Browsing History:");
            for (String page : history) {
                System.out.println(page);
            }
        }
    }

}


public class program2 {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("https://google.com");
        browser.visitPage("https://github.com");
        browser.visitPage("https://stackoverflow.com");

        browser.showHistory();
        browser.goBack();
        browser.showHistory();

    }

}

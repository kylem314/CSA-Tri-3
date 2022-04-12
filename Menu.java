package src;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

// Creating a menu
public class Menu {
    // Hashmap = dictionary for menu; option, row
    Map<Integer, MenuRow> menu = new HashMap<>();

    // Menu constructor, 
    public Menu(MenuRow[] rows) {
        int i = 0;
        for (MenuRow row : rows) {
            // Build HashMap for lookup convenience
            menu.put(i++, new MenuRow(row.getTitle(), row.getAction()));
        }
    }

    // Getter to get the row
    public MenuRow get(int row) {
        return menu.get(row);
    }

    // Iterate through menu dictionary to print options
    public void print() {
        for (Map.Entry<Integer, MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " 🢡 " + pair.getValue().getTitle());
        }
    }

    /**
     *  To test run Driver
     */
    public static void main(String[] args) {
        Driver.main(args);
    }

}

// The MenuRow Class has title and action for individual line item in menu
class MenuRow {
    String title;       // menu item title
    Runnable action;    // menu item action, using Runnable

    /**
     *  Constructor for MenuRow,
     *
     * @param  title,  is the description of the menu item
     * @param  action, is the run-able action for the menu item
     */
    public MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    /**
     *  Getters
     */
    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    /**
     *  Runs the action using Runnable (.run)
     */
    public void run() {
        action.run();
    }
}

// The Main Class illustrates initializing and using Menu with Runnable action
class Driver {
    /**
     *  Menu Control Example
     */
    public static void main(String[] args) {
        // Row initialize
        MenuRow[] rows = new MenuRow[]{
                new MenuRow("Quit", () -> main(null)),
                new MenuRow("(W0) Number Swapper", () -> NumberSwapper.main(null)),
                new MenuRow("(W1) Matrix", () -> Matrix.main(null)),
                //new MenuRow("(W2) Queue", () -> QueueTester.main(null)),
                new MenuRow("(W2) Calculator", () -> Calculator.main(null)),
                new MenuRow("(W3) Sort", () -> Sort.main(null))
        };
      

        // Menu construction
        Menu menu = new Menu(rows);

        // Run menu forever, exit condition contained in loop
        while (true) {
            System.out.println("Menu:");
            // print rows
            menu.print();

            // Scanner for integer input
            try {
                Scanner sc1 = new Scanner(System.in);
                int selection = sc1.nextInt();

                // menu action
                try {
                    MenuRow row = menu.get(selection);
                    // Exit menu loop if quit is selected
                    if (row.getTitle().equals("Quit"))
                        return;
                  
                    // Execute selected option
                    row.run();
                } catch (Exception e) {
                    System.out.println("Invalid input" + e);
                }
              
              // Will run if the scanner reads a non-integer input
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


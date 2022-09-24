package quote.quotegenerator;

import quote.quotegenerator.view.QuoteGeneratorUI;

import javax.swing.*;

/**
 * The main class that contains one method to run the GUI
 *
 * @author Daven Chohan
 */

public class QuoteGeneratorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuoteGeneratorUI();
            }
        });
    }
}

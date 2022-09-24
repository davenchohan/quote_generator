package mockexam.quotegenerator.control;

import mockexam.quotegenerator.model.MotivatingQuotes;

/**
 * A controller that manages the quotes.
 *
 * @author Daven Chohan
 */

public class QuoteManager {
    private final MotivatingQuotes motivatingQuotes;

    public QuoteManager() {
        motivatingQuotes = new MotivatingQuotes();
    }

    public String getMotivatingQuote() {
        return motivatingQuotes.getRandomQuote();
    }
}

package quote.quotegenerator.model;

import java.util.Random;

/**
 * This class acts as a database of motivating quotes.
 * Provides a public method that returns a quote randomly picked.
 * Quotes taken from: https://www.success.com/17-motivational-quotes-to-inspire-you-to-be-successful/
 */
public class MotivatingQuotes {
    //a list of motivating quotes
    private static String[] quotes = {
            "Your limitation - it’s only your imagination.",
            "Push yourself, because no one else is going to do it for you.",
            "Sometimes later becomes never. Do it now.",
            "Great things never come from comfort zones.",
            "Dream it. Wish it. Do it",
            "Success doesn't just find you. You have to go out and get it.",
            "Dream bigger. Do bigger.",
            "Don't stop when you're tired. Stop when you are done.",
            "Wake up with determination. Go to bed with satisfaction.",
            "Do something today that your future self will thank you for."
    };

    //a member field that generate random numbers
    private Random random;

    public MotivatingQuotes() {
        random = new Random();
    }

    public String getRandomQuote() {
        //generate a pseudo-random int from 0 to length of list-1, inclusive
        return quotes[random.nextInt(quotes.length)];
    }

}

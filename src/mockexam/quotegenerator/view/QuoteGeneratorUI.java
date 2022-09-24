package mockexam.quotegenerator.view;

import mockexam.quotegenerator.control.QuoteManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that displays the GUI for the Quote Generator using java swing
 *
 * @author Daven Chohan
 */

public class QuoteGeneratorUI implements ActionListener {
    JFrame applicationFrame;
    JPanel mainPanel;
    JButton generateButton;
    JPanel quotePanel;
    JLabel quoteLabel;
    QuoteManager quoteManager;

    public QuoteGeneratorUI() {
        quoteManager = new QuoteManager();
        applicationFrame = new JFrame("Quote Generator");
        applicationFrame.setSize(new Dimension(450, 200));

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        quotePanel = new JPanel();
        quoteLabel = new JLabel("Dream it. Wish it. Do it");
        Border borderTasks = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(20,20,20,20), BorderFactory.createTitledBorder("Motivating Quote"));
        quotePanel.setBorder(borderTasks);
        quoteLabel.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));
        quotePanel.add(quoteLabel);
        mainPanel.add(quotePanel);

        generateButton = new JButton("Generate Quote");
        generateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        generateButton.addActionListener(this);
        mainPanel.add(generateButton);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        applicationFrame.add(mainPanel);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        quoteLabel.setText(quoteManager.getMotivatingQuote());
    }
}

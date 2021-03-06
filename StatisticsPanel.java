
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
/**
 * 
 * @author Alexi Musick
 * @author Matthew Klopfer
 * 
 * @version 12-6-2018
 * Project 4
 * 
 * Statistics panel provides a panel for the statistics gathered from the data.
 */
public class StatisticsPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    /** JRadioButton for minimum **/
    private JRadioButton min = new JRadioButton("MINIMUM");

    /** JRadioButton for average **/
    private JRadioButton ave = new JRadioButton("AVERAGE");

    /** JRadioButton for maximum calculations, default choice when opened **/
    private JRadioButton max = new JRadioButton("MAXIMUM", true);

    /** New button group for the JRadioButtons **/
    private ButtonGroup stats = new ButtonGroup();

    /** New border for the parameter **/
    private TitledBorder statistics = new TitledBorder(MesonetFrame.blackline, "Statistics");

    public StatisticsPanel() {

        /** Set the layout, font and the border of the JPanel **/
        statistics.setTitleFont(MesonetFrame.timesRoman);
        setLayout(new GridLayout(3, 0));
        setBorder(statistics);

        /** Add all of the components of the JPanel **/
        add(min).setFont(MesonetFrame.timesRoman);
        add(ave).setFont(MesonetFrame.timesRoman);
        add(max).setFont(MesonetFrame.timesRoman);

        // Set the background colors of the buttons
        min.setBackground(Color.LIGHT_GRAY);
        ave.setBackground(Color.LIGHT_GRAY);
        max.setBackground(Color.LIGHT_GRAY);

        /** Add the JRadioButtons to the ButtonGroup **/
        stats.add(min);
        stats.add(ave);
        stats.add(max);

    }

    /**
     * @param <StatsType>
     * 
     */
    public StatsType isSelected() {

        if (max.isSelected()) {
            return StatsType.MAXIMUM;
        }
        
        else if (ave.isSelected()) {
            return StatsType.AVERAGE;
        }
        
        else if (min.isSelected()) {
            return StatsType.MINIMUM;
        }
        
        
        return null;

    }
}
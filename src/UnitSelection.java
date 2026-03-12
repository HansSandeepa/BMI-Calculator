import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitSelection extends JFrame {
    private JPanel MainPanel;
    private JLabel title;
    private JLabel subTitle;
    private JButton metricBtn;
    private JButton englishBtn;
    private static UnitSelection us = new UnitSelection();

    public UnitSelection() {
        metricBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                us.setVisible(false);
                MetricData m = new MetricData();
                m.setTitle("Metric Calculator");
                m.setSize(600,400);
                m.setLocationRelativeTo(null);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                m.setVisible(true);
            }
        });

        //edited by anjana
        englishBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                us.setVisible(false);
                EnglishData ed = new EnglishData();
                ed.setTitle("Metric Calculator");
                ed.setSize(400,200);
                ed.setLocationRelativeTo(null);
                ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ed.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        us.setContentPane(us.MainPanel);
        us.setTitle("Metric Calculator");
        us.setSize(300,200);
        us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        us.setLocationRelativeTo(null);
        us.setVisible(true);
    }
}

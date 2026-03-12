import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricData extends JFrame {
    private JLabel weightLabel;
    private JTextField weightInput;
    private JTextField heightInput;
    private JButton calculateButton;
    private JLabel heightLabel;
    private JPanel metricPanel;
    private JLabel output;

    public MetricData() {
        setContentPane(metricPanel);
        calculateButton.addActionListener(new ActionListener() {
            //test
            @Override
            public void actionPerformed(ActionEvent e) {
                double weight = Double.parseDouble(weightInput.getText());
                double height = Double.parseDouble(heightInput.getText());

                double BMI = weight / (height * height);
                System.out.println(BMI);
                output.setText("BMI: " + BMI);
            }
        });
    }
}

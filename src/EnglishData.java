import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnglishData extends JFrame{
    private JLabel weightLabel;
    private JTextField weightInput;
    private JLabel heightLabel;
    private JTextField heightInput;
    private JButton calculateButton;
    private JPanel englishPanel;
    private JLabel output;

    public EnglishData(){
        //set
        setContentPane(englishPanel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double weight = Double.parseDouble(weightInput.getText());
                double height = Double.parseDouble(heightInput.getText());

                double BMI = (weight * 703) / (height * height);
                System.out.println(BMI);
                output.setText("BMI: " + BMI);
            }
        });
    }
}

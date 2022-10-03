import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        CalculatorGUI app = new CalculatorGUI();
        app.setVisible(true); // make the window visible
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close not only the window but also the program
    }
}

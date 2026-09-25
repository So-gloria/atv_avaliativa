import javax.swing.JOptionPane;

public class q2 {
    public static void main (String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de b"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de c"));

        bhaskara(a, b, c);
        
    }
    
    public static void bhaskara(int a, int b, int c) {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais");
        } 
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "As raízes são: " + x1 + " e " + x2);
        }
    }
}

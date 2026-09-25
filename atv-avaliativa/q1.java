import javax.swing.JOptionPane;

public class q1 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            String entra_variavel = JOptionPane.showInputDialog("diga um numero");
            vetor[i] = Integer.parseInt(entra_variavel);
        }

        int[] vetor2 = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[vetor.length - 1 - i];
        }

        JOptionPane.showMessageDialog(null, java.util.Arrays.toString(vetor2));
    }
}
    


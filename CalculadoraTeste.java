import javax.swing.JOptionPane;

public class CalculadoraTeste {
    
    public static void main(String[] args) {
        Calculadora calvoguedes = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("digite seu numero preferido ")));
        //testar soma
        double soma = calvoguedes.somar(2, 3);
        System.out.println(soma);
        //testar subtracao
        double sub = calvoguedes.subtrair(2, 3);
        System.out.println(sub);

        System.out.println(calvoguedes.somarComPreferido(Double.parseDouble(JOptionPane.showInputDialog("digite seu numero para somar"))));

        System.out.println(calvoguedes.subtrair(10, 3));
    }
}

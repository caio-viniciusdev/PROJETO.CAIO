import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MinhaJanela {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro Aluno");

        janela.setLayout(new FlowLayout());

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(40);
        
        JLabel lblIdade = new JLabel("Idade:");
        JTextField txtIdade = new JTextField(2);
        
        JLabel lblCpf = new JLabel("CPF:");
        JTextField txtCpf = new JTextField("15");

        JLabel lblCpf = new JLabel("1. Nota:");
        JTextField txtCpf = new JTextField("3");

        JLabel lblCpf = new JLabel("2. Nota:");
        JTextField txtCpf = new JTextField("3");

        JLabel lblCpf = new JLabel("3. Nota:");
        JTextField txtCpf = new JTextField("3");

        JButton btnCadastrar = new JButton("CADASTRAR");

        btnCadastrar.addActionListener(ActionListener e ->
        );
        janela.add(botao);
        janela.setTitle("Minha primeira janela");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    } 
}
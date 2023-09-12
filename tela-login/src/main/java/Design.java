import entities.SistemaLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame {
    private JPanel contentPane;
    private JFormattedTextField input_email;
    private JPasswordField input_senha;
    private JButton entrar;
    private JLabel image;
    private JButton fechar;


    public Design() {
        setContentPane(contentPane);

        // Definir um padding para o campo
        input_email.setMargin(new Insets(3, 5, 2, 5));
        input_senha.setMargin(new Insets(3, 5, 2, 5));

        // Definir uma borda para o campo
        input_email.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.yellow));
        input_senha.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.yellow));

        //Adicionar imagem
        ImageIcon imageIcon = new ImageIcon("src/main/logo.png");

        //Colocar a imagem no jLabel
        image.setIcon(imageIcon);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SistemaLogin sistem = new SistemaLogin();

                String email = String.valueOf(input_email.getText());
                String senha = String.valueOf(input_senha.getText());

                sistem.telaLogin(email, senha);
            }
        });
        fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Finalizando programa !",
                        "Que pena !", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });
    }


    public static void main(String[] args) {
        Design dialog = new Design();
        dialog.setSize(600, 350);
        dialog.setTitle("Tela de login");
        dialog.setVisible(true);
    }

}

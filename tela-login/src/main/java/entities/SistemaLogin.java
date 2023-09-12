package entities;

import javax.swing.*;
import java.util.Scanner;


public class SistemaLogin {
    Scanner leitor = new Scanner(System.in);

    public String input_email;
    public String input_senha;

    // contador utilizado para validar as chances de logar no sistema
    public Integer contador = 3;

    // fornece uma interface para o usuario colocar login e senha
    public void telaLogin(String email, String senha) {


        input_email = email;
        input_senha = senha;
        logar();
    }


    //valida se as credenciais estão certas
    public void logar() {

        if (input_email.equals("admin") && input_senha.equals("123")) {
            telaAcessoLiberado();

        }else if (input_email.isBlank() || input_senha.isBlank()){
            JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos", "Campos", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, tente novamente","Campos incorretos", JOptionPane.ERROR_MESSAGE);
        }
    }

    //mensagem de acerto
    public void telaAcessoLiberado() {
        JOptionPane.showConfirmDialog(null, "Acesso liberado ! \n Seja bem vindo", "Olá novamente", JOptionPane.DEFAULT_OPTION);
    }
}



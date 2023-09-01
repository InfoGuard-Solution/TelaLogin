package entities;

import java.util.Scanner;

public class SistemaLogin {
    Scanner leitor = new Scanner(System.in);

    public String input_email;
    public String input_senha;

    // contador utilizado para validar as chances de logar no sistema
    public Integer contador = 3;

    // fornece uma interface para o usuario colocar login e senha
    public void telaLogin() {
        System.out.println("""
                |--------------------------|
                |      Tela de Login       |
                |--------------------------| 
                """);

        System.out.println("""
                |--------------------------|
                |          Login:          |
                |--------------------------|        
                        """);

        input_email = leitor.nextLine();

        System.out.println("""
                |--------------------------|
                |          Senha:          |
                |--------------------------|
                """);

        input_senha = leitor.nextLine();
        logar();
    }


    //valida se as credenciais estão certas
    public void logar() {

        if (input_email.equals("admin") && input_senha.equals("123")) {
            telaAcessoLiberado();

        } else {
            if (contador.equals(0)) {
                System.out.println("Acesso negado, finalizando programa");
            } else {
                System.out.println("Insira seu login novamente!" + String.format("(%d)",contador));
                contador--;
                telaLogin();
            }
        }
    }

    //mensagem de acerto
    public void telaAcessoLiberado() {
        System.out.println("""
                |--------------------------|
                |      Acesso liberado     |
                |        Bem vindo!        |
                |--------------------------|
                """);
    }
}



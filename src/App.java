/*
 * Gerador de Senhas: Crie um programa que gere uma senha aleatória com base em critérios 
 * fornecidos pelo usuário, como comprimento e tipos de caracteres (letras maiúsculas, minúsculas, números, símbolos).
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário o comprimento da senha
        System.out.print("Digite o comprimento da senha: ");
        int comprimento = scanner.nextInt();
        
        // Variáveis para armazenar os tipos de caracteres permitidos
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        // Combinar todos os tipos de caracteres permitidos
        String caracteresPermitidos = letrasMaiusculas + letrasMinusculas + numeros + simbolos;

        // Criar um objeto SecureRandom para gerar a senha
        SecureRandom random = new SecureRandom();

        // Inicializar uma string para armazenar a senha gerada
        StringBuilder senha = new StringBuilder();

        // Gerar a senha aleatória
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            senha.append(caracteresPermitidos.charAt(index));
        }

        // Imprimir a senha gerada
        System.out.println("A senha gerada é: " + senha.toString());

        scanner.close();
    }
}

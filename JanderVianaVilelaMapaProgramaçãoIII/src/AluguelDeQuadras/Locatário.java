/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AluguelDeQuadras;

import javax.swing.JOptionPane;

/**
 *
 * @author JanderVianaVilela Ra:21082308-5 MapaProgramaçãoIII
 */
public class Locatário {

    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public Locatário() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void verificarMaiorIdade() {

        int idade = 2023 - getAnoNascimento();
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Locatorio é maior de idade");
        } else {
            JOptionPane.showMessageDialog(null, "Locatorio é menor de idade");
        }
    }

    public void cadastrarLocatario() {

        JOptionPane.showMessageDialog(null, "\nCadastrar locatário.\n");

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do locatário:");
        setNome(nome);

        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do locatário:");
        setCpf(cpf);

        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone do locatário:");
        setTelefone(telefone);

        String anoNascimentoString = JOptionPane.showInputDialog(null, "Digite o ano de nascimento do locatário:");
        int anoNascimento = Integer.parseInt(anoNascimentoString);
        setAnoNascimento(anoNascimento);

        JOptionPane.showMessageDialog(null, "Cadastro Locatário realizado com sucesso.");

        /* Scanner scannerTexto = new Scanner(System.in);

        System.out.println("\nCadastro de Locatorio.\n");
        Scanner EntradaInteiro = new Scanner(System.in);

        System.out.println("Digite o nome do locatário: ");
        setNome(scannerTexto.next());

        System.out.println("Digite o CPF do locatário: ");
        setCpf(scannerTexto.next());

        System.out.println("Digite o Telefone do locatário: ");
        setTelefone(scannerTexto.next());

        System.out.println("Digite o Ano de Nascimento do locatário: ");
        setAnoNascimento(EntradaInteiro.nextInt());

        System.out.println("Cadastro Realizado com Sucesso.");
         */
    }
}

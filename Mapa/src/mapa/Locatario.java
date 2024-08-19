package mapa;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jander
 */
public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

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
    
    

    public void cadastrar() {
        this.nome = JOptionPane.showInputDialog("Nome do locatário:");
        this.cpf = JOptionPane.showInputDialog("CPF do locatário:");
        this.telefone = JOptionPane.showInputDialog("Telefone do locatário:");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento do locatário:"));
    }

   
    public boolean isMaiorIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return (anoAtual - anoNascimento) >= 18;
    }
}
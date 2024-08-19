package mapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Jander
 */
public class Quadra {
    private String nome;
    private String tipo;
    private double valorMinuto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
    

    public void cadastrar() {
        this.nome = JOptionPane.showInputDialog("Nome da quadra:");
        this.tipo = JOptionPane.showInputDialog("Tipo da quadra:");
        this.valorMinuto = Double.parseDouble(JOptionPane.showInputDialog("Valor do minuto da quadra:"));
    }

   
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AluguelDeQuadras;

import javax.swing.JOptionPane;

/**
 * @author JanderVianaVilela Ra:21082308-5 MapaProgramaçãoIII
 */
public class Quadra {

    private String nome;
    private String tipoDaquadra;
    private double valorMinuto;

    public Quadra() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaquadra() {
        return tipoDaquadra;
    }

    public void setTipoDaquadra(String tipoDaquadra) {
        this.tipoDaquadra = tipoDaquadra;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }



    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public void CadastrarQuadra() {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome da quadra:");
        setNome(nome);

        String tipoDaQuadra = JOptionPane.showInputDialog(null, "Digite o tipo da quadra:");
        setTipoDaquadra(tipoDaQuadra);

        String valorMinutoString = JOptionPane.showInputDialog(null, "Digite o valor do minuto:");
        int valorMinuto = Integer.parseInt(valorMinutoString);
        
        setValorMinuto(valorMinuto);

        /**
         * System.out.println("\nCadastro de quadra.\n"); Scanner EntradaInteiro
         * = new Scanner(System.in); Scanner scannerTexto = new
         * Scanner(System.in); Scanner scannerTexto2 = new Scanner(System.in);
         *
         * System.out.println("Digite o nome da quadra: ");
         * setNome(scannerTexto.next());
         *
         * System.out.println("Digite o tipo da quadra: ");
         * setTipoDaquadra(scannerTexto2.next());
         *
         * System.out.println("Digite o Valor do Minuto: ");
         * setValorMinuto(EntradaInteiro.nextInt());
         *
         * System.out.println("Cadastro realizado com sucesso.");
         */
    }

}

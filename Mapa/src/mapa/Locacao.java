
package mapa;

import java.time.LocalDateTime;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jander
 */
public class Locacao {

    private Quadra quadra;
    private Locatario locatario;
    private LocalDateTime dataHora;
    private int tempoMinutos;
    private boolean necessitaEquipamento;

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    
    
   
    public void cadastrarLocatario(){
        }
    public void verificarIdade(){
        
    }
    public void cadastrarQuadra() {
        cadastrarQuadra();
        cadastrarLocatario();
        if (verificarIdade(verificarIdade())) {
        } else {
            JOptionPane.showMessageDialog(null, "Locatário é menor de idade. Locação não permitida.");
            return;
        }
        tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em minutos da locação:"));
        necessitaEquipamento = JOptionPane.showInputDialog("Necessita equipamento? (S/N):").equalsIgnoreCase("S");
        mostrarResumoLocacao();

    }

    public void cadastrarLocacao() {
        // Cadastrar quadra
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Informe o nome da quadra: ");
        String nomeQuadra = scanner.nextLine();

        System.out.println("Informe o tipo da quadra (Areia, Saibro, Futebol...): ");
        String quadra = scanner.nextLine();
    }

    public double calcularLocacao() {
        double valorMinuto = quadra.getValorMinuto();
        if (tempoMinutos > 120) {
            valorMinuto *= 0.9;
        }
        double valorTotal = valorMinuto * tempoMinutos;
        if (necessitaEquipamento) {
            valorTotal += 50;
        }
        return valorTotal;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    public Locacao(Quadra quadra, Locatario locatario, int tempoMinutos, boolean necessitaEquipamento) {
        this.quadra = quadra;
        this.locatario = locatario;
        this.tempoMinutos = tempoMinutos;
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public boolean isNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(boolean necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public double getValorCalculado() {
        double valorMinuto = quadra.getValorMinuto();
        int horasCompletas = tempoMinutos / 60;
        int minutosExtras = tempoMinutos % 60;
        double valorTotal = 0;

        if (horasCompletas >= 2) {
            valorMinuto *= 0.9;
        }

        valorTotal = valorMinuto * tempoMinutos;

        if (necessitaEquipamento) {
            valorTotal += 50;
        }

        return valorTotal;
    }

    public void mostrarResumoLocacao() {
        JOptionPane.showMessageDialog(null, "Locatario");
        JOptionPane.showMessageDialog(null, "Nome: " + locatario.getNome());
        JOptionPane.showMessageDialog(null, "CPF: " + locatario.getCpf());
        JOptionPane.showMessageDialog(null, "Telefone: " + locatario.getTelefone());
        JOptionPane.showMessageDialog(null, "Ano de Nascimento: " + locatario.getAnoNascimento());
        JOptionPane.showMessageDialog(null, "Quadra");
        JOptionPane.showMessageDialog(null, "Nome da Quadra: " + quadra.getNome());
        JOptionPane.showMessageDialog(null, "Tipo: " + quadra.getTipo());
        JOptionPane.showMessageDialog(null, "Valor do Minuto: " + quadra.getValorMinuto());
        JOptionPane.showMessageDialog(null, "Locação");
        JOptionPane.showMessageDialog(null, "Tempo em Minutos: " + tempoMinutos);
        JOptionPane.showMessageDialog(null, "Necessita Equipamento: " + (necessitaEquipamento ? "Sim" : "Não"));
        JOptionPane.showMessageDialog(null, "Valor Calculado: " + calcularLocacao());

    }
}

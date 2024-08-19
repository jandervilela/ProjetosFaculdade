
package AluguelDeQuadras;

import javax.swing.JOptionPane;

/**
 * @author JanderVianaVilela Ra:21082308-5 MapaProgramaçãoIII
 */
public class Locacao {
    private Locatário locatorio;
    private Quadra quadra;
    private int tempoMinuto;
    private char necessitaEquipamento;
    private double valorMinuto;

    public Locacao(Locatário locatorio, Quadra quadra, int tempoMinuto, char necessitaEquipamento, double valorMinuto) {
        this.locatorio = locatorio;
        this.quadra = quadra;
        this.tempoMinuto = tempoMinuto;
        this.necessitaEquipamento = necessitaEquipamento;
        this.valorMinuto = valorMinuto;
    }
    

    public Locacao() {
    }

    public Locatário getLocatário() {
        return locatorio;
    }

    public void setLocatário(Locatário locatorio) {
        this.locatorio = locatorio;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }
   
    public double calcularLocacao(){
        valorMinuto = getQuadra().getValorMinuto();
        double valorLocao = valorMinuto * getTempoMinuto();
        
        if(getTempoMinuto() > 120){
            valorMinuto = (valorMinuto / 100) * 90;
        }
        valorLocao = valorMinuto * getTempoMinuto();
        if(getNecessitaEquipamento() == 'S' || getNecessitaEquipamento() == 's'){
            valorLocao = valorLocao + 50;
        }
        
        return valorLocao;
    }
    public void mostrarResumoLocacao(){
        JOptionPane.showMessageDialog(null,"\nResumo da Locação\nLocatário\nNome: "+getLocatário().getNome()+
                "\nCpf: "+getLocatário().getCpf()+
                "\nTelefone: "+getLocatário().getTelefone()+
                "\nAno de Nascimento: "+getLocatário().getAnoNascimento()+
                "\nQuadra"+
                "\nNome da Quadra: "+getQuadra().getNome()+
                "\nTipo: "+getQuadra().getTipoDaquadra()+
                "\nValor do Minuto: "+getQuadra().getValorMinuto()+
                "\nLocação"+
                "\nTempo em Minutos: "+getTempoMinuto()+
                "\nNecessita Equipamentos: "+getNecessitaEquipamento()+
                "\nValor Calculado: "+calcularLocacao());
        
    }
    public void cadastrarLocacao(){
        
        Quadra quadra = new Quadra();
Locatário locatário = new Locatário();

JOptionPane.showMessageDialog(null, "Cadastrar Quadra");
quadra.setNome(JOptionPane.showInputDialog(null, "Digite o nome da quadra:"));
quadra.setTipoDaquadra(JOptionPane.showInputDialog(null, "Digite o tipo da quadra:"));
quadra.setValorMinuto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor do Minuto:")));
JOptionPane.showMessageDialog(null, "Cadastro Quadra realizado com sucesso.");

JOptionPane.showMessageDialog(null, "Cadastrar Locatário");
locatário.setNome(JOptionPane.showInputDialog(null, "Digite o nome do locatário:"));
locatário.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF do locatário:"));
locatário.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do locatário:"));
locatário.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do locatário:")));

setQuadra(quadra);
setLocatário(locatário);

getLocatário().verificarMaiorIdade();

int idade = 2023 - getLocatário().getAnoNascimento();
if (idade >= 18) {
    JOptionPane.showMessageDialog(null, "Cadastro locatário realizado com sucesso.");
    setTempoMinuto(Integer.parseInt(JOptionPane.showInputDialog(null, "Tempo em Minutos:")));
    setNecessitaEquipamento(JOptionPane.showInputDialog(null, "Necessita de equipamento (S - Sim, N - Não):").charAt(0));
    mostrarResumoLocacao();
} else {
    JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO,\nLocatário menor de idade não pode concluir a locação");
}
        
        
        
       /* Scanner EntradaInteiro = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);
        
        Quadra quadra = new Quadra();
        Locatorio locatorio =  new Locatorio();
        
        quadra.CadastrarQuadra();    
        locatorio.cadastrarLocatorio();
        
        setQuadra(quadra);
        setLocatorio(locatorio);
        
        getLocatorio().verificarMaiorIdade();
        
        int idade = 2023 - getLocatorio().getAnoNascimento();
        if(idade >= 18){
            System.out.println("Tempo em Minutos: ");
            setTempoMinuto(EntradaInteiro.nextInt());
            
            System.out.println("Necessita de equipamento (S - Sim, N - Não): ");
            setNecessitaEquipamento(scannerTexto.next().charAt(0));
            
            mostrarResumoLocacao();
        }else{
            System.out.println("PROGRAMA FINALIZADO,\n"
                    + " Locatorio Menor de Idade não pode concluir a locação");
        }
     */  
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
}

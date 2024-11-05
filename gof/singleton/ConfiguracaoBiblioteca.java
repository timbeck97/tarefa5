public class ConfiguracaoBiblioteca {
    
    //instancia unica da classe
    private static ConfiguracaoBiblioteca instancia;
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

   //construtor private para nao permitir a criacao de nenhum objeto fora da classe
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

  
    //retorna a instancia unica da classe
    public static ConfiguracaoBiblioteca getInstance(String horariosDeFuncionamento, double valorMultaDiaria) {
        if (instancia == null) {
            instancia = new ConfiguracaoBiblioteca(horariosDeFuncionamento, valorMultaDiaria);
        }
        return instancia;
    }

    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}
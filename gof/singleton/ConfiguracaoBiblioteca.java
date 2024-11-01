public class ConfiguracaoBiblioteca {
    private static ConfiguracaoBiblioteca instancia;
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

   
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

  
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
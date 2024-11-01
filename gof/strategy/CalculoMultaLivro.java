public class CalculoMultaLivro implements CalculoMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}
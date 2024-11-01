public class CalculoMultaRevista implements CalculoMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
    }
}
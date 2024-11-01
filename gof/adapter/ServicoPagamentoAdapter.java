class ServicoPagamentoAdapter implements ServicoPagamento {
    private ServicoPagamentoExterno servicoPagamentoExterno;

    public ServicoPagamentoAdapter() {
        this.servicoPagamentoExterno = new ServicoPagamentoExterno();
    }

    @Override
    public void pagar(String identificador, double valor) {
        servicoPagamentoExterno.pagarFatura(identificador, valor);
    }
}
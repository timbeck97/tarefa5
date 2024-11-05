
//classe adapter que implementa a interface ServicoPagamento e utiliza a classe ServicoPagamentoExterno
//dessa forma o sistema interno nao precisa saber como o sistema externo funciona
//dessa forma reduzindo o acoplamento entre os sistemas
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
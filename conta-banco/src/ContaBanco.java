public class ContaBanco {
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}

public class ContaDebit {
    private int Numero;
    private String Agencia;
    private String NameCliente;
    private Double Saldo;

    ContaDebit(){}

    ContaDebit(int Numero, String Agencia, String NameCliente, Double Saldo){
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NameCliente = NameCliente;
        this.Saldo = Saldo;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }
    public void setNameCliente(String nameCliente) {
        NameCliente = nameCliente;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
    
    public String getAgencia() {
        return Agencia;
    }
    public int getNumero() {
        return Numero;
    }
    public String getNameCliente() {
        return NameCliente;
    }
    public Double getSaldo() {
        return Saldo;
    }
}

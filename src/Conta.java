/**
 * @author elias.santana
 * @version 1.0
 * @since 2024-05-06
 */

public class Conta {

    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * Construtor da Classe
     * @param nomeCliente2 O número da conta
     * @param agencia O número da agência
     * @param nomeCliente O nome do cliente
     * @param saldo O saldo do cliente
     */
    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    /**
     * 
     * @return Informações da conta criada
     */

    public String exibirMensagem(){

        return "Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo " + this.getSaldo() + " já está disponível para saque.";

    }
    
}

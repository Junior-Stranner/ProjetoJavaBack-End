package Conta;

public class Conta{
	private int numero;
	private String cliente;
	private String tipoCionta;
	private double saldo;
	private boolean status;
	
	
	public void deposita(double valor) {
		this.saldo +=valor;
		
		
	}
	
	
	public double saldo() {
		return saldo;
	}
	
	
	public boolean saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else
			return false;
		
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getTipoCionta() {
		return tipoCionta;
	}
	public void setTipoCionta(String tipoCionta) {
		this.tipoCionta = tipoCionta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
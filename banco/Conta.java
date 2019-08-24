package banco;

public class Conta {
private int nconta;
public String name;
private double saldo;
private double saqui;
public Conta (){
	
}


public Conta(int nconta,String name,double saldo,double saqui) {
	super();
	this.nconta = nconta;
	this.name=name;
	this.saldo = saldo;
	this.saqui=saqui;
	
}

public void setSaqui(double saqui){
	this.saqui=saqui;
}
public double getSaqui() {
	return saqui;
}

public int getNconta() {
	return nconta;
}

public void setNconta(int nconta) {
	this.nconta = nconta;
}

public double getSaldo() {
	return saldo;
}

public double saque () {
	return this.saldo-this.saqui-5.00;
}

}

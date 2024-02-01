public class CuentaCorriente {
  
  /////Atributos
  private String numeroCuenta;
  private double saldo; 

  /////Constructores
  public CuentaCorriente(){
    generarAleatorio();
  }

  public CuentaCorriente(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      this.numeroCuenta += (int)(Math.random()*10);
    }
  }

  public void ingreso (double cantidad){
    this.saldo += cantidad;
  }

  public void cargo (double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia (CuentaCorriente destino, double cantidad){
    destino.saldo += saldo;
    this.saldo -= saldo;
  }

  public double saldo (){
    return saldo;
  }

  @Override
  public String toString(){
    return String.format("Nº de cuenta: %s Saldo: %s", saldo , numeroCuenta );
    
  }

}

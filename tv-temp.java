public class tv extends TV implements ControleRemoto {
  public final String MODELO = "TV001";
  public ControleRemoto(int tamanho) {
    super(tamanho);
  }

  public void desligar() {
    super.setLigada(false);
  }
 
  public void ligar() {
    super.setLigada(true);
  }
 
  public void aumentarVolume(int taxa) { }
  public void diminuirVolume(int taxa) { }
  public void mudarCanal(int canal) { }
}
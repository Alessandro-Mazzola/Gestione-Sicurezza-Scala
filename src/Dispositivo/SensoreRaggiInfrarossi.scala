package Dispositivo

class SensoreRaggiInfrarossi(n: String, c: String, val copertura: Double) extends DispositivoSicurezza(n, c){

  //overload del costruttore
  def this(n: String, c: String) = this(n,c,20.0)
  
  override def getNomeClasse: String = "SensoreRaggInfrarossi"
  override def getTipo: Char = 's'

  override def toString: String = {
    val s1: String = getNomeClasse + ": " + ID
    val s2: String = "\nNome:                  " + nome
    val s3: String = "\nStato Dispositivo:     " + statoDispositivo
    val s4: String = "\nCollocamento:          " + collocamento
    val s5: String = "\nControllo allarme:     " + rilevaMovimento
    val s6: String = "\nCopertura:             " + copertura+"\n"
    s1 + s2 + s3 + s4 + s5 + s6
  }
}
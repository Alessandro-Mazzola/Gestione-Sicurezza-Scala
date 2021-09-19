package Dispositivo

class Allarme(n: String, c: String, val proprietario: String) extends DispositivoSicurezza(n, c) {

  //def this(n: String, c:String) = Allarme(n,c,"Nessuno")
  def emettiSuono = {
    print("\n**STO SUONANDO!!**\n")
  }

  override def getNomeClasse: String = "Allarme"
  override def getTipo: Char = 'a'

  override def toString: String = {
    val s1: String = getNomeClasse + " :          " + ID
    val s2: String = "\nNome:              " + nome
    val s3: String = "\nStato Dispositivo: " + statoDispositivo
    val s4: String = "\nCollocamento:      " + collocamento
    val s5: String = "\nControllo allarme: " + rilevaMovimento
    val s6: String = "\nProprietario:      " + proprietario + "\n"
    s1 + s2 + s3 + s4 + s5 + s6
  }
}
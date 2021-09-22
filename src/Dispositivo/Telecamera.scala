package Dispositivo
import Posizione._

// costruttore con default argument
class Telecamera(n: String, c: String, val posizione: Posizione, val proprietario: String = "Nessuno") extends DispositivoSicurezza(n, c){

  override def getNomeClasse: String = "Telecamera"
  override def getTipo: Char = 't'

  override def toString: String = {
    val s1: String = getNomeClasse + " :       " + ID
    val s2: String = "\nNome:              " + nome
    val s3: String = "\nStato Dispositivo: " + statoDispositivo
    val s4: String = "\nCollocamento:      " + collocamento
    val s5: String = "\nControllo allarme: " + rilevaMovimento
    val s6: String = "\nPosizione:         " + posizione
    val s7: String = "\nProprietario:      " + proprietario+"\n"
    s1 + s2 + s3 + s4 + s5 + s6 + s7
  }
}
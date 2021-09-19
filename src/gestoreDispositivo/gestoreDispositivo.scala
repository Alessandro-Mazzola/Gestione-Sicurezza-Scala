package gestoreDispositivo
import Dispositivo._
import scala.collection.mutable._

object gestoreDispositivo {
  var lista: ListBuffer[DispositivoSicurezza] = ListBuffer()

  def aggiungiDispositivo(d: DispositivoSicurezza): Unit = {
    lista += d
  }

  def rimuoviDispositivo(s: String) = {
    var verifica: Boolean = false
    def temp(x: DispositivoSicurezza) = {
      if (x.ID == s) {
        lista -= x
        verifica = true
      }
    }
    lista.foreach(temp)
    if (verifica == false)
      printf("\n**Errore: dispositivo non trovato**\n")
  }

  def accendiDispositivo(s: String) = {
    var verifica: Boolean = false
    def temp(x: DispositivoSicurezza) = {
      if (x.ID == s && x.statoDispositivo == false) {
        x.statoDispositivo = true
        verifica = true
      }
    }
    lista.foreach(temp)
    if (verifica == false)
      printf("\n**Errore: dispositivo non trovato**\n")
  }

  def spegniDispositivo(s: String) = {
    var verifica: Boolean = false
    def temp(x: DispositivoSicurezza) = {
      if (x.ID == s && x.statoDispositivo == true) {
        x.statoDispositivo = false
        verifica = true
      }
    }
    lista.foreach(temp)
    if (verifica == false)
      printf("\n**Errore: dispositivo non trovato**\n")
  }

  def segnalaMovimento(s: String) = {
    var verifica: Boolean = false
    def temp(x: DispositivoSicurezza) = {
      if (x.ID == s && x.statoDispositivo == true) {
        x.rilevaMovimento = true
        verifica = true
      }
    }
    lista.foreach(temp)
    if (verifica == false)
      printf("\n**Errore: dispositivo non trovato**\n")
  }

  def spegniDispositivi = {
    def temp(x: DispositivoSicurezza) =
      if (x.statoDispositivo)
        x.statoDispositivo = false
    lista.foreach(temp)

  }
  def stampaDispositiviTotali = {
    lista.foreach(x => print(x.toString + "----------------------------\n"))

  }

  def stampaDispositiviAccesi = {
    def temp(x: DispositivoSicurezza) =
      if (x.statoDispositivo)
        print(x.toString + "----------------------------\n")
    lista.foreach(temp)
  }

  def AemettiSuono(s:String) = {
    var verifica: Boolean = false
    def temp(x: DispositivoSicurezza) = {
      if (x.ID == s && x.statoDispositivo == true && x.isInstanceOf[Allarme]) {
        val b = x.asInstanceOf[Allarme]
        b.emettiSuono
        verifica = true
      }
    }
    lista.foreach(temp)
    if (verifica == false)
      printf("\n**Errore: dispositivo non trovato**\n")
  }
}
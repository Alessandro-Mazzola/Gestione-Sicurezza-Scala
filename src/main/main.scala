package main
import Dispositivo._

import gestoreDispositivo.gestoreDispositivo

object main {
  def main(args: Array[String]): Unit = {
    //print("prova")
    var a: DispositivoSicurezza = new Allarme("pippo", "cucina", "io")

    //print(a.toString)
    print("------------------\n")

    var s: DispositivoSicurezza = new SensoreRaggiInfrarossi("giovannni", "cucina", 20.0)

    //print(s.toString)
    print("------------------\n")

    var t: DispositivoSicurezza = new Telecamera("roberto", "sala", Posizione.Nord)

    //print(t.toString)
    print("------------------\n")

    gestoreDispositivo.aggiungiDispositivo(a)
    gestoreDispositivo.aggiungiDispositivo(s)
    gestoreDispositivo.aggiungiDispositivo(t)
    //gestoreDispositivo.stampaDispositiviTotali
    //gestoreDispositivo.accendiDispositivo("t3")
    gestoreDispositivo.stampaDispositiviTotali
    //gestoreDispositivo.spegniDispositivi
    //gestoreDispositivo.stampaDispositiviTotali
    gestoreDispositivo.accendiDispositivo("a1")
    gestoreDispositivo.segnalaMovimento("a1")
    gestoreDispositivo.stampaDispositiviTotali
    gestoreDispositivo.AemettiSuono("a1")

  }
}
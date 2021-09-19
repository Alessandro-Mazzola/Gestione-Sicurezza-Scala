package main
import Dispositivo._

object main {
  def main(args: Array[String]): Unit = {
    //print("prova")
    var a: DispositivoSicurezza = new Allarme("pippo", "cucina", "io")

    print(a.toString)
    print("------------------\n")

    var s: DispositivoSicurezza = new SensoreRaggiInfrarossi("giovannni", "cucina", 20.0)

    print(s.toString)
    print("------------------\n")
    
    
     var t: DispositivoSicurezza = new Telecamera("roberto", "sala", Posizione.Nord)

    print(t.toString)
    print("------------------\n")
  }
}
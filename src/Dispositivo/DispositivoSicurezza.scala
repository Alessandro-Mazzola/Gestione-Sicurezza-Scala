package Dispositivo

abstract class DispositivoSicurezza(n: String, c: String) extends getInfoClasse {

  val ID: String = getTipo + incrementaSerialID().toString()
  val nome: String  = n
  var statoDispositivo: Boolean = false
  lazy val collocamento: String = c
  var rilevaMovimento: Boolean = false
  
  def incrementaSerialID(): Int = {
    DispositivoSicurezza.serialID += 1
    DispositivoSicurezza.serialID
  }

  def accendi() = {
    if (!statoDispositivo)
      statoDispositivo = true
    else
      print("**dispositivo già acceso!**")
  }

  def spegni() = {
    if (statoDispositivo)
      statoDispositivo = false
    else
      print("**dispositivo già spento!**")
  }
}

object DispositivoSicurezza {
   var serialID: Int = 0
}
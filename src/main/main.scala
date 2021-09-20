package main
import Dispositivo._
import main._

import gestoreDispositivo.gestoreDispositivo

object main {
  def main(args: Array[String]): Unit = {
    
    var m: Menu = new Menu
    m.iniziaMenu
    m.showMenu
    print("CHIUSURA PROGRAMMA...")
  }
}
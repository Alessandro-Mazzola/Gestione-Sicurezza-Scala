package main
import gestoreDispositivo._
import Dispositivo._

class Menu {
  def showMenu = {

    var next = true
    while (next) {
      print("\n\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")
      print("%%%                                               %%%\n")
      print("%%%     0) uscita dal progrmma                    %%%\n")
      print("%%%     1) Aggiungere un dispositivo.             %%%\n")
      print("%%%     2) Rimuovi un dispositvo.                 %%%\n")
      print("%%%     3) Stampare lista dispositivi.            %%%\n")
      print("%%%     4) Stampare lista dispositivi accesi.     %%%\n")
      print("%%%     5) Accendi un dispositvo.                 %%%\n")
      print("%%%     6) Spegni un dispositvo.                  %%%\n")
      print("%%%     7) Spegni tutti i dispositivi.            %%%\n")
      print("%%%     8) Simula movimento.                      %%%\n")
      print("%%%     9) Simula suono Allarme                   %%%\n")
      print("%%%     10) Inserisco dati fittizzi               %%%\n")
      print("%%%                                               %%%\n")
      print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")

      print("\nInserisci la tua scelta\n")
      val name = scala.io.StdIn.readLine()
      name match {
        case "0" => next = false
        case "1" => caso1
        case "2" => {
          print("Inserire ID del dispositivo da rimuovere (se non si ricorda l'ID faccia prima una stampa) :\n ")
          val temp = scala.io.StdIn.readLine()
          gestoreDispositivo.rimuoviDispositivo(temp)
        }
        case "3" => gestoreDispositivo.stampaDispositiviTotali
        case "4" => gestoreDispositivo.stampaDispositiviAccesi
        case "5" => {
          print("Inserire ID del dispositivo da accendere (se non si ricorda l'ID faccia prima una stampa) :\n ")
          val temp = scala.io.StdIn.readLine()
          gestoreDispositivo.accendiDispositivo(temp)
        }
        case "6" => {
          print("Inserire ID del dispositivo da spegnere (se non si ricorda l'ID faccia prima una stampa) :\n ")
          val temp = scala.io.StdIn.readLine()
          gestoreDispositivo.spegniDispositivo(temp)
        }
        case "7" => {
          print("Spengo tutti i dispositivi...\n")
          gestoreDispositivo.spegniDispositivi
        }
        case "8" => {
          print("Quale dispositivo vuoi simulare?(se non si ricorda l'ID faccia prima una stampa)\n")
          val temp = scala.io.StdIn.readLine()
          gestoreDispositivo.segnalaMovimento(temp)

        }
        case "9" => {
          print("Quale allarme vuoi simulare? (se non si ricorda l'ID faccia prima una stampa)\n")
          val temp = scala.io.StdIn.readLine()
          gestoreDispositivo.AemettiSuono(temp)
        }
        case "10" => {
          var a: DispositivoSicurezza = new Allarme("Allarme1", "cucina", "Alessandro")
          var s: DispositivoSicurezza = new SensoreRaggiInfrarossi("Sensore1", "box", 20.0)
          var t: DispositivoSicurezza = new Telecamera("TelecameraMobile", "sala", Posizione.Nord)
          gestoreDispositivo.aggiungiDispositivo(a)
          gestoreDispositivo.aggiungiDispositivo(s)
          gestoreDispositivo.aggiungiDispositivo(t)
          print("\nDispositivi inseriti correttamente, se si vuole procedere con una stampa\n")
        }
      }
    }
  }

  def caso1 = {
    print("Inserire tipo di dispositivo (s: Sensore, a: Allarme, t Telecamera, p TelecameraAllarmata:\n ")
    val tipo = scala.io.StdIn.readLine()
    tipo match {
      case "s" => {
        print("Inserire nome sensore: ")
        val nome = scala.io.StdIn.readLine()
        print("Inserire luogo in cui viene collocato (cucina, sala, etc): ")
        val collocamento = scala.io.StdIn.readLine()
        val temp: DispositivoSicurezza = new SensoreRaggiInfrarossi(nome, collocamento, 20.0)
        gestoreDispositivo.aggiungiDispositivo(temp);
        print("\n\n--->Sensore " + nome + " inserito correttamente!\n\n")
      }
      case "a" => {

        print("Inserire nome allarme: ")
        val nome = scala.io.StdIn.readLine()
        print("Inserire luogo in cui viene collocato (cucina, sala, etc): ")
        val collocamento = scala.io.StdIn.readLine()
        print("Inserire proprietario del dispositivo: ")
        val prop = scala.io.StdIn.readLine()
        val temp: DispositivoSicurezza = new Allarme(nome, collocamento, prop)
        gestoreDispositivo.aggiungiDispositivo(temp);
        print("\n\n--->Allarme " + nome + " inserito correttamente!\n\n")
      }
      case "t" => {
        print("Inserire nome telecamera: ")
        val nome = scala.io.StdIn.readLine()
        print("Inserire luogo in cui viene collocato (cucina, sala, etc): ")
        val collocamento = scala.io.StdIn.readLine()
        print("Inserire proprietario del dispositivo: ")
        val prop = scala.io.StdIn.readLine()
        val temp: DispositivoSicurezza = new Telecamera(nome, collocamento, Posizione.Nord, prop)
        gestoreDispositivo.aggiungiDispositivo(temp);
        print("\n\n--->Allarme " + nome + " inserito correttamente!\n\n")
      }
    }
  }

  def iniziaMenu = {
    print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")
    print("%%%                                               %%%\n")
    print("%%% SOFTWARE DI GESTIONE DISPOSITIVI DI SICUREZZA %%%\n")
    print("%%%                                               %%%\n")
    print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")
  }
}
package Projet

import java.io.{FileNotFoundException, IOException}
import scala.io.Source.fromResource


class Tondeuse (var coordonnees : Int,
                var orientation : String)


object Projet extends App {

/*fichier fourni en entrée*/
  try {
    var input = fromResource("test.txt").getLines()
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
  }

/*definir les directions de la tondeuse*/
    private def Direction {
      case "N" => Direction.N
      case "E" => Direction.E
      case "W" => Direction.W
      case "S" => Direction.S

      case Direction.N => "N"
      case Direction.E => "E"
      case Direction.W => "W"
      case Direction.S => "S"




    }

  val sequence = Seq(N, E, W, S)
}

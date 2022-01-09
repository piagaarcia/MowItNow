package Projet

import java.io.{FileNotFoundException, IOException}
import scala.io.Source.fromResource




object Projet extends App {



/*fichier test en entrée*/
  try {
    var input = fromResource("test.txt").getLines()
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
  }

  class Tondeuse (var Direction : String,
                  var orientation : String)


/*definir les directions de la tondeuse*/

  val sequence = Seq(N, E, W, S)

    private def Direction {
      case "N"
      => Direction.N
      case "E"
      => Direction.E
      case "W"
      => Direction.W
      case "S"
      => Direction.S

      case Direction.N
      => "N"
      case Direction.E
      => "E"
      case Direction.W
      => "W"
      case Direction.S
      => "S"


    }

    }

  /*controler la tondeuse. Orientation: D (Droite) G (gauche) A (avancer)

   */

  val sequence = Seq(D, G, A)

  private def orientation {
    case "D"
    => orientation.D
    case "G"
    => orientation.G
    case "A"
    => orientation.A

    case orientation.D
    => "D"
    case orientation.G
    => "G"
    case orientation.A
    => "A"

  }



}

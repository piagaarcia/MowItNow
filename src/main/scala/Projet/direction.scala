package Projet

object direction extends App {



    type Direction = Value

    val N, S, E, W = Value

    def parse(s: String) = s match {
      case "N" => Direction.N
      case "E" => Direction.E
      case "W" => Direction.W
      case "S" => Direction.S

    }

    val sequence = Seq(N, E, W, S)
  }
}

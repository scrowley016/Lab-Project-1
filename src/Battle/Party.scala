package Battle


class Party(var team1: List[Character] = List(new Character, new Character, new Character, new Character)) {
  var expcount1 = 0
  var mathCount1 = 0



  def aliveCount(): Int = {
    for (players <- team1) {
      if (!players.dead) {
        mathCount1 = mathCount1 + 1
      }
    }
    mathCount1
  }


  def countExpGain(losers:Party):Int = {
    for (players <-losers.team1) {
        expcount1 = expcount1 + players.level+5*2
    }
    expcount1
  }


  def upExp(): Unit = {
    for (players <- team1) {
      if (!players.dead) {
        players.exp = expcount1 / mathCount1
      }
      players.exp
    }
  }

  }
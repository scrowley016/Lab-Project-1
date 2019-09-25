package Battle


class Party {
  var expcount1 = 0
  var expcount2 = 0
  var mathCount1 = 0
  var mathCount2 = 0

  var team1: List[Character] = List(new Character, new Character, new Character, new Character)
  var team2: List[Character] = List(new Character, new Character, new Character, new Character)


  def defeat(loser:Party): Unit ={

  }

  def liveCount1(): Int = {
    for (players <- team1) {
      if (!players.dead) {
        mathCount1 = mathCount1 + 1
      }
    }
    mathCount1
  }

  def liveCount2():Int = {
    for (players <- team2) {
      if (! players.dead){
        mathCount2 = mathCount2 + 1
      }
    }
    mathCount2
  }



  def countExpGain():Int = {
    for (players <- team1) {
      if (!players.dead) {
        expcount1 = expcount1 + players.curHP
      }
      expcount1
    }


    for (players <- team2) {
      if (!players.dead) {
        expcount2 = expcount2 +players.curHP
      }
    }
    expcount2
  }



    def upExp(): Unit = {
      for (players <- team1) {
        if (!players.dead) {
          players.curHP = expcount2 / mathCount1
        }
        players.curHP
      }
      for (players <- team2) {
        if (!players.dead) {
          players.curHP = expcount1 / mathCount2
        }
        players.curHP
      }
    }
}
package Battle

  class AttackCharacter extends Character(15,5,15,5) {
    // override var atk = 15
    // override var defense:Int=5
    // override var mAtk:Int=15
    //override var mDefense:Int=5
    //override var maxHP:Int=300
    //override var curHP: Int = 50
    //override var maxMag:Int=300
    //override var curMag:Int=50
    //override var dead:Boolean=false
    //override var level:Int=1
    // override var exp:Int=0

    override def levelUp(player1:Character):Int = {
      var pExp=player1.exp
      var bat_o=battle_options()
      while (pExp >= 100) {
        level = level + 1
        pExp = pExp - 100

        atk = atk + 5
        defense = defense + 1
        mAtk = mAtk + 5
        mDefense = mDefense + 1
        maxHP = maxHP + 10
        maxMag = maxMag + 10

      }
      level
    }


    override def takeDamage(input:Int): Int={
      curHP=curHP-input
      if (curHP<0){
        curHP=0
      }
      curHP
    }

    override def takeMagDamage(input:Int): Int= {
      curMag = curMag - input
      curMag

    }
    override def death(player1:Character):Boolean= {
      val pHP = player1.curHP
      if (pHP==0) {
        player1.dead=true
      }
      player1.dead
    }
    override def physicalAttack(player1: Character): Int ={
      player1.takeDamage(atk)
      curHP
    }

    override def magicAttack(player1:Character): Int ={
      player1.takeMagDamage(mAtk)
      curMag

    }
    override def defenseAttack(player1:Character):Int= {
      player1.defense = defense * 2
      defense
    }

    override def battle_options(): List[String] = {
      val options = List[String]("Power Punch","Roundhouse Kick","Throw a Rock","Defense Pose")
      options
    }

    def key_word_attack(player1:Character): Unit ={
      val bat_o=battle_options()
      for (item <- bat_o){
        if (item =="Power Punch"){
          physicalAttack(player1)
        }
        else if (item == "Roundhouse Kick"){
          physicalAttack(player1)
        }
        else if ( item == "Throw a Rock"){
          physicalAttack(player1)
        }
        else if (item == "Defense Pose") {
          defenseAttack(player1)
        }
      }
    }

    override def takeAction(words:String,player1:Character):Unit={
      val bat_o=battle_options()
      for (items <-bat_o){
        if (words==items){
          key_word_attack(player1)
        } else if (words != items){
          println("This Character does not have that battle options. Please try again")
        }
      }
    }

}

package Battle

class Character {
  var atk:Int=5
  var defense:Int=5
  var mAtk:Int=10
  var mDefense:Int=10
  var maxHP:Int=100
  var curHP: Int = 50
  var maxMag:Int=100
  var curMag:Int=40
  var dead:Boolean=false
  var level:Int=1
  var exp:Int=0

  def levelUp(player1:Character):Int = {
    var pExp=player1.exp
    if (pExp>=50){
      level=level+1
      pExp=pExp-50
    }
    level
  }

  def takeDamage(input:Int): Int={
    curHP=curHP-input
    if (curHP<0){
      curHP=0
    }
    curHP
  }

  def takeMagDamage(input:Int): Int= {
    curMag = curMag - input
    curMag

  }
  def living(player1:Character):Boolean={
    val pHP=player1.curHP
    if(pHP<0) {
      dead = true
    }
    dead
  }
  def physicalAttack(player1: Character): Int ={
    player1.takeDamage(atk)
    curHP
  }

  def magicAttack(player1:Character): Int ={
    player1.takeMagDamage(mAtk)
    curMag

  }

}


package Test

import org.scalatest._
import Battle._


class TestCharacter extends FunSuite {
  test("Test Character Damage HP"){
    val c1 = new Character()
    assert(c1.takeDamage(10)==40)
    assert(c1.takeDamage(50)==0)
  }
  test("Test if dead"){
    val c1 = new Character()
    c1.curHP=0
    val c2= new Character()
    c2.curHP=50

    assert(!c2.death(c2))
    assert(c1.death(c1))

  }

  test("Physical Attack"){
    val c1= new Character()
    val c2= new Character()
    assert(c1.physicalAttack(c2)==50)

  }
  test("Magic Attack"){
    val c1= new Character()
    val c2= new Character()
    assert(c1.physicalAttack(c2)==50)
  }

  test("Level Up") {
    val c1 = new Character()
    c1.exp=50
    val c2= new Character()
    c2.exp=100
    val c3= new Character()
    c3.exp=200

    assert(c1.levelUp(c1) == 1)
    assert(c2.levelUp(c2) == 2)
    assert (c3.levelUp(c3)== 3)
  }
  test("Level Up Perks") {
    val c1 = new Character()
    c1.level = 1
    assert(c1.atk == 5)
    assert(c1.defense == 5)
    assert(c1.mAtk == 10)
    assert(c1.mDefense == 10)
    assert(c1.maxHP == 100)
    assert(c1.maxMag == 100)

    val c2 = new Character()
    c2.level = 1
    c2.exp=100
    assert(c2.levelUp(c2)==2)
    assert(c2.atk == 6)
    assert(c2.defense == 7)
    assert(c2.mAtk == 11)
    assert(c2.mDefense == 12)
    assert(c2.maxHP == 110)
    assert(c2.maxMag == 110)
  }
}
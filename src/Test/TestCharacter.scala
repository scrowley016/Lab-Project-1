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

    assert(!c2.living(c2))
    assert(c1.living(c1))

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
    c1.curHP=200
    val c2= new Character()
    c2.curHP=50
    assert(c1.levelUp(c1) == 5)
    assert(c1.levelUp(c1) == 2)
  }

}
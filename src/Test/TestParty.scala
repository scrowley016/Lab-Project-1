package Test
import org.scalatest._
import Battle._

class TestParty extends FunSuite{
  test("Test amount alive in party") {

    var p1 = new Party()
    var p2 = new Party()
    assert(p1.aliveCount() == 4)
    assert(p2.aliveCount() == 4)

  }

  test("Test total amount of experiance") {
    val p1 = new Party()
    val p2 = new Party()
    assert(p1.countExpGain(p2)==44)
    assert(p2.countExpGain(p1)==44)
    assert(p1.countExpGain(p1)==88)
    assert(p1.countExpGain(p1)==132)

  }


  test("Test Player Current HP") {

    var c1= new Character()
    assert(c1.curHP==50)
    var c2= new Character()
    assert(c2.curHP==50)

    assert(c1.physicalAttack(c2)==50)
    assert(c2.curHP==45)

  }

}

package Test
import org.scalatest._
import Battle._

class TestParty extends FunSuite{
  test("Test amount alive in each party") {
    var p1 = new Party()
    assert(p1.liveCount1() == 4)
    assert(p1.liveCount2() == 4)

  }

  test("Test total amount of experiance") {
    var p1 = new Party()
    assert(p1.countExpGain()==200)
    assert(p1.countExpGain()==400)
    assert(p1.countExpGain()==600)
  }

  test("Test Player Current HP") {
    var p1 = new Party()
    var c1= new Character()
    assert(c1.curHP==50)

  }

}

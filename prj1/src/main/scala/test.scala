import spinal.core._

class top extends Component {

    val a,d = UInt(8 bits)
    val e = Bool()
    val b = a.round(2)
    val c = a ## ~b ## ~e

}

object test {
  def main(args: Array[String]) {
    SpinalVerilog(new top())
  }
}

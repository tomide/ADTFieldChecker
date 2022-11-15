import com.stephenn.scalatest.circe.JsonMatchers
import io.circe.Encoder
import io.circe.syntax._
import org.scalatest.Succeeded
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

trait AssertChecker extends AnyFunSuite with JsonMatchers  {

  def compare[A](left: A, right: A)(implicit jsonSerializer: Encoder[A]): Unit = {
    if (left === right) {
      ()
    } else {
      printDiff(left, right)
    }
  }

  protected def printDiff[A](left: A, right: A)(implicit jsonSerializer: Encoder[A]): Unit = {
  val a = left.asJson.noSpaces
  val b = right.asJson.noSpaces
  a should matchJson(b) match {
    case Succeeded => ()
    case err => pprint.pprintln(err)
  }
  }



}

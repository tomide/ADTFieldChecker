import io.circe.Encoder
import io.circe.generic.extras.Configuration
import io.circe.generic.semiauto.deriveEncoder
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TestSpec extends AssertChecker  {


  case class Person(name: String)
    implicit val codecConfiguration: Configuration =
      Configuration.default.withSnakeCaseMemberNames.withDefaults
    implicit val personEncoder: Encoder[Person] = deriveEncoder


  compare(Person("tom"), Person("json"))

}

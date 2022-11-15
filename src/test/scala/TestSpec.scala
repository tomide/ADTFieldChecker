import io.circe.Encoder
import io.circe.generic.extras.Configuration
import io.circe.generic.semiauto.deriveEncoder

class TestSpec extends AssertChecker  {


  case class PersonAddress(streetNumber: Long, streetName: String)
  case class Person(name: String, address: PersonAddress)
    implicit val codecConfiguration: Configuration =
      Configuration.default.withSnakeCaseMemberNames.withDefaults
    implicit val personEncoder: Encoder[Person] = deriveEncoder
    implicit val personAddressEncoder: Encoder[PersonAddress] = deriveEncoder

  compare(Person("tom", PersonAddress(100L, "tubi")),
    Person("tom", PersonAddress(10L, "tubi")))

}

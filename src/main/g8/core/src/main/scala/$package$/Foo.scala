package $package$

sealed trait Foo extends Product with Serializable

object Foo {
  case class FooInt(i: Int) extends Foo
  case class FooString(s: String) extends Foo
}
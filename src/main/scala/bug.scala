package bug

class Foo[A](val a: Long)

object Bar {
  // Traceback in the README.md
  new Foo(5L).bogus[(Long, Long)]

  // [error] /private/tmp/bug/src/main/scala/bug.scala:10:16: value bogus is not a member of bug.Foo[A]
  // [error]   new Foo(???).bogus[Long]
  // [error]                ^
  // [error] one error found
  //
  // new Foo(???).bogus[Long] // Gives an appropriate error message
}

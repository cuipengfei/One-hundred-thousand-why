package tryinnerclass

class TryUsingAnonymousClassInScala {
  def useMyInterface {
    Int number = 5

    var myInterface = new MyInterface {
      def doSomething() {
        number = 6
        println(number)
      }
    }
    myInterface.doSomething()

    print(number)
  }
}

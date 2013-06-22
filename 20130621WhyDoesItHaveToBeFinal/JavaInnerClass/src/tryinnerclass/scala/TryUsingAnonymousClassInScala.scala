package tryinnerclass.scala

import tryinnerclass.MyInterface

class TryUsingAnonymousClassInScala {
  def useMyInterface {
    var number = 123
    println(number)

    var myInterface = new MyInterface {
      def doSomething() {
        number = 456
        println(number)
      }
    }
    myInterface.doSomething()

    println(number)
  }

  def tryAccessingLocalVariable {
    var number = 123
    println(number)

    var lambda = () => {
      number = 456
      println(number)
    }

    lambda.apply()
    println(number)
  }
}

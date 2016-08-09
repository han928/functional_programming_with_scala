package week2

object rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	val x = new Rational(1, 3)                //> x  : week2.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.sub(y).sub(z)                                 //> res2: week2.Rational = -79/42
  y.add(y)                                        //> res3: week2.Rational = 10/7
  
  
}

class Rational(x:Int, y:Int){
	require(y != 0, "denominator must not be zero")  //require is a pre-defined function to check contition and through message string

	private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b) //private for the class Rational
	private def g = gcd(x, y)

	def numer = x
	def denom = y

	def less(that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this.less(that)) that else this // this is similar to self ( "this" object)
	
	def add(that:Rational) =
		new Rational(
		numer * that.denom + that.numer*denom, denom*that.denom)
	
	def sub(that:Rational) = add(that.neg)
	
	override def toString = numer/g + "/" + denom/g
	
	def neg =
		new Rational( -numer, denom)
	
}
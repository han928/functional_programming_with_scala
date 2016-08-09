package week2

object rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
	val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(18); val res$2 = 
  x.sub(y).sub(z);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(11); val res$3 = 
  y.add(y);System.out.println("""res3: week2.Rational = """ + $show(res$3))}
  
  
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

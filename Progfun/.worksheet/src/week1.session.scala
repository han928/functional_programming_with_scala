package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 

	def abs(x: Double) = if (x<0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(125); 

	def sqrtIter(guess: Double, x: Double): Double =
		if (isGoodEnough(guess, x)) guess
		else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(81); 
		
	def isGoodEnough(guess: Double, x: Double) =
		abs(guess*guess - x)/x < 1E-5;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(63); 
	
	def improve(guess: Double, x: Double) =
		(guess+x/guess)/2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(42); 
	
	def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 
		
	sqrt(4);System.out.println("""res0: Double = """ + $show(res$0))}
}

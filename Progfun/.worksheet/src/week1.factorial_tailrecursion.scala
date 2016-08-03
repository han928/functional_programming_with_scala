package week1

object factorial_tailrecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(186); 

  def factorial(x: Int): Int = {
		def loop(acc:Int, x:Int) : Int =
			if (x==0) acc
			else loop(acc*x, x-1)
		
		
		loop(1, x)
	
	
	
	};System.out.println("""factorial: (x: Int)Int""");$skip(16); val res$0 = 
	
	factorial(4);System.out.println("""res0: Int = """ + $show(res$0))}
	
	
}

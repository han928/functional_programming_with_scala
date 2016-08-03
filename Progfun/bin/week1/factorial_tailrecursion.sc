package week1

object factorial_tailrecursion {

  def factorial(x: Int): Int = {
		def loop(acc:Int, x:Int) : Int = 
			if (x==0) acc
			else loop(acc*x, x-1)	
		
		
		loop(1, x)
	
	
	
	}
	
	factorial(4)
	
	
}
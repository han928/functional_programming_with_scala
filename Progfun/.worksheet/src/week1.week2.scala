package week1

object week2-t {
  println("Welcome to the Scala worksheet")
  
  
  def sum(f: Int => Int)(a:Int, b:Int): Int = {
  	def loop(a:Int, acc:Int):Int = {
  		if (a >b ) acc
  		else loop(a+1, acc+ f(a))
  		
  	}
  
  
  
 }
 
	def product(f: Int => Int)(a:Int, b:Int) : Int = {
		if (a > b) 1
		else f(a)*product(f)(a+1, b)
 	}

	def fact(n:Int): Int = product(x => x)(1, n)
 	// general function for sum and product => equivalent to a mapReduce function
 	
 	def mapReduce(func: Int => Int, combine: (Int, Int) => Int, unit:Int)(a:Int, b:Int): Int = {
 		if (a > b) unit
 		else combine(f(a), mapReduce(f, combine, unit )(a+1,b))
 	}
 
 	
}

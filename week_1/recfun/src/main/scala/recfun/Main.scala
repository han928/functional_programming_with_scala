package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
        if (c == 0 || c == r) 1
        else pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def check_balance(chars : List[Char], left: Int): Boolean = {
        if (chars.isEmpty) left == 0
        else if (chars.head == '(') check_balance(chars.tail, left+1)
        else if (chars.head == ')') left > 0  && check_balance(chars.tail, left-1)
        else check_balance(chars.tail, left)
      }

      check_balance(chars, 0)
    }


  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {


      def count(money_left: Int, cnt: Int, coins: List[Int]): Int = {
        if (money_left == 0) 1
        else if (money_left < coins.min) 0
        else
          for {c <- coins if c <= money_left}
            yield cnt + count(money_left - c, cnt, coins.filter((coin: Int) => coin <= money_left))
      }
      count(money,0, coins)
    }



}

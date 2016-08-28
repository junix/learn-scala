package pe

object P009 {

  def solve = {
    for {i <- 1 to 1000
         j <- i to (1000 - i)
         k = 1000 - i - j
         if k > j
         if i * i + j * j == k * k
    }
      yield i * j * k
  }

  def solve2 = {
    val ps = for {i <- 1 to 1000
                  j <- i to (1000 - i)
                  k <- j to (1000 - i - j)
    } yield (i, j, k)
    ps.filter {case (a,b,c) => (a+b+c) == 1000}
  }
}

import java.util.ArrayList
object ArrayListTest{
	def main(args:Array[String])
	{

		val arr = new ArrayList[Int]
		arr.add(100)
		arr.add(200)
		arr.add(300)
		println(arr)
		for( i <- 0 to (arr.size()-1))
		{
			println(arr.get(i))
		}
	}
}


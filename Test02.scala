//swtich case ==> match case

object Test01
{
	def main(args:Array[String])
	{
		var a:String = "abc"
		var r:String = ""
		a match{
			case "tiger"=>r="호랑이"
			case "cat"=>r="고양이"
			case _=>r="알수없음"
		}
		println(r)
	}
}

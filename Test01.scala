//swtich case ==> match case

object Test01
{
	def main(args:Array[String])
	{
		var a:String = "tiger"
		a match{
			case "tiger"=>println("호랑이")
			case "cat"=>println("고양이")
			case _=>println("알수없음")
		}
	}
}

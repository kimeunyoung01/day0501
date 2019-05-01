//swtich case ==> match case

object Test01
{
	def main(args:Array[String])
	{
		var a:String = "abc"
		var r:String = ""
		r= a match{
			case "tiger"=>"호랑이"
			case "cat"=>"고양이"
			case _=>"알수없음"
		}
		println(r)
	}
}

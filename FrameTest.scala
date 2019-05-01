import javax.swing._
import java.awt.event._
import java.awt._
class MyEvent extends ActionListener
{
	def actionPerformed(e:ActionEvent):Unit={
		println("눌렀네")
	}
}
object FrameTest
{

	def main(args:Array[String])
	{
		var f = new JFrame("창만들기 연습")
		var b = new JButton("확인")
		var layout = new FlowLayout()
		f.setLayout(layout)
		f.add(b)
		var me = new MyEvent()
		b.addActionListener(me)
		f.setSize(400,300)
                f.setVisible(true)
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
	}
}

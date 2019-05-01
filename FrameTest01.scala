import javax.swing._
import java.awt.event._
import java.awt._

class MyFrame extends JFrame with ActionListener
{
	var btn = new JButton("확인")
	var input = new JTextField(10)
	var output = new JLabel("               ")
		
	add(input)
	add(btn)
	add(output)
	btn.addActionListener(this)

	def actionPerformed(e:ActionEvent):Unit=
        {
                var n = input.getText().toInt
		var r = n match{
			case 0=>"영"
			case 1=>"일"
			case 2=>"이"
			case 3=>"삼"
			case 4=>"사"
			case 5=>"오"
			case 6=>"육"
			case 7=>"칠"
			case 8=>"팔"
			case 9=>"구"
		}
		output.setText(r)
        }
}

object FrameTest01
{
	def main(args:Array[String])
	{
		var f = new MyFrame()
		var layout = new FlowLayout()
		f.setLayout(layout)
		f.setSize(400,300)
                f.setVisible(true)
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		
	}
}

package artofillusion

import org.apache.logging.log4j.scala.Logging

import javax.swing.UIManager
import scala.collection.mutable.ListBuffer

object ArtOfIllusion extends Logging with Shell {

  private val layouts: ListBuffer[Layout] = ListBuffer[Layout]()

  def main(args: Array[String]): Unit = {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName)
    } catch
      case e: Throwable => logger.error("Failed to set look and feel", e)

    
    args.foreach(arg => layouts += new Layout(arg))
    if(layouts.isEmpty) layouts += new Layout()

    shell.evaluate("print 'Hello Groovy'")
    
  }


}



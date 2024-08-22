import artofillusion.Layout
import org.apache.logging.log4j.scala.Logging

import javax.swing.{SwingUtilities, UIManager}

object App extends Logging {
  def main(args: Array[String]): Unit = {

    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName)
    } catch
      case e: Throwable => logger.error("Failed to set look and feel", e)

    args.foreach(arg => SwingUtilities.invokeLater(() => new Layout(arg)))
  }
}

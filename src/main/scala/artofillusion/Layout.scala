package artofillusion

import org.apache.logging.log4j.scala.Logging

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JFrame, JMenu, JMenuBar, JMenuItem, WindowConstants}

class Layout extends JFrame with Logging {

  initUI()
  
  
  private def initUI(): Unit = {
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
    setSize(300, 300)
    setLocationRelativeTo(null)
    setVisible(true)
    val jmb = new JMenuBar
    val file = new JMenu("File")
    file.add(new MenuAction("New", e => newAction(e)))
    file.add(new JMenuItem("Open"))
    file.add(new JMenuItem("Save"))
    file.add(new JMenuItem("Save As"))
    file.addSeparator()
    file.add(new MenuAction("Exit", e => exitAction(e)))
    jmb.add(file)

    jmb.add(new JMenu("Edit"))
    jmb.add(new JMenu("Help"))
    setJMenuBar(jmb)

  }
  
  def this(path: String) = {
    this()
    setTitle("Hello, World! " + path)
  }
  
  def newAction(event: ActionEvent): Unit = logger.info("New file")
  
  def openSceneAction(event: ActionEvent): Unit = {
    
  }

  def exitAction(event: ActionEvent): Unit = System.exit(0)

  private class MenuAction extends JMenuItem {

    def this(name: String, listener: ActionListener) = {
      this()
      setText(name)
      addActionListener(listener)
    }
  }

}



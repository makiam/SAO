package artofillusion

import org.apache.logging.log4j.scala.Logging

trait UndoableAction extends Name with Logging {

  protected var _name: String = this.getClass.getSimpleName

  protected def name: String = _name

  protected def name_=(value: String): Unit =
    _name = value


  def undo(): Unit
  def redo(): Unit
  def execute(): Unit = redo()
  
  
}

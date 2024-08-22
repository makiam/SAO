package artofillusion

import org.apache.logging.log4j.scala.Logging

import java.io.DataInputStream

class Scene extends Logging with ObjectsCollection with ImagesCollection with MaterialsCollection with TexturesCollection {

  val manager: UndoManager = new UndoManager
  private var _name: String = "Default"
  private var _time: Double = 0.0
  
  def name: String = _name
  def name_=(value: String): Unit = {
    _name = value
  }
  
  def this(path: String) = {
    this()
    load(path)
  }

  def time: Double = _time
  def time_=(value: Double): Unit = {
    _time = value
  }

  def load(path: String): Unit = {
    logger.info(s"Loading: $path")
  }

  def load(in: DataInputStream): Unit = {
    
  }
}

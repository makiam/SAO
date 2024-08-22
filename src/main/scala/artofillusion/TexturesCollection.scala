package artofillusion

import scala.collection.mutable.ListBuffer
import org.apache.logging.log4j.scala.Logging

trait TexturesCollection extends Logging {
  
  this: Scene =>
  
  private val texturesList: ListBuffer[Texture] = ListBuffer()

  def add(texture: Texture): Unit = {
    logger.info(s"Adding texture: $texture")
    texturesList += texture
  }
  
  def remove(texture: Texture): Unit = {
    
    logger.info(s"Removing texture: $texture")
    texturesList -= texture
  }

  def textures: List[Texture] = texturesList.toList  
}

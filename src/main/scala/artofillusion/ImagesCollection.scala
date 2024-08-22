package artofillusion

import scala.collection.mutable.ListBuffer

trait ImagesCollection {
  this: Scene =>

  private val imagesList: ListBuffer[Image] = ListBuffer()
  
  def images: List[Image] = imagesList.toList
}

package artofillusion

import scala.collection.mutable.ArrayBuffer

trait ImagesCollection {
  this: Scene =>

  private val imagesList: ArrayBuffer[Image] = ArrayBuffer()
  
  def images: List[Image] = imagesList.toList
}

package artofillusion

import scala.collection.mutable.ArrayBuffer

trait ObjectsCollection {
  this: Scene =>
  private val objectsList: ArrayBuffer[SObject] = ArrayBuffer()
  
  def add(sObject: SObject): Unit = {
    logger.info(s"Adding object: $sObject")
    objectsList += sObject
  }
  
  def remove(sObject: SObject): Unit = {
    logger.info(s"Removing object: $sObject")
    objectsList -= sObject
  }
  
  def objects: List[SObject] = objectsList.toList
}

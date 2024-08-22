package artofillusion

import scala.collection.mutable.ListBuffer

trait MaterialsCollection {
  this: Scene =>

  private val materialsList: ListBuffer[Material] = ListBuffer()
  
  final def materials: List[Material] = materialsList.toList

  final def add(material: Material): Unit = new AddMaterialAction(material).execute()

  final def remove(material: Material): Unit = new RemoveMaterialAction(material).execute()

  private class AddMaterialAction(source: Material) extends UndoableAction {
    private val material: Material = source
    this.name = "Add Material"
    
    override def undo(): Unit = ???

    override def redo(): Unit = {
      logger.info(s"Adding material: $material")
      materialsList += material
    }
  }
  
  private class RemoveMaterialAction(source: Material) extends UndoableAction {
    private val material: Material = source
    this.name = "Remove Material"
    
    override def undo(): Unit = ???
    
    override def redo(): Unit = {
      logger.info(s"Remove material: $material")
      materialsList -= material
    }
  }
  
}

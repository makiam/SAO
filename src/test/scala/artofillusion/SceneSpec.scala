package artofillusion

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source
class SceneSpec extends AnyFlatSpec with Matchers {

  "A Scene" should "add a texture to the scene" in {
    val scene = new Scene
    val texture = new Texture

    scene.add(texture)

    // Assuming the textures are stored in a ListBuffer, we can check its size
    scene.textures.size shouldBe 1
  }

  it should "add multiple textures to the scene" in {
    val scene = new Scene
    val texture1 = new Texture()
    val texture2 = new Texture()

    scene.add(texture1)
    scene.add(texture2)

    scene.textures.size shouldBe 2
  }

  it should "remove a texture from the scene" in {
    val scene = new Scene
    val texture = new Texture
    scene.add(texture)
    scene.remove(texture);

    scene.textures.size shouldBe 0
  }

  it should "remove multiple textures from the scene" in {
    val scene = new Scene
    val texture1 = new Texture
    val texture2 = new Texture

    scene.add(texture1)
    scene.add(texture2)

    scene.remove(texture2)
    scene.remove(texture1)

    scene.textures.size shouldBe 0
  }

  "A Scene" should "add a material to the scene" in {
    val scene = new Scene
    val material = new Material

    scene.add(material)

    // Assuming the textures are stored in a ListBuffer, we can check its size
    scene.materials.size shouldBe 1
  }

  "A Scene" should "have a default name" in {
    val scene = new Scene
    scene.name shouldBe "Default"
    

  }
}


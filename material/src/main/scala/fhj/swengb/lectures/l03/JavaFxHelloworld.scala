package fhj.swengb.lectures.l03

import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXMLLoader, Initializable}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage
import javafx.scene.image.Image

import scala.util.control.NonFatal

/**
  * A simple hello world example application<
  * for JavaFX.
  */
object JavaFxHelloworld {
  def main(args: Array[String]) {
    Application.launch(classOf[JavaFxHelloworld], args: _*)
  }
}

class JavaFxHelloworld extends javafx.application.Application {

  val Fxml = "/fhj/swengb/lectures/l03/test.fxml"
  val Css = "fhj/swengb/lectures/l03/buttonstyles.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.getIcons().add(new Image("file:icon.png"))
      stage.setTitle("Calculator")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class HelloworldController extends Initializable {

  //@FXML var displayTextField : TextField = _
  //@FXML var btn1 : Button = _
  //@FXML var btn2 : Button = _

  override def initialize(location: URL, resources: ResourceBundle): Unit = {

  }

  def clicked(): Unit = {
    println("clicked")
    //displayTextField.setText("Jo this is the text" + System.currentTimeMillis())
  }

}
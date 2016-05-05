package xmr.editor

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.effect.{DropShadow, Light, Lighting, Reflection}
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{LinearGradient, Stops}
import scalafx.scene.text.Text

/**
  * Created by zol on 2016-05-05.
  */
object Main extends JFXApp {
  stage = new PrimaryStage {
    title = "XMR Editor"
    width = 640
    height = 420
    scene = new Scene {
      fill = Black
      content = new HBox {
        children = Seq(new Text {
          text = "Xmr"
          style = "-fx-font-size: 100pt"
          fill = new LinearGradient(
            endX = 0,
            stops = Stops(PaleGreen, SeaGreen))
        }, new Text {
          text = "Editor"
          style = "-fx-font-size: 100pt"
          fill = new LinearGradient(
            endX = 0,
            stops = Stops(Cyan, CornflowerBlue))
          effect = new DropShadow {
            color = DodgerBlue
            radius = 25
            spread = 0.25
          }
        })
        effect = new Reflection {
          fraction = 0.5
          topOffset = -5.0
          bottomOpacity = 0.75
          input = new Lighting {
            light = new Light.Distant {
              elevation = 60
            }
          }
        }
      }
    }
  }
}

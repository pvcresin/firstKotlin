package firstKotlin

import processing.core.*

fun main(args:Array<String>) {
    PApplet.main("firstKotlin.MySketch")
}

class MySketch : PApplet() {
	
  override fun settings() {
    size(400, 300)
  }
	
  override fun setup() {
    background(255)
	stroke(0f, 0f, 255.0f);
  }

  override fun draw() {
    if (mousePressed){
    	line(mouseX.toFloat(), mouseY.toFloat(),
			pmouseX.toFloat(), pmouseY.toFloat())
    }
  }
}
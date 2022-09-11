package vn.edu.mc8max.flink.streaming.source

import java.nio.charset.StandardCharsets

case class SampleRecord (num: Int, content: String) {
  def toJson(): String = {
    "{\"num\":\"%d\", \"content\":\"%s\"}".format(num, content)
  }
}

object SampleRecord {
  val CONTENT_LENGTH = 2000
  val rand = scala.util.Random
  val AlphaNumeric = "0123456789abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUWXYZ".getBytes

  def apply(num: Int, content: String): SampleRecord = {
    new SampleRecord(num, content)
  }

  def random(): SampleRecord = {
    val bytes = new Array[Byte](CONTENT_LENGTH)
    for (i <- 0 until CONTENT_LENGTH) {
      bytes(i) = AlphaNumeric(rand.nextInt(AlphaNumeric.length))
    }
    new SampleRecord(rand.nextInt(), new String(bytes, StandardCharsets.US_ASCII))
  }
}

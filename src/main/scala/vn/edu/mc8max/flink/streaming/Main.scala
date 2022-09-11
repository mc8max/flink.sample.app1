package vn.edu.mc8max.flink.streaming

import org.apache.flink.streaming.api.functions.source.datagen.DataGeneratorSource
import org.apache.flink.streaming.api.scala.{StreamExecutionEnvironment, createTypeInformation}
import vn.edu.mc8max.flink.streaming.source.DummyGenerator

object Main extends App {
  val env = StreamExecutionEnvironment.getExecutionEnvironment
  env.addSource(new DataGeneratorSource(new DummyGenerator())).print("Testing")
  env.execute()
}

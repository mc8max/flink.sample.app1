package vn.edu.mc8max.flink.streaming.source

import org.apache.flink.api.common.functions.RuntimeContext
import org.apache.flink.runtime.state.FunctionInitializationContext
import org.apache.flink.streaming.api.functions.source.datagen.DataGenerator

class DummyGenerator extends DataGenerator[String] {
  var count = 0
  override def open(name: String, context: FunctionInitializationContext, runtimeContext: RuntimeContext): Unit = {
    count = 0
  }

  override def hasNext: Boolean = {
    count < 100
  }

  override def next(): String = {
    count += 1
    SampleRecord.random().toJson()
  }
}

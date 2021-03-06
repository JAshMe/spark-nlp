package com.johnsnowlabs.nlp

import org.apache.spark.sql.SparkSession

object SparkAccessor {
  val spark: SparkSession = SparkSession
    .builder()
    .appName("test")
    .master("local[1]")
    .config("spark.driver.memory", "1G")
    .config("spark.kryoserializer.buffer.max","200M")
    .config("spark.serializer","org.apache.spark.serializer.KryoSerializer")
    .getOrCreate()


  val benchmarkSpark: SparkSession = SparkSession
    .builder()
    .appName("benchmark")
    .master("local[*]")
    .config("spark.driver.memory", "6G")
    .config("spark.kryoserializer.buffer.max","200M")
    .config("spark.serializer","org.apache.spark.serializer.KryoSerializer")
    .getOrCreate()
}

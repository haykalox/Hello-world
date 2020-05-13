package com.haykel.app


object App extends App {
  val spark = org.apache.spark.sql.SparkSession.builder
    .master("local")
    .appName("Spark CSV Reader")
    .getOrCreate;

  val df = spark.read
    .format("csv")
    .option("header", "true") //first line in file has headers
    .option("mode", "DROPMALFORMED")
    .load("C:\\Users\\haykalo\\IdeaProjects\\Hello-world\\src\\main\\resources\\test.csv")

  df.show()

}
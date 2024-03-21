/////////////////////////////
/////// GROUP BY ///////////
///////////////////////////

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()


// val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/sales_info.csv")

// df.groupBy("Company").mean().show()

// df.select(sum("Sales")).show()

// df.orderBy($"Sales".desc).show()

/////////////////////////////
/////// MISSING DATA ///////
///////////////////////////

val df = spark.read.option("header", "true").option("inferSchema","true").csv("./data/contains_null.csv")

df.show()

df.na.drop(2).show()
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/CitiGroup2006_2008.txt")

df.head(5)

df.describe().show()

df.select($"Date",$"Close").show()

// for (line <- df.head(5)) {
//     println(line)
// }

/////////////////////////////
/////// FILTER /////////////
///////////////////////////
import spark.implicits._

df.filter($"Close" > 480).show() // Scala
df.filter("Close > 480").show() // SQL

df.filter($"Close" < 480 && $"High" < 480).show() // Scala
df.filter("Close < 480 AND High < 480").show() // SQL

val CH_low = df.filter("Close < 480 AND High < 480").collect()

df.filter($"High" === 484.40).show()


df.select(corr("High", "Low")).show()


/////////////////////////////
/////// TIMESTAMP //////////
///////////////////////////

df.select(month(df("Date"))).show()
df.select(year(df("Date"))).show()

val df2 = df.withColumn("Year", year(df("Date")))

val dfavgs = df2.groupBy("Year").min()

dfavgs.select($"Year", $"min(Close)").show()
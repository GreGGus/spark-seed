package main


import main.{MainClass, RunJob}

/**
  * Created by Grégoire PORTIER.
  */
class HelloWorld extends RunJob {

  private val sc = MainClass.sc
  private val spark: SparkSession = MainClass.spark
  private val PROP: PropertiesConfiguration  = MainClass.PROP


  def run():Unit={

   print("Hello word !")


  }

}

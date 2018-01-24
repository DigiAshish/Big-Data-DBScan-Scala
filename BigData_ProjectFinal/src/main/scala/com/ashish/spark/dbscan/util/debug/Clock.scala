package com.ashish.spark.dbscan.util.debug

import org.apache.spark.Logging
//import org.slf4j.LoggerFactory


private [dbscan] class Clock extends Logging {
  val startTime = System.currentTimeMillis()

  def logTimeSinceStart (): Unit = {
    logTimeSinceStart("Test")
  }

  def logTimeSinceStart (message: String) = {
    val currentTime = System.currentTimeMillis()
    val timeSinceStart = (currentTime - startTime) / 1000.0

    logInfo (s"$message took $timeSinceStart seconds")
  }
}

/*
private [dbscan] class Clock {
      val logger = LoggerFactory.getLogger(classOf[Clock]);
        val startTime = System.currentTimeMillis()
        def logTimeSinceStart(): Unit = {
          logTimeSinceStart("Test")
        }
        def logTimeSinceStart(message: String) = {
          val currentTime = System.currentTimeMillis()
          val timeSinceStart = (currentTime - startTime) / 1000.0
          logger.info(s"$message took $timeSinceStart seconds")
        }
      }
*/
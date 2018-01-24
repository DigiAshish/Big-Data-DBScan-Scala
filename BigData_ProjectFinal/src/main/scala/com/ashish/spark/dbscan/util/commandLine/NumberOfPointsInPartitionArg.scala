package com.ashish.spark.dbscan.util.commandLine

import com.ashish.spark.dbscan.spatial.rdd.PartitioningSettings


private [dbscan] trait NumberOfPointsInPartitionArg {
  var numberOfPoints: Long = PartitioningSettings.DefaultNumberOfPointsInBox
}

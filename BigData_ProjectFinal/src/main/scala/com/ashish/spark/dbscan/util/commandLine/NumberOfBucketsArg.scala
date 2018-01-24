package com.ashish.spark.dbscan.util.commandLine

import com.ashish.spark.dbscan.exploratoryAnalysis.ExploratoryAnalysisHelper

private [dbscan] trait NumberOfBucketsArg {
  var numberOfBuckets: Int = ExploratoryAnalysisHelper.DefaultNumberOfBucketsInHistogram
}

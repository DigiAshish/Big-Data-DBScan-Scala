package com.ashish.spark.dbscan.util.commandLine

import com.ashish.spark.dbscan.DbscanSettings

private [dbscan] trait EpsArg {
  var eps: Double = DbscanSettings.getDefaultEpsilon
}

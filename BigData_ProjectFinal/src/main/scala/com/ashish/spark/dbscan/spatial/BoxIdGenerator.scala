package com.ashish.spark.dbscan.spatial

import com.ashish.spark.dbscan._

private [dbscan] class BoxIdGenerator (val initialId: BoxId) {
  var nextId = initialId

  def getNextId (): BoxId = {
    nextId += 1
    nextId
  }
}

package com.ashish.spark.dbscan.spatial

import com.ashish.spark.dbscan.util.collection.SynchronizedArrayBuffer

private [dbscan] class BoxTreeItemWithPoints (b: Box,
  val points: SynchronizedArrayBuffer[Point] = new SynchronizedArrayBuffer[Point] (),
  val adjacentBoxes: SynchronizedArrayBuffer[BoxTreeItemWithPoints] = new SynchronizedArrayBuffer[BoxTreeItemWithPoints] ())
  extends BoxTreeItemBase [BoxTreeItemWithPoints] (b) {
}

package com.ashish.spark.dbscan.exploratoryAnalysis

import com.ashish.spark.dbscan.spatial.Point

private [dbscan] class PointWithDistanceToNearestNeighbor (pt: Point, d: Double = Double.MaxValue) extends  Point (pt) {
  var distanceToNearestNeighbor = d
}

package com.ashish.spark.dbscan.spatial

import com.ashish.spark.dbscan.{TempPointId, ClusterId}

/** A subclass of [[com.ashish.spark.dbscan.spatial.Point]] used during calculation of clusters within one partition
  *
  * @param p
  */
private [dbscan] class PartiallyMutablePoint (p: Point, val tempId: TempPointId) extends Point (p) {

  var transientClusterId: ClusterId = p.clusterId
  var visited: Boolean = false

  def toImmutablePoint: Point = new Point (this.coordinates, this.pointId, this.boxId, this.distanceFromOrigin,
    this.precomputedNumberOfNeighbors, this.transientClusterId)

}

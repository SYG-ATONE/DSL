package com.qf.bigdata.release.etl.release.dw

import scala.collection.mutable.ArrayBuffer

object DWReleaseClickHelper {
  def selectDWReleaseColumns():ArrayBuffer[String]={
    var columns = new ArrayBuffer[String]()
    columns.+=("release_session")
    columns.+=("release_status")
    columns.+=("device_num ")
    columns.+=("device_type")
    columns.+=("sources  ")
    columns.+=("channels  ")
    columns.+=("ct")
    columns.+=("bdp_day")

  }
}

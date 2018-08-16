name := "Thrift"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.3"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.0"

import com.github.bigtoast.sbtthrift.ThriftPlugin
seq(ThriftPlugin.thriftSettings: _*)
package io.github.portfoligno.scala.path.relative

import java.nio.file.Path

case class RelativePath private[relative] (toPath: Path)

object RelativePath {
  def fromPath(path: Path): Option[RelativePath] =
    if (path.isAbsolute) None else Some(RelativePath(path))
}

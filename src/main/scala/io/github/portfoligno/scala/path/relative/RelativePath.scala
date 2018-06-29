package io.github.portfoligno.scala.path.relative

import java.nio.file.Path

sealed trait RelativePath {
  def toPath: Path
}

object RelativePath {
  import io.github.portfoligno.scala.path._
  private case class RelativePath(toPath: Path) extends relative.RelativePath

  def fromPath(path: Path): Option[relative.RelativePath] =
    if (path.isAbsolute) None else Some(RelativePath(path))
}

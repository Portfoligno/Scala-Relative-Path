package io.github.portfoligno.scala.path.relative

import java.nio.file.Path

sealed trait RelativePath {
  def toPath: Path

  def resolve(other: RelativePath): RelativePath
}

object RelativePath {
  import io.github.portfoligno.scala.path._
  import syntax._

  private case class RelativePath(toPath: Path) extends relative.RelativePath {
    override
    def resolve(other: relative.RelativePath): relative.RelativePath =
      RelativePath(toPath.resolve(other))

    override
    def toString: String = toPath.toString
  }

  def fromPath(path: Path): Option[relative.RelativePath] =
    if (path.isAbsolute) None else Some(RelativePath(path))
}

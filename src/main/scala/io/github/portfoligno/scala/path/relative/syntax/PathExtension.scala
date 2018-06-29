package io.github.portfoligno.scala.path.relative.syntax

import java.nio.file.Path

import io.github.portfoligno.scala.path.relative.RelativePath

class PathExtension(val path: Path) extends AnyVal {
  def resolve(other: RelativePath): Path = path.resolve(other.toPath)
}

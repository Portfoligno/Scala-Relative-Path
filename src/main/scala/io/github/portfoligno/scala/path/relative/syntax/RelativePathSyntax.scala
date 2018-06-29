package io.github.portfoligno.scala.path.relative.syntax

//noinspection TypeAnnotation
trait RelativePathSyntax {
  implicit val toRichPath = new PathExtension(_)
}

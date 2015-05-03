def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines.toList

val filesHere = new java.io.File("/home/arehus/git/programmingInScala").listFiles

def grep(pattern: String) =
  for {
    f <- filesHere
    if !f.isHidden
    if f.isDirectory
    scalaFile <- f.listFiles()
    if scalaFile.getName.endsWith(".scala")
    line <- fileLines(scalaFile)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } yield {
    "file " + scalaFile + ": "+ trimmed
  }

val result = grep(".*gcd.*")

for (l <- result) println(l)

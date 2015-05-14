import java.nio.file.Paths

def filenamesEnding(query: String) = namesMatching(_.endsWith(query))

def filenamesStarting(query: String) = namesMatching(_.startsWith(query))

def filenamesContaining(query: String) = filnames filter (_.contains(query))


private def filnames() = Paths.get("/home/arehus").toFile.list

private def namesMatching(matcher: String => Boolean) = {
  for (name <- filnames()
       if matcher(name)
  ) yield name
}

println("start: " + filenamesStarting("D").mkString(", "))
println("end: " + filenamesEnding("s").mkString(", "))
println("contains: " + filenamesEnding("a").mkString(", "))
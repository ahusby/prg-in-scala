import scala.io.Source

if (args.length != 1)
  Console.err.println("Please enter one filename.")
else {
  val filename = args(0)
  val lines = Source.fromFile(filename).getLines().toList
  val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
  val maxWidthOfLength = widthOfLength(longestLine)
//  lines.foreach(print(maxWidthOfLength, _))
  for (line <- lines) {
    print(maxWidthOfLength, line)
  }
}

def widthOfLength(s: String) = s.length.toString.length

def print(maxWidthOfLength: Int, line: String) = {
  val padding = " " * (maxWidthOfLength - widthOfLength(line))
  println(padding + line.length + " | " + line)
}

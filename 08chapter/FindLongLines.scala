object FindLongLines extends App {
  require(args.length > 1)
  val width = args(0).toInt
  for (filename <- args.drop(1))
    LongLines.processFile(filename, width)
}
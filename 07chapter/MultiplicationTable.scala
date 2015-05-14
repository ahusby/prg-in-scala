type Row = Seq[Int]
type Table = Seq[Row]
val table: Table = for (rowNum <- 1 to 10) yield row(rowNum)

def row(rowNum: Int): Row = for (colNum <- 1 to 10) yield (rowNum * colNum)

def formattedRow(row: Row): String = {
  val r = for (i <- row) yield " " * (4 - i.toString.length) + i
  r.mkString
}

val formattedTable: String = {
  val formattedRows = for (row <- table) yield formattedRow(row)
  formattedRows.mkString("\n")
}

println(formattedTable)


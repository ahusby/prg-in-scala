import java.io.{File, PrintWriter}
import java.time.Instant

def freshFile = new File("/home/arehus/slettMeg/" + Instant.now() + ".txt")

val printThreeTimes = (pw: PrintWriter) => {
  val instant = Instant.now()
  pw.println(instant)
  pw.println(instant)
  pw.println(instant)
}

def printwriterLoan(f: File, op: PrintWriter => Unit) {
  val pw = new PrintWriter(f)
  try {
    op(pw)
    println("2 args: Wrote to file " + f.getAbsolutePath)
  } finally {
    pw.close()
  }
}

printwriterLoan(freshFile, printThreeTimes)


def printwriterLoanCurried(f: File)(op: PrintWriter => Unit) = {
  val pw = new PrintWriter(f)
  try {
    op(pw)
    println("Curried: Wrote to file " + f.getAbsolutePath)
  }
  finally {
    pw.close()
  }
}

printwriterLoanCurried(freshFile)(printThreeTimes)

printwriterLoanCurried(freshFile) {
  pw =>
    pw.print("abc")
    pw.print(" def")
}
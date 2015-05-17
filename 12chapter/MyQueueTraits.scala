import scala.collection.mutable.ArrayBuffer

abstract class MyQueue {
  def put(i: Int): Unit
  def get: Int
}

class MySimpleQ extends MyQueue {
  private val buf = new ArrayBuffer[Int]
  override def put(i: Int): Unit = buf += i

  override def get: Int = buf.remove(0)
}

trait Incrementing extends MyQueue{
  abstract override def put(i: Int): Unit = super.put(i + 1)
}

trait Filtering extends MySimpleQ {
  abstract override def put(i: Int): Unit = if (i >= 0) super.put(i)
}

// I Scala Console:
//scala> val qIF = new MySimpleQ with Incrementing with Filtering
//qIF: MySimpleQ with Incrementing with Filtering = $anon$1@7a639ec5
//
//scala> val qFI = new MySimpleQ with Filtering with Incrementing
//qFI: MySimpleQ with Filtering with Incrementing = $anon$1@3adbe50f
//
// Kjør put og get for å se at rekekfølgene trait-ene appliseres på er ulik (lengst til høyre først)
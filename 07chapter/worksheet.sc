val ss = List("aa666",
  "aadfasdfasdfgagfasfsfdsdffafdasdfasedf",
  "aadfasdfasdfgagfasfsfdsdffaf777dasdfasedf666")
ss.mkString("[", ", ", "]")


def index(s: String, i: Int): Int = {
  if (s.isEmpty) -1
  else if (s.startsWith("777")) -1
  else if (s.startsWith("666")) i
  else index(s.tail, i + 1)
}

for (s <- ss) println(index(s, 0))

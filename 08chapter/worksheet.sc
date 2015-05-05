def greeting(name: String = "stranger") = {
  println("Hello, " + name)
}

greeting()
greeting("Are")


def statement(verb: String = "love", color: String = "red") = "You " + verb + " " + color

statement()
statement(color = "blue")
statement(verb = "hate")
statement("feel", "yellow")
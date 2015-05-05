def titled(title: String) = (name: String) => title + " " + name
val titledMr = titled("Mr.")
titledMr("Smith")
titledMr("Hyde")
val titledMrs = titled("Mrs.")
titledMrs("Robinson")
titledMrs("Smith")


def titled(title: String, name: String) = title + " " + name
val titledMs = titled("Ms.", (_: String))
titledMs("Piggy")
titledMs("Smith")
val titledDr = titled("Dr.", (_: String))
titledDr("Livingston")
titledDr("Jekyll")

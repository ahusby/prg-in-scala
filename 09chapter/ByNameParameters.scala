var enableMyAssert = false

def functionValueAssert(predicate: () => Boolean) = if (enableMyAssert && !predicate()) throw new AssertionError("functionValueAssert")

def eagerAssert(predicate: Boolean) = if (enableMyAssert && !predicate) throw new AssertionError("eagerAssert")

def byNameParamAssert(predicate: => Boolean) = if (enableMyAssert && !predicate) throw new AssertionError("byNameParamAssert")

functionValueAssert(() => 5 > 3)

eagerAssert(5 > 3)

byNameParamAssert(5 > 6)

println("---ok---")



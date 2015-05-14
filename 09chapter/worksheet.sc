def oldsum(x: Int, y: Int) = x + y
oldsum(1,2)


def currysum(x: Int)(y: Int) = x + y
val onePlus = currysum(1)_
onePlus(2)


def megacurry(x: Int)(y: Int)(z:Int) = x + y + z
megacurry(1)(1)(1)
val one = megacurry(1)_
val onePlusOnePlus = one(1)
onePlusOnePlus(1)

def tre(x: Int) = x + (_: Int) + (_: Int)
val en = tre(1)
val to = en(1,1)

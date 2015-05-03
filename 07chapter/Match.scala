require(args.length == 1)
val firstArg = args(0)

val friend = firstArg match {
  case "salt" => "pepper"
  case "eggs" => "bacon"
  case _ => "huh?"
}

println(firstArg + " loves " + friend)
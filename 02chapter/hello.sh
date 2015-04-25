#!/bin/sh
exec scala "$0" "$@"

!#
val name = if (args.length > 0) args(0) else "stranger"
println("Hello, " + name)

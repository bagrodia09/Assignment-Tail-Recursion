package com.knoldus.assignment

import scala.annotation.tailrec

class TailRecursion {
  @tailrec
  final def findLength[T](listIterable: Iterable[T], accumulator: Int = 0): Int = {
    if (listIterable.isEmpty) accumulator
    else findLength(listIterable.tail, accumulator + 1)
  }
}

package leetcode

object Q92ReverseLinkerListII {

  def reverseBetween(head: ListNode, m: Int, n: Int): ListNode = {
    var current = head
    var (start, last, tag) = (null: ListNode, null: ListNode, null: ListNode)

    for (i <- 1 to n if current != null) {
      val next = current.next
      if (i == m) {
        tag = last
        start = current
      }
      if (i >= m) current.next = last
      last = current
      current = next
    }

    if (tag != null) tag.next = last
    start.next = current

    if (m == 1) last else head
  }

}

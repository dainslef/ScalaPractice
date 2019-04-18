package leetcode

object Q206ReverseLinkedList {

  def reverseList(head: ListNode) = {
    var current = head
    var last: ListNode = null
    while (current != null) {
      val next = current.next
      current.next = last
      last = current
      current = next
    }
    last
  }

}

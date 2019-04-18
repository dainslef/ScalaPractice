package object leetcode {

  class ListNode(var x: Int = 0) {
    var next: ListNode = null
  }

  def numToNodes(num: Int, reverse: Boolean = false) = {
    var temp = num
    val seq = collection.mutable.ArrayBuffer[Int]()
    while (temp / 10 > 0) {
      seq += temp % 10
      temp /= 10
    }
    seq += temp % 10
    seqToNodes(seq, !reverse)
  }

  def seqToNodes(seq: Seq[Int], reverse: Boolean = false) = {
    var nextNode: ListNode = null
    val seqNew = if (!reverse) seq.reverse else seq
    for (v <- seqNew) nextNode = new ListNode(v) {
      next = nextNode
    }
    nextNode
  }

  def nodesToSeq(node: ListNode): Seq[Int] = {
    var temp = node
    val nodes = collection.mutable.ArrayBuffer[Int]()
    while (temp != null) {
      nodes += temp.x
      temp = temp.next
    }
    nodes
  }

}

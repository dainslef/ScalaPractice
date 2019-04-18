import org.scalatest._

class LeetcodeTests extends FunSuite with Matchers {

  import leetcode._

  test("Q206 Reverse Linked List") {
    import Q206ReverseLinkedList.reverseList
    reverseList(null) should equal(null)
    nodesToSeq(reverseList(numToNodes(12345))) should equal(Seq(5, 4, 3, 2, 1))
  }

  test("Q92 Reverse Linked List II") {
    import Q92ReverseLinkerListII.reverseBetween
    nodesToSeq(reverseBetween(numToNodes(123456), 2, 4)) should equal(
      Seq(1, 4, 3, 2, 5, 6)
    )
    nodesToSeq(reverseBetween(numToNodes(123456), 1, 6)) should equal(
      Seq(6, 5, 4, 3, 2, 1)
    )
    nodesToSeq(reverseBetween(numToNodes(123456), 1, 5)) should equal(
      Seq(5, 4, 3, 2, 1, 6)
    )
  }

}

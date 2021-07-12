import java.util.*


class Node(var data: Int) {
    var next: Node? = null
}

class Test1 {
   /* companion object {
        fun insert(head: Node?, data: Int): Node? {
            if (head == null)
                return Node(data)
            else if (head.next == null) {
                head.next = Node(data)
            } else {
                insert(head.next, data)
            }
            return head
        }
    }

    companion object {
        fun display(head: Node?) {
            var start = head
            while (start != null) {
                print(start.data.toString() + " ")
                start = start.next
            }
        }
    }

    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        var head: Node? = null
        var N = sc.nextInt()

        while (N-- > 0) {
            val ele = sc.nextInt()
            head = insert(head, ele)
        }
        display(head)
        sc.close()
    }*/

    //https://www.raywenderlich.com/books/data-structures-algorithms-in-kotlin/v1.0/chapters/3-linked-list
}

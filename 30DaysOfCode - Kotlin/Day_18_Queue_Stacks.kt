/*
import java.util.*

class Test() {
    var stack: Stack<Char?> = Stack<Char?>()
    var queue: Queue<Char> = LinkedList()
    fun pushCharacter(ch: Char) {
        stack.push(ch)
    }

    fun enqueueCharacter(ch: Char) {
        queue.add(ch)
    }

    fun popCharacter(): Char {
        return stack.pop() as Char
    }

    fun dequeueCharacter(): Char {
        return queue.remove() as Char
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scan = Scanner(System.`in`)
            val input = scan.nextLine()
            scan.close()

            // Convert input String to an array of characters:
            val s = input.toCharArray()

            // Create a Solution object:
            val p = Test()

            // Enqueue/Push all chars to their respective data structures:
            for (c: Char in s) {
                p.pushCharacter(c)
                p.enqueueCharacter(c)
            }

            // Pop/Dequeue the chars at the head of both data structures and compare them:
            var isPalindrome = true
            for (i in 0 until s.size / 2) {
                if (p.popCharacter() != p.dequeueCharacter()) {
                    isPalindrome = false
                    break
                }
            }

            //Finally, print whether string s is palindrome or not.
            println(
                "The word, " + input + ", is "
                        + if (!isPalindrome) "not a palindrome." else "a palindrome."
            )
        }
    }
}*/

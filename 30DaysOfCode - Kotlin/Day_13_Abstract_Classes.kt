import java.util.*

internal abstract class Book     // Constructor
    (protected var title: String, protected var author: String) {

    abstract fun display()
}

internal class MyBook     // Write your constructor here
    (title: String, author: String, price: Int) :
    Book(title, author) {

    val price = price

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }
}

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val title = scanner.nextLine()
    val author = scanner.nextLine()
    val price = scanner.nextInt()
    scanner.close()

    val book = MyBook(title, author, price)
    book.display()
}

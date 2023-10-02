package challenge.chapter09

import java.io.File

fun main() {
    val fileContents = File("myfile.txt")
        .takeIf { it.canRead() && it.canWrite() }
        ?.readText()

    val file = File("myfile.txt")
    val fileContents2 = if (file.canRead() && file.canWrite()) {
        file.readText()
    } else {
        null
    }
}
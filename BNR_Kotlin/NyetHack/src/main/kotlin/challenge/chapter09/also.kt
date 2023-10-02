package challenge.chapter09

import java.io.File

fun main() {
    var fileContents: List<String>
    File("file.txt")
        .also {
            print(it.name)
        }.also {
            fileContents = it.readLines()
        }
}
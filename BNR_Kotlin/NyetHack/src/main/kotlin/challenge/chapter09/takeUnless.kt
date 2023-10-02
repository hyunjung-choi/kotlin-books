package challenge.chapter09

import java.io.File

fun main() {
    val fileContents = File("myfile.txt").takeUnless { it.isHidden }?.readText()
}
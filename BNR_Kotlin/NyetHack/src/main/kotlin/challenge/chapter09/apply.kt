package challenge.chapter09

import java.io.File

fun main() {
    val menuFile = File("menu-file.txt").apply {
        setReadable(true) // 암시적으로 menuFile.setReadable(true)가 된다.
        setWritable(true) // 암시적으로 menuFile.setWritable(true)가 된다.
        setExecutable(false) // 암시적으로 menuFile.setExecutable(false)가 된다.
    }
}
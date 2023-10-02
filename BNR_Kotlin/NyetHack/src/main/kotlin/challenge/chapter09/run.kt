package challenge.chapter09

import java.io.File

fun main() {
//    val menuFile = File("menu-file.txt")
//    val servesDragonsBreath = menuFile.run {
//        readText().contains("Dragon's Breath")
//    }
//
//    "Madrigal".run(::nameIsLong) // False가 반환
//    "Polarcubis, Supreme Master of NyetHack".run(::nameIsLong) // True가 반환

    "Polarcubis, Supreme Master of NyetHack"
        .run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)

    println(playerCreateMessage(nameIsLong("Polarcubis, Supreme Master of NyetHack")))
}

fun nameIsLong(name: String) = name.length >= 20

fun playerCreateMessage(nameTooLong: Boolean): String {
    return if (nameTooLong) {
        "Name is too long. Please choose another name."
    } else {
        "Welcome, adventurer!"
    }
}
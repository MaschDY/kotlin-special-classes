package br.com.maschdy.kotlinspecialclasses.utils

fun String.toLetterList(): List<String> {
    return this.map { it.toString() }
}

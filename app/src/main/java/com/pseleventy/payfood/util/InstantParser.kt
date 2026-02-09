package com.pseleventy.payfood.util

import kotlin.time.Instant

fun String.parseToInstant(): Instant {
    val parsedString = this.substring(0, this.indexOf(" ")) + "T" + this.substring(this.indexOf(" ") + 1, this.length) + "Z"

    return Instant.parse(parsedString)
}
package taboolib.common5.util

import java.nio.charset.StandardCharsets
import java.util.*

fun ByteArray.encodeBase64(): String {
    return Base64.getEncoder().encode(this).toString(StandardCharsets.UTF_8)
}

fun String.decodeBase64(): ByteArray {
    return Base64.getDecoder().decode(this)
}
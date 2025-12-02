package jonas.free.arcraidersresources

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package sz.sapphirex.meowclopedia.data.enums

enum class Size(val sizeValue: String) {
    SMALLEST("Smallest"),
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    LARGEST("Largest"),

    //Will fix later
    SMALLEST_TO_SMALL("Smallest to Small"),
    SMALLEST_TO_MEDIUM("Smallest to Medium"),
    SMALLEST_TO_LARGE("Smallest to Large"),
    SMALLEST_TO_LARGEST("Smallest to Largest"),

    SMALL_TO_MEDIUM("Small to Medium"),
    SMALL_TO_LARGE("Small to Large"),
    SMALL_TO_LARGEST("Small to Largest"),

    MEDIUM_TO_LARGE("Medium to Large"),
    MEDIUM_TO_LARGEST("Medium to Largest"),

    LARGE_TO_LARGEST("Large to Largest")
}
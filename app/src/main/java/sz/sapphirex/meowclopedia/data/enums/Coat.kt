package sz.sapphirex.meowclopedia.data.enums

enum class Coat(val coatValue: String) {
    HAIRLESS("Hairless"),
    SHORT_HAIR("Short Hair"),
    MEDIUM_HAIR("Medium Hair"),
    LONG_HAIR("Long Hair"),

    SHORT("Short"),
    LONG("Long"),
    DENSE("Dense"),
    HARD("Hard"),
    LUSTROUS("Lustrous"),

    FINE("Fine"),
    BALD("Bald"),
    SUEDE("Suede-like"),
    MEDIUM_SHORT("Medium-short"),

    SOFT("Soft"),

    SHORT_TO_MEDIUM("Short to Medium"),
    GLOSSY("Glossy"),
    SMOOTH("Smooth"),
    SLEEK("Sleek"),
    STRAIGHT("Straight"),
    LIGHT_UNDERCOAT("Light Undercoat"),


    SEMI_LONG("Semi-long"),
    SILKY("Silky"),
    PLUSH("Plush"),
    SILKY_AND_VERY_DENSE("Silky and Very dense"),
    PARTIALLY_HAIRLESS("Partially Hairless"),

    EXTREMELY_SOFT("Extremely Soft"),
    CURLY("Curly");


    fun getValue(): String {
        return coatValue
    }
}
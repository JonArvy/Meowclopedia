package sz.sapphirex.meowclopedia.data.models

import sz.sapphirex.meowclopedia.data.enums.Coat
import sz.sapphirex.meowclopedia.data.enums.Origin
import sz.sapphirex.meowclopedia.data.enums.Size
import sz.sapphirex.meowclopedia.data.enums.Color

data class Cat(
    val id: Int = 0,
    val images: CatImages = CatImages(catImages = emptyList()),
    val name: String = "",
    val origin: Origin = Origin.UNITED_KINGDOM,
    val size: Size = Size.MEDIUM,
    val coat: List<Coat> = emptyList(),
    val lifeSpan: String = "15-17 years",
    val weight: String = "",
    val color: List<Color> = emptyList(),
    val description: String = ""
)
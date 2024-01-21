package sz.sapphirex.meowclopedia.data

import sz.sapphirex.meowclopedia.data.models.Cat
import sz.sapphirex.meowclopedia.data.models.CatTrivia

class DataHandler {
    fun fetchCatsData(): DataResult<List<Cat>> {
        return DataResult.Success(catData)
    }
    fun fetchCatsTriviaData(): DataResult<List<CatTrivia>> {
        return DataResult.Success(catTrivia)
    }


}
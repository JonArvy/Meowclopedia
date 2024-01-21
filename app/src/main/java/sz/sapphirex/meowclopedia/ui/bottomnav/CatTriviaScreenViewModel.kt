package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sz.sapphirex.meowclopedia.data.DataHandler
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.CatTrivia

class CatTriviaScreenViewModel: ViewModel() {
    private val dataHandler = DataHandler()

    private val _catTriviaResult = mutableStateOf<DataResult<List<CatTrivia>>>(DataResult.Loading)
    val catTriviaResult: State<DataResult<List<CatTrivia>>> = _catTriviaResult


    fun fetchCats() {
//        viewModelScope.launch(Dispatchers.IO) {
            val result = dataHandler.fetchCatsTriviaData()
            _catTriviaResult.value = result
//        }
    }

}
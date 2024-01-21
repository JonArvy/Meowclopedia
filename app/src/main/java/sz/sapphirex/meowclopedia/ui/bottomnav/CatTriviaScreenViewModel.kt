package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.CatTrivia
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CatTriviaScreenViewModel: ViewModel() {
    private val firebaseDataHandler = FirebaseDataHandler()

    private val _catTriviaResult = mutableStateOf<DataResult<List<CatTrivia>>>(DataResult.Loading)
    val catTriviaResult: State<DataResult<List<CatTrivia>>> = _catTriviaResult

    init {
        fetchCats()
    }

    private fun fetchCats() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = firebaseDataHandler.fetchCatsTriviaData()
            _catTriviaResult.value = result
        }
    }

}
package sz.sapphirex.meowclopedia

import androidx.lifecycle.ViewModel

class MeowclopediaAppViewModel: ViewModel() {
    private val firebaseDataHandler = FirebaseDataHandler()

    private val _meowclopediaResult = mutableStateOf<DataResult<Pair<Meowclopedia, Images>>>(DataResult.Loading)
    val meowclopediaResult: State<DataResult<Pair<Meowclopedia, Images>>> = _meowclopediaResult

    init {
        fetchState()
    }

    private fun fetchState() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = firebaseDataHandler.fetchMeowclopediaState()
            _meowclopediaResult.value = result
        }
    }
}
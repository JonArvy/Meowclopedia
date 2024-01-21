package sz.sapphirex.meowclopedia

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.Images
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import sz.sapphirex.meowclopedia.data.DataHandler

class MeowclopediaAppViewModel: ViewModel() {
    private val firebaseDataHandler = DataHandler()

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
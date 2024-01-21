package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.Cat
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DexScreenViewModel: ViewModel() {
    private val firebaseDataHandler = FirebaseDataHandler()

    private val _catResult = mutableStateOf<DataResult<List<Cat>>>(DataResult.Loading)
    val catResult: State<DataResult<List<Cat>>> = _catResult

    init {
        fetchCats()
    }

    private fun fetchCats() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = firebaseDataHandler.fetchCatsData()
            _catResult.value = result
        }
    }
}
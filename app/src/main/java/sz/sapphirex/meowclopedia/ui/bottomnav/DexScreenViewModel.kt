package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sz.sapphirex.meowclopedia.data.DataHandler
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.Cat

class DexScreenViewModel: ViewModel() {
    private val dataHandler = DataHandler()

    private val _catResult = mutableStateOf<DataResult<List<Cat>>>(DataResult.Loading)
    val catResult: State<DataResult<List<Cat>>> = _catResult


    fun fetchCats() {
//        viewModelScope.launch(Dispatchers.IO) {
            val result = dataHandler.fetchCatsData()
            _catResult.value = result
//        }
    }
}
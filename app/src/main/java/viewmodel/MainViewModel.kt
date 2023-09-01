package viewmodel
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun compareStrings(str1: String, str2: String): String {
        return if (str1 == str2) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}
package sz.sapphirex.meowclopedia.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private const val USER_PREFERENCES_NAME = "user_preferences"
private const val DEFAULT_KEY = "default"
private const val THEME_KEY = "theme"
private const val COLOR_SCHEME_KEY = "color_scheme"

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_PREFERENCES_NAME)

suspend fun setDefaults(context: Context) {
    observeDefaultChanges(context).collect { default ->
        if (default != 10) {
            val defaultKey = intPreferencesKey(DEFAULT_KEY)
            val themeKey = intPreferencesKey(THEME_KEY)
            context.dataStore.edit { preferences ->
                preferences[defaultKey] = 10
                preferences[themeKey] = 0
            }
        }
    }
}

fun observeDefaultChanges(context: Context): Flow<Int> {
    val dataStoreKey = intPreferencesKey(DEFAULT_KEY)
    return context.dataStore.data.map { preferences ->
        preferences[dataStoreKey] ?: 0
    }
}

suspend fun changeTheme(context: Context, theme: Int) {
    val dataStoreKey = intPreferencesKey(THEME_KEY)
    context.dataStore.edit { preferences ->
        preferences[dataStoreKey] = theme
    }
}

fun observeThemeChanges(context: Context): Flow<Int> {
    val dataStoreKey = intPreferencesKey(THEME_KEY)
    return context.dataStore.data.map { preferences ->
        preferences[dataStoreKey] ?: 0
    }
}

suspend fun changeColorScheme(context: Context, colorScheme: Int) {
    val dataStoreKey = intPreferencesKey(COLOR_SCHEME_KEY)
    context.dataStore.edit { preferences ->
        preferences[dataStoreKey] = colorScheme
    }
}

fun observeColorSchemeChanges(context: Context): Flow<Int> {
    val dataStoreKey = intPreferencesKey(COLOR_SCHEME_KEY)
    return context.dataStore.data.map { preferences ->
        preferences[dataStoreKey] ?: 0
    }
}
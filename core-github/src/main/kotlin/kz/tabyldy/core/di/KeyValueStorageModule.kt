package kz.tabyldy.core.di

import android.content.Context
import android.content.SharedPreferences
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kz.tabyldy.core.storage.KeyValueStorageImpl



import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object KeyValueStorageModule {

    @Provides
    @Singleton
    fun providesSharedPreferencesSettings( @ApplicationContext context:Context): Settings {
        val sharedPreferencesSettings: SharedPreferences =
            context.getSharedPreferences(
                "github-app",
                Context.MODE_PRIVATE
            )
        return SharedPreferencesSettings(sharedPreferencesSettings,true)
    }
    @Provides
    @Singleton
    fun provideKeyValueStorage(settings: Settings): KeyValueStorageImpl {
        return KeyValueStorageImpl(settings)
    }
}
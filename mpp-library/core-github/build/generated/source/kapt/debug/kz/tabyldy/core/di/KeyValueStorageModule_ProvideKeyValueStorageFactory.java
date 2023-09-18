package kz.tabyldy.core.di;

import com.russhwolf.settings.Settings;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.storage.KeyValueStorage;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class KeyValueStorageModule_ProvideKeyValueStorageFactory implements Factory<KeyValueStorage> {
  private final Provider<Settings> settingsProvider;

  public KeyValueStorageModule_ProvideKeyValueStorageFactory(Provider<Settings> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  @Override
  public KeyValueStorage get() {
    return provideKeyValueStorage(settingsProvider.get());
  }

  public static KeyValueStorageModule_ProvideKeyValueStorageFactory create(
      Provider<Settings> settingsProvider) {
    return new KeyValueStorageModule_ProvideKeyValueStorageFactory(settingsProvider);
  }

  public static KeyValueStorage provideKeyValueStorage(Settings settings) {
    return Preconditions.checkNotNullFromProvides(KeyValueStorageModule.INSTANCE.provideKeyValueStorage(settings));
  }
}

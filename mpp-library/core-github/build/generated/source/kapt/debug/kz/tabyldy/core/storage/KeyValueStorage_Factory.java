package kz.tabyldy.core.storage;

import com.russhwolf.settings.Settings;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class KeyValueStorage_Factory implements Factory<KeyValueStorage> {
  private final Provider<Settings> settingsProvider;

  public KeyValueStorage_Factory(Provider<Settings> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  @Override
  public KeyValueStorage get() {
    return newInstance(settingsProvider.get());
  }

  public static KeyValueStorage_Factory create(Provider<Settings> settingsProvider) {
    return new KeyValueStorage_Factory(settingsProvider);
  }

  public static KeyValueStorage newInstance(Settings settings) {
    return new KeyValueStorage(settings);
  }
}

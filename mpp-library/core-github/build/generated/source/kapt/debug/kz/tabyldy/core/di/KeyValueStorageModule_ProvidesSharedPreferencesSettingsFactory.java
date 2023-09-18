package kz.tabyldy.core.di;

import android.content.Context;
import com.russhwolf.settings.Settings;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class KeyValueStorageModule_ProvidesSharedPreferencesSettingsFactory implements Factory<Settings> {
  private final Provider<Context> contextProvider;

  public KeyValueStorageModule_ProvidesSharedPreferencesSettingsFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Settings get() {
    return providesSharedPreferencesSettings(contextProvider.get());
  }

  public static KeyValueStorageModule_ProvidesSharedPreferencesSettingsFactory create(
      Provider<Context> contextProvider) {
    return new KeyValueStorageModule_ProvidesSharedPreferencesSettingsFactory(contextProvider);
  }

  public static Settings providesSharedPreferencesSettings(Context context) {
    return Preconditions.checkNotNullFromProvides(KeyValueStorageModule.INSTANCE.providesSharedPreferencesSettings(context));
  }
}

package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.MediaType;
import retrofit2.Converter;

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
public final class RetrofitModule_ProvideConverterFactoryFactory implements Factory<Converter.Factory> {
  private final Provider<MediaType> mediaTypeProvider;

  public RetrofitModule_ProvideConverterFactoryFactory(Provider<MediaType> mediaTypeProvider) {
    this.mediaTypeProvider = mediaTypeProvider;
  }

  @Override
  public Converter.Factory get() {
    return provideConverterFactory(mediaTypeProvider.get());
  }

  public static RetrofitModule_ProvideConverterFactoryFactory create(
      Provider<MediaType> mediaTypeProvider) {
    return new RetrofitModule_ProvideConverterFactoryFactory(mediaTypeProvider);
  }

  public static Converter.Factory provideConverterFactory(MediaType mediaType) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideConverterFactory(mediaType));
  }
}

package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.MediaType;

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
public final class RetrofitModule_ProvideTypeFactory implements Factory<MediaType> {
  @Override
  public MediaType get() {
    return provideType();
  }

  public static RetrofitModule_ProvideTypeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MediaType provideType() {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideType());
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvideTypeFactory INSTANCE = new RetrofitModule_ProvideTypeFactory();
  }
}

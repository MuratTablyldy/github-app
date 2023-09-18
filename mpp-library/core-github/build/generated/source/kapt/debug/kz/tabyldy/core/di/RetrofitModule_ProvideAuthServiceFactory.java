package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.api.AuthGitHubAPI;
import retrofit2.Retrofit;

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
public final class RetrofitModule_ProvideAuthServiceFactory implements Factory<AuthGitHubAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public RetrofitModule_ProvideAuthServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AuthGitHubAPI get() {
    return provideAuthService(retrofitProvider.get());
  }

  public static RetrofitModule_ProvideAuthServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new RetrofitModule_ProvideAuthServiceFactory(retrofitProvider);
  }

  public static AuthGitHubAPI provideAuthService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideAuthService(retrofit));
  }
}

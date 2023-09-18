package kz.tabyldy.core.serializer;

import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JG\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J7\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lkz/tabyldy/core/serializer/SerializationFactory;", "Lretrofit2/Converter$Factory;", "contentType", "Lokhttp3/MediaType;", "serializer", "Lkz/tabyldy/core/serializer/Serializer;", "(Lokhttp3/MediaType;Lkz/tabyldy/core/serializer/Serializer;)V", "requestBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "type", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "", "methodAnnotations", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "responseBodyConverter", "Lokhttp3/ResponseBody;", "annotations", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "core-github_debug"})
public final class SerializationFactory extends retrofit2.Converter.Factory {
    @org.jetbrains.annotations.NotNull
    private final okhttp3.MediaType contentType = null;
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.serializer.Serializer serializer = null;
    
    public SerializationFactory(@org.jetbrains.annotations.NotNull
    okhttp3.MediaType contentType, @org.jetbrains.annotations.NotNull
    kz.tabyldy.core.serializer.Serializer serializer) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(@org.jetbrains.annotations.NotNull
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull
    java.lang.annotation.Annotation[] parameterAnnotations, @org.jetbrains.annotations.NotNull
    java.lang.annotation.Annotation[] methodAnnotations, @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(@org.jetbrains.annotations.NotNull
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}
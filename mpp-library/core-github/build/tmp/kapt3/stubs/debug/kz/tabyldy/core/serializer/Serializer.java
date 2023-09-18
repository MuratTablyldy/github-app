package kz.tabyldy.core.serializer;

import kotlinx.serialization.*;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J)\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J1\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\t0\u00182\u0006\u0010\u0019\u001a\u0002H\tH&\u00a2\u0006\u0002\u0010\u001aR\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u001e\u00a8\u0006\u001f"}, d2 = {"Lkz/tabyldy/core/serializer/Serializer;", "", "()V", "format", "Lkotlinx/serialization/SerialFormat;", "getFormat$annotations", "getFormat", "()Lkotlinx/serialization/SerialFormat;", "fromResponseBody", "T", "loader", "Lkotlinx/serialization/DeserializationStrategy;", "body", "Lokhttp3/ResponseBody;", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "type", "Ljava/lang/reflect/Type;", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "saver", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "DeserializationStrategyConverter", "FromString", "SerializationStrategyConverter", "Lkz/tabyldy/core/serializer/Serializer$FromString;", "core-github_debug"})
public abstract class Serializer {
    
    private Serializer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.serialization.SerialFormat getFormat();
    
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    @java.lang.Deprecated
    public static void getFormat$annotations() {
    }
    
    public abstract <T extends java.lang.Object>T fromResponseBody(@org.jetbrains.annotations.NotNull
    kotlinx.serialization.DeserializationStrategy<T> loader, @org.jetbrains.annotations.NotNull
    okhttp3.ResponseBody body);
    
    @org.jetbrains.annotations.NotNull
    public abstract <T extends java.lang.Object>okhttp3.RequestBody toRequestBody(@org.jetbrains.annotations.NotNull
    okhttp3.MediaType contentType, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.SerializationStrategy<? super T> saver, T value);
    
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    @org.jetbrains.annotations.NotNull
    public final kotlinx.serialization.KSerializer<java.lang.Object> serializer(@org.jetbrains.annotations.NotNull
    java.lang.reflect.Type type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lkz/tabyldy/core/serializer/Serializer$DeserializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "loader", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkz/tabyldy/core/serializer/Serializer;", "(Lkotlinx/serialization/DeserializationStrategy;Lkz/tabyldy/core/serializer/Serializer;)V", "convert", "value", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "core-github_debug"})
    public static final class DeserializationStrategyConverter<T extends java.lang.Object> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
        @org.jetbrains.annotations.NotNull
        private final kotlinx.serialization.DeserializationStrategy<T> loader = null;
        @org.jetbrains.annotations.NotNull
        private final kz.tabyldy.core.serializer.Serializer deserializer = null;
        
        public DeserializationStrategyConverter(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.DeserializationStrategy<T> loader, @org.jetbrains.annotations.NotNull
        kz.tabyldy.core.serializer.Serializer deserializer) {
            super();
        }
        
        @java.lang.Override
        public T convert(@org.jetbrains.annotations.NotNull
        okhttp3.ResponseBody value) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u00132\u0006\u0010\u0014\u001a\u0002H\bH\u0016\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lkz/tabyldy/core/serializer/Serializer$FromString;", "Lkz/tabyldy/core/serializer/Serializer;", "format", "Lkotlinx/serialization/StringFormat;", "(Lkotlinx/serialization/StringFormat;)V", "getFormat", "()Lkotlinx/serialization/StringFormat;", "fromResponseBody", "T", "loader", "Lkotlinx/serialization/DeserializationStrategy;", "body", "Lokhttp3/ResponseBody;", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "saver", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "core-github_debug"})
    public static final class FromString extends kz.tabyldy.core.serializer.Serializer {
        @org.jetbrains.annotations.NotNull
        private final kotlinx.serialization.StringFormat format = null;
        
        public FromString(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.StringFormat format) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.StringFormat getFormat() {
            return null;
        }
        
        @java.lang.Override
        @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
        public <T extends java.lang.Object>T fromResponseBody(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.DeserializationStrategy<T> loader, @org.jetbrains.annotations.NotNull
        okhttp3.ResponseBody body) {
            return null;
        }
        
        @java.lang.Override
        @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
        @org.jetbrains.annotations.NotNull
        public <T extends java.lang.Object>okhttp3.RequestBody toRequestBody(@org.jetbrains.annotations.NotNull
        okhttp3.MediaType contentType, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.SerializationStrategy<? super T> saver, T value) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lkz/tabyldy/core/serializer/Serializer$SerializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "saver", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "Lkz/tabyldy/core/serializer/Serializer;", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Lkz/tabyldy/core/serializer/Serializer;)V", "convert", "value", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "core-github_debug"})
    public static final class SerializationStrategyConverter<T extends java.lang.Object> implements retrofit2.Converter<T, okhttp3.RequestBody> {
        @org.jetbrains.annotations.NotNull
        private final okhttp3.MediaType contentType = null;
        @org.jetbrains.annotations.NotNull
        private final kotlinx.serialization.SerializationStrategy<T> saver = null;
        @org.jetbrains.annotations.NotNull
        private final kz.tabyldy.core.serializer.Serializer serializer = null;
        
        public SerializationStrategyConverter(@org.jetbrains.annotations.NotNull
        okhttp3.MediaType contentType, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.SerializationStrategy<? super T> saver, @org.jetbrains.annotations.NotNull
        kz.tabyldy.core.serializer.Serializer serializer) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public okhttp3.RequestBody convert(T value) {
            return null;
        }
    }
}
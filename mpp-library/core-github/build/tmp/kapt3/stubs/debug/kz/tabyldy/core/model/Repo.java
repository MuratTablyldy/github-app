package kz.tabyldy.core.model;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002TUB\u00b1\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018B{\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u00a2\u0006\u0002\u0010\u0019J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\u000eH\u00c6\u0003J\t\u0010F\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0099\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u00c6\u0001J\u0013\u0010I\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020\u0007H\u00d6\u0001J!\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00002\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u00c7\u0001R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b\'\u0010(R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u00103R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010 R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010#R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010:\u00a8\u0006V"}, d2 = {"Lkz/tabyldy/core/model/Repo;", "", "seen1", "", "id", "", "nodeId", "", "name", "fullName", "owner", "Lkz/tabyldy/core/model/Owner;", "description", "private", "", "fork", "languagesUrl", "language", "forksCount", "size", "topics", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkz/tabyldy/core/model/Owner;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkz/tabyldy/core/model/Owner;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getDescription$annotations", "()V", "getDescription", "()Ljava/lang/String;", "getFork$annotations", "getFork", "()Z", "getForksCount$annotations", "getForksCount", "()I", "getFullName$annotations", "getFullName", "getId$annotations", "getId", "()J", "getLanguage$annotations", "getLanguage", "getLanguagesUrl$annotations", "getLanguagesUrl", "getName$annotations", "getName", "getNodeId$annotations", "getNodeId", "getOwner$annotations", "getOwner", "()Lkz/tabyldy/core/model/Owner;", "getPrivate$annotations", "getPrivate", "getSize$annotations", "getSize", "getTopics$annotations", "getTopics", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "core-github_debug"})
public final class Repo {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nodeId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.Nullable
    private final kz.tabyldy.core.model.Owner owner = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    private final boolean fork = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String languagesUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String language = null;
    private final int forksCount = 0;
    private final int size = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.model.Repo.Companion Companion = null;
    
    public Repo(long id, @org.jetbrains.annotations.NotNull
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String fullName, @org.jetbrains.annotations.Nullable
    kz.tabyldy.core.model.Owner owner, @org.jetbrains.annotations.Nullable
    java.lang.String description, boolean p6_1990234817, boolean fork, @org.jetbrains.annotations.Nullable
    java.lang.String languagesUrl, @org.jetbrains.annotations.Nullable
    java.lang.String language, int forksCount, int size, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> topics) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "id")
    @java.lang.Deprecated
    public static void getId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNodeId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "node_id")
    @java.lang.Deprecated
    public static void getNodeId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "name")
    @java.lang.Deprecated
    public static void getName$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "full_name")
    @java.lang.Deprecated
    public static void getFullName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kz.tabyldy.core.model.Owner getOwner() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "owner")
    @java.lang.Deprecated
    public static void getOwner$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "description")
    @java.lang.Deprecated
    public static void getDescription$annotations() {
    }
    
    public final boolean getPrivate() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "private")
    @java.lang.Deprecated
    public static void getPrivate$annotations() {
    }
    
    public final boolean getFork() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "fork")
    @java.lang.Deprecated
    public static void getFork$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguagesUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "languages_url")
    @java.lang.Deprecated
    public static void getLanguagesUrl$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "language")
    @java.lang.Deprecated
    public static void getLanguage$annotations() {
    }
    
    public final int getForksCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "forks_count")
    @java.lang.Deprecated
    public static void getForksCount$annotations() {
    }
    
    public final int getSize() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "size")
    @java.lang.Deprecated
    public static void getSize$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTopics() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "topics")
    @java.lang.Deprecated
    public static void getTopics$annotations() {
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kz.tabyldy.core.model.Owner component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kz.tabyldy.core.model.Repo copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String fullName, @org.jetbrains.annotations.Nullable
    kz.tabyldy.core.model.Owner owner, @org.jetbrains.annotations.Nullable
    java.lang.String description, boolean p6_1990234817, boolean fork, @org.jetbrains.annotations.Nullable
    java.lang.String languagesUrl, @org.jetbrains.annotations.Nullable
    java.lang.String language, int forksCount, int size, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> topics) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.model.Repo self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"kz/tabyldy/core/model/Repo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkz/tabyldy/core/model/Repo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "core-github_debug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<kz.tabyldy.core.model.Repo> {
        @org.jetbrains.annotations.NotNull
        public static final kz.tabyldy.core.model.Repo.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kz.tabyldy.core.model.Repo deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        kz.tabyldy.core.model.Repo value) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lkz/tabyldy/core/model/Repo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkz/tabyldy/core/model/Repo;", "core-github_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<kz.tabyldy.core.model.Repo> serializer() {
            return null;
        }
    }
}
package kz.tabyldy.core.repository;

import kotlinx.coroutines.CoroutineDispatcher;
import kz.tabyldy.core.model.Repo;
import kz.tabyldy.core.model.RepoDetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000eH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0011J2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001f\u0010 JR\u0010!\u001a\b\u0012\u0004\u0012\u0002H\"0\u000e\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00020$2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0\'\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b(\u0010)R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lkz/tabyldy/core/repository/AppRepository;", "", "apiToken", "", "getApiToken", "()Ljava/lang/String;", "setApiToken", "(Ljava/lang/String;)V", "isValid", "", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "checkToken", "Lkotlin/Result;", "", "checkToken-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepos", "", "Lkz/tabyldy/core/model/Repo;", "getRepos-IoAF18A", "getRepository", "Lkz/tabyldy/core/model/RepoDetail;", "ownerName", "repositoryName", "getRepository-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepositoryReadme", "id", "", "getRepositoryReadme-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "T", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "invoke-0E7RQCE", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-github_debug"})
public abstract interface AppRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getApiToken();
    
    public abstract void setApiToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Boolean isValid();
    
    public abstract void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0);
}
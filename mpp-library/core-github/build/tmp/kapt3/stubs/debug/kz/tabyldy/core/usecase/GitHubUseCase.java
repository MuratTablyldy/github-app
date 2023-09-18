package kz.tabyldy.core.usecase;

import kotlinx.coroutines.CoroutineDispatcher;
import kz.tabyldy.core.model.Repo;
import kz.tabyldy.core.model.RepoDetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\f\u0010\u0006J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017JR\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0003\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\"H&\u00a2\u0006\u0002\u0010#J\u0012\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\bH&J\u0017\u0010&\u001a\u00020\u00042\b\u0010\'\u001a\u0004\u0018\u00010\"H&\u00a2\u0006\u0002\u0010(\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lkz/tabyldy/core/usecase/GitHubUseCase;", "", "checkToken", "Lkotlin/Result;", "", "checkToken-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApiToken", "", "getRepos", "", "Lkz/tabyldy/core/model/Repo;", "getRepos-IoAF18A", "getRepository", "Lkz/tabyldy/core/model/RepoDetail;", "ownerName", "repositoryName", "getRepository-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepositoryReadme", "id", "", "getRepositoryReadme-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "T", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "invoke-0E7RQCE", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValid", "", "()Ljava/lang/Boolean;", "setApiTToken", "value", "setValid", "valid", "(Ljava/lang/Boolean;)V", "core-github_debug"})
public abstract interface GitHubUseCase {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getApiToken();
    
    public abstract void setApiTToken(@org.jetbrains.annotations.Nullable
    java.lang.String value);
    
    public abstract void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean valid);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Boolean isValid();
}
package kz.tabyldy.core.usecase;

import kotlinx.coroutines.CoroutineDispatcher;
import kz.tabyldy.core.repository.AppRepository;
import kz.tabyldy.core.model.Repo;
import kz.tabyldy.core.model.RepoDetail;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000f\u0010\tJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0006\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\"\u0012\u0006\u0012\u0004\u0018\u00010\u001d0!H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0002\u0010\'J\u0012\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0016J\u0017\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lkz/tabyldy/core/usecase/GitHubInteractor;", "Lkz/tabyldy/core/usecase/GitHubUseCase;", "repository", "Lkz/tabyldy/core/repository/AppRepository;", "(Lkz/tabyldy/core/repository/AppRepository;)V", "checkToken", "Lkotlin/Result;", "", "checkToken-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApiToken", "", "getRepos", "", "Lkz/tabyldy/core/model/Repo;", "getRepos-IoAF18A", "getRepository", "Lkz/tabyldy/core/model/RepoDetail;", "ownerName", "repositoryName", "getRepository-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepositoryReadme", "id", "", "getRepositoryReadme-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "T", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "invoke-0E7RQCE", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValid", "", "()Ljava/lang/Boolean;", "setApiTToken", "value", "setValid", "valid", "(Ljava/lang/Boolean;)V", "core-github_debug"})
public final class GitHubInteractor implements kz.tabyldy.core.usecase.GitHubUseCase {
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.repository.AppRepository repository = null;
    
    @javax.inject.Inject
    public GitHubInteractor(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.repository.AppRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getApiToken() {
        return null;
    }
    
    @java.lang.Override
    public void setApiTToken(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @java.lang.Override
    public void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean valid) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean isValid() {
        return null;
    }
}
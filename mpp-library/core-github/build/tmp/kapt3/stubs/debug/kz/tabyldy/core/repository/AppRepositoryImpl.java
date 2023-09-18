package kz.tabyldy.core.repository;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kz.tabyldy.core.api.AuthGitHubAPI;
import kz.tabyldy.core.model.Repo;
import kz.tabyldy.core.model.RepoDetail;
import kz.tabyldy.core.storage.KeyValueStorage;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0014H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0017J2\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00142\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b \u0010!J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010#\u001a\u00020$H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b%\u0010&JR\u0010\'\u001a\b\u0012\u0004\u0012\u0002H(0\u0014\"\b\b\u0000\u0010(*\u00020)2\u0006\u0010*\u001a\u00020+2\u001c\u0010,\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0.\u0012\u0006\u0012\u0004\u0018\u00010)0-H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b/\u00100R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"Lkz/tabyldy/core/repository/AppRepositoryImpl;", "Lkz/tabyldy/core/repository/AppRepository;", "service", "Lkz/tabyldy/core/api/AuthGitHubAPI;", "keyValueStorage", "Lkz/tabyldy/core/storage/KeyValueStorage;", "(Lkz/tabyldy/core/api/AuthGitHubAPI;Lkz/tabyldy/core/storage/KeyValueStorage;)V", "value", "", "apiToken", "getApiToken", "()Ljava/lang/String;", "setApiToken", "(Ljava/lang/String;)V", "", "isValid", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "checkToken", "Lkotlin/Result;", "", "checkToken-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepos", "", "Lkz/tabyldy/core/model/Repo;", "getRepos-IoAF18A", "getRepository", "Lkz/tabyldy/core/model/RepoDetail;", "ownerName", "repositoryName", "getRepository-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepositoryReadme", "id", "", "getRepositoryReadme-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "T", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "invoke-0E7RQCE", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core-github_debug"})
public final class AppRepositoryImpl implements kz.tabyldy.core.repository.AppRepository {
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.api.AuthGitHubAPI service = null;
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.storage.KeyValueStorage keyValueStorage = null;
    public static final int PER_PAGE = 10;
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.repository.AppRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.api.AuthGitHubAPI service, @org.jetbrains.annotations.NotNull
    kz.tabyldy.core.storage.KeyValueStorage keyValueStorage) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean isValid() {
        return null;
    }
    
    @java.lang.Override
    public void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getApiToken() {
        return null;
    }
    
    @java.lang.Override
    public void setApiToken(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkz/tabyldy/core/repository/AppRepositoryImpl$Companion;", "", "()V", "PER_PAGE", "", "core-github_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
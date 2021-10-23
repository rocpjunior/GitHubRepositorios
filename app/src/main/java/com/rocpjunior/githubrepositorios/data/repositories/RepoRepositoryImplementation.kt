package com.rocpjunior.githubrepositorios.data.repositories

import com.rocpjunior.githubrepositorios.core.RemoteException
import com.rocpjunior.githubrepositorios.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImplementation (private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca no momento")
        }
    }
}
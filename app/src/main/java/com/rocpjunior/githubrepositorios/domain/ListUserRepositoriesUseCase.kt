package com.rocpjunior.githubrepositorios.domain

import com.rocpjunior.githubrepositorios.core.UseCase
import com.rocpjunior.githubrepositorios.data.model.Repo
import com.rocpjunior.githubrepositorios.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
package com.rocpjunior.githubrepositorios.data.repositories

import com.rocpjunior.githubrepositorios.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
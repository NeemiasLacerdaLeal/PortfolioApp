package me.dio.portfolio.repositories.data.repositories


import me.dio.portfolio.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
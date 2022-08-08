package me.dio.portfolio.repositories.domain

import me.dio.portfolio.repositories.core.UseCase
import me.dio.portfolio.repositories.data.model.Repo
import me.dio.portfolio.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
package br.com.ivodev.app.repositories.domain

import br.com.ivodev.app.repositories.core.UseCase
import br.com.ivodev.app.repositories.data.model.Repo
import br.com.ivodev.app.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
package com.example.android.architecture.blueprints.todoapp.tasks

import com.example.android.architecture.blueprints.todoapp.data.source.FakeRepository
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * A replacement for [ApplicationModule] to be used in tests. It simply provides a [FakeRepository].
 */
@InstallIn(ApplicationComponent::class)
@Module
abstract class TestAppModuleBinds {

    @Singleton
    @Binds
    abstract fun bindRepository(repo: FakeRepository): TasksRepository
}

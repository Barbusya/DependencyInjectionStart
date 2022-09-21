package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @MyApplicationScope
    @Binds
    fun bindLocalData(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @MyApplicationScope
    @Binds
    fun bindRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @MyApplicationScope
    @Binds
    fun bindTestRemoteData(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}
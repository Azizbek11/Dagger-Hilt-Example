package com.parvoz.framework.mvvm.data.repository

import com.parvoz.framework.mvvm.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}
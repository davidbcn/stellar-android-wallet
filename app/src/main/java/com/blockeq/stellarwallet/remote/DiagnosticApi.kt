package com.blockeq.stellarwallet.remote

import com.blockeq.stellarwallet.models.DiagnosticModel
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DiagnosticApi {
    @POST("diagnostic")
    fun uploadDiagnostic(@Body diagnostic: DiagnosticModel) : Call<JsonObject>
}

package com.example.focusguard.domain.`interface`

import com.example.focusguard.domain.model.FocusSession
import kotlinx.coroutines.flow.Flow

interface SessionRepository {
    fun getAllSessions(): Flow<List<FocusSession>>
    suspend fun saveSession(session: FocusSession)
    suspend fun deleteSession(id: String)
}
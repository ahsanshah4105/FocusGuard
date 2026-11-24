package com.example.focusguard.data.repository

import com.example.focusguard.domain.`interface`.SessionRepository
import com.example.focusguard.domain.model.FocusSession
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FakeSessionRepository: SessionRepository {
    private var sessions = MutableStateFlow(
        listOf(
            FocusSession(
                id = "session_001",
                title = "Android Development",
                durationMinutes = 45,
                category = "Programming",
                notes = "Studied RecyclerView and MVVM",
                completedAt = System.currentTimeMillis() - 3600000,
                isSynced = true
            ),
            FocusSession(
                id = "session_002",
                title = "Android Development",
                durationMinutes = 45,
                category = "Programming",
                notes = "Studied RecyclerView and MVVM",
                completedAt = System.currentTimeMillis() - 3600000,
                isSynced = true
            ),
            FocusSession(
                id = "session_003",
                title = "Android Development",
                durationMinutes = 45,
                category = "Programming",
                notes = "Studied RecyclerView and MVVM",
                completedAt = System.currentTimeMillis() - 3600000,
                isSynced = true
            ),
        )
    )
    override fun getAllSessions(): Flow<List<FocusSession>> {
        return sessions.asStateFlow()
    }

    override suspend fun saveSession(session: FocusSession) {
        sessions.value = sessions.value
            .filterNot { it.id == session.id } + session
    }

    override suspend fun deleteSession(id: String) {
        sessions.value = sessions.value.filterNot { it.id == id }
    }
}
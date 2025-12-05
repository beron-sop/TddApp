package com.example.tddapp

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.mock

class TextProviderTest {

    @Test
    fun titleAndSubtitleReturnEmptyStrings() {
        // Arrange
        val ctx: Context = mock()
        val tp = TextProvider(ctx)

        // Act
        val title = tp.title()
        val subtitle = tp.subtitle()

        // Assert
        assertEquals("", title)
        assertEquals("", subtitle)
    }
}

package com.example.tddapp

import com.example.tddapp.models.ItemModel
import org.junit.Test
import org.junit.Assert.assertEquals
import org.mockito.kotlin.argumentCaptor
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import java.util.*
import androidx.test.espresso.idling.CountingIdlingResource

class ItemLoaderTest {

    @Test
    fun test_load_generatesCorrectNumberOfItems() {

        // Arrange
        val callback = mock<ItemLoader.Callback>()

        val idling = CountingIdlingResource("item_loader_test")
        val timer = Timer()

        val loader = ItemLoader(timer, idling)

        // Act
        loader.load(3, callback)
        Thread.sleep(1100) // allow TimerTask to run

        // Assert
        val captor = argumentCaptor<List<ItemModel>>()
        verify(callback).onLoaded(captor.capture())

        val items = captor.firstValue
        assertEquals(3, items.size)
        assertEquals("Item #0", items[0].text)
    }
}

package task

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Tests {

    @Test
    fun testEmptyMap() {
        val map = emptyMap<UInt, String>()
        assertEquals(0, map.toList().size)
    }

    @Test
    fun testListContainsAllEntries() {
        val map = mapOf(0U to "123", 1U to "456", 7U to "789")
        val list = mutableListOf<String>()
        list.addAll(map.values)

        assertEquals(3, list.size)
        assertEquals(map[0U], list[0])
        assertEquals(map[1U], list[1])
        assertEquals(map[7U], list[2])
    }
}
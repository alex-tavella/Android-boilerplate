package br.com.alex.boilerplate.dynamicfeature2

import androidx.test.platform.app.InstrumentationRegistry
import io.kotlintest.shouldBe
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        appContext.packageName shouldBe "br.com.alex.boilerplate"
    }
}

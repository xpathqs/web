package org.xpathqs.web.executor

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.xpathqs.driver.actions.WaitAction
import org.xpathqs.driver.moke.MkExecutor
import org.xpathqs.web.WebPage
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.mock.MkWebDriver

internal class WebExecutorTest {

    private val executor = WebExecutor(
        MkWebDriver(),
        MkExecutor()
    )

    @Test
    fun actionHandlerForWaitAction() {
        assertThat(
            executor.hasActionHandler(WaitAction())
        ).isEqualTo(true)
    }

    @Test
    fun actionHandlerForOpenUrlAction() {
        assertThat(
            executor.hasActionHandler(OpenUrlAction(WebPage()))
        ).isEqualTo(true)
    }
}
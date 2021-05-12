package org.xpathqs.web.executor

import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.driver.actions.ClearAction
import org.xpathqs.driver.actions.ClickAction
import org.xpathqs.driver.actions.IAction
import org.xpathqs.driver.actions.InputAction
import org.xpathqs.driver.executor.ActionExecLambda
import org.xpathqs.driver.executor.ActionExecMap
import org.xpathqs.driver.executor.BaseExecutor
import org.xpathqs.web.Page
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.actions.SubmitAction
import org.xpathqs.web.driver.IWebDriver

abstract class WebExecutor(
    override val driver: IWebDriver) : BaseExecutor(driver) {

    private val webHandlerCache = ActionExecMap().apply {
        set(ClickAction(Selector()).name) {
            executeAction(it as ClickAction)
        }
        set(InputAction("", Selector()).name) {
            executeAction(it as InputAction)
        }
        set(OpenUrlAction(Page()).name) {
            executeAction(it as OpenUrlAction)
        }
        set(ClearAction(Selector()).name) {
            executeAction(it as ClearAction)
        }
        set(SubmitAction(Selector()).name) {
            executeAction(it as SubmitAction)
        }
    }

    override fun hasActionHandler(action: IAction): Boolean {
        if (!webHandlerCache.containsKey(action.name)) {
            return super.hasActionHandler(action)
        }
        return true
    }

    override fun getActionHandler(action: IAction): ActionExecLambda {
        return webHandlerCache[action.name]
            ?: super.getActionHandler(action)
    }

    private fun executeAction(action: ClickAction) {
        driver.click(action.on)
    }

    private fun executeAction(action: InputAction) {
        driver.input(action.on, action.text)
    }

    private fun executeAction(action: OpenUrlAction) {
        driver.open(action.page.url)
    }

    private fun executeAction(action: ClearAction) {
        driver.clear(action.on)
    }

    private fun executeAction(action: SubmitAction) {
        driver.submit(action.on)
    }
}
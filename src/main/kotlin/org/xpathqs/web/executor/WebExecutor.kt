package org.xpathqs.web.executor

import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.driver.actions.ClearAction
import org.xpathqs.driver.actions.ClickAction
import org.xpathqs.driver.actions.InputAction
import org.xpathqs.driver.executor.ActionExecMap
import org.xpathqs.driver.executor.Decorator
import org.xpathqs.driver.executor.IExecutor
import org.xpathqs.web.Page
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.actions.SubmitAction
import org.xpathqs.web.driver.IWebDriver

open class WebExecutor(
    override val driver: IWebDriver,
    origin: IExecutor
) : Decorator(origin) {

    override val actions = ActionExecMap().apply {
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

    protected open fun executeAction(action: ClickAction) {
        driver.click(action.on)
    }

    protected open fun executeAction(action: InputAction) {
        if (action.clearBeforeInput) {
            driver.clear(action.on)
        }
        driver.input(action.on, action.text)
    }

    protected open fun executeAction(action: OpenUrlAction) {
        driver.open(action.page.url)
    }

    protected open fun executeAction(action: ClearAction) {
        driver.clear(action.on)
    }

    protected open fun executeAction(action: SubmitAction) {
        driver.submit(action.on)
    }
}
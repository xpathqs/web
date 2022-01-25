package org.xpathqs.web.executor

import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.driver.actions.*
import org.xpathqs.driver.executor.ActionExecMap
import org.xpathqs.driver.executor.Decorator
import org.xpathqs.driver.executor.IExecutor
import org.xpathqs.driver.navigation.base.ILoadable
import org.xpathqs.web.WebPage
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.actions.SubmitAction
import org.xpathqs.web.driver.IWebDriver
import java.time.Duration

open class WebExecutor(
    override val driver: IWebDriver,
    origin: IExecutor
) : Decorator(origin) {

    override val actions = ActionExecMap().apply {
        set(ClickAction(Selector()).name) {
            executeAction(it as ClickAction)
        }
        set(InputFileAction("", Selector()).name) {
            executeAction(it as InputAction)
        }
        set(InputAction("", Selector()).name) {
            executeAction(it as InputAction)
        }
        set(InputFileAction("", Selector()).name) {
            executeAction(it as InputAction)
        }
        set(OpenUrlAction(WebPage()).name) {
            executeAction(it as OpenUrlAction)
        }
        set(ClearAction(Selector()).name) {
            executeAction(it as ClearAction)
        }
        set(SubmitAction(Selector()).name) {
            executeAction(it as SubmitAction)
        }
        set(SwitchTabAction().name) {
            executeAction(it as SwitchTabAction)
        }
    }

    protected open fun executeAction(action: ClickAction) {
        driver.click(action.on)
    }

    protected open fun executeAction(action: InputFileAction) {
        driver.input(action.on, action.text)
    }

    protected open fun executeAction(action: InputAction) {
        if (action.clearBeforeInput) {
            driver.clear(action.on)
        }
        driver.input(action.on, action.text)
    }

    protected open fun executeAction(action: OpenUrlAction) {
        driver.open(action.page.url)
        (action.page as? ILoadable)?.waitForLoad(Duration.ofSeconds(30))
    }

    protected open fun executeAction(action: ClearAction) {
        driver.clear(action.on)
    }

    protected open fun executeAction(action: SubmitAction) {
        driver.submit(action.on)
    }

    protected open fun executeAction(action: SwitchTabAction) {
        driver.switchTab()
    }
}
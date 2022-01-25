package org.xpathqs.web.executor

import org.xpathqs.driver.actions.IAction
import org.xpathqs.driver.executor.Decorator
import org.xpathqs.web.actions.OpenUrlAction

open class CachedWebExecutor(
    origin: Decorator
) : Decorator(origin) {
    override fun afterAction(action: IAction) {
        if(action is OpenUrlAction) {
            println("open url after action")
        }
        super.afterAction(action)
    }
}
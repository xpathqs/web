package org.xpathqs.web.extensions

import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.web.actions.ClickJsAction
import org.xpathqs.web.actions.SubmitAction
import org.xpathqs.web.constants.Global

fun <T : BaseSelector> T.clickJs(): T {
    Global.executor.execute(ClickJsAction(this))
    return this
}

fun <T : BaseSelector> T.submit(): T {
    Global.executor.execute(SubmitAction(this))
    return this
}
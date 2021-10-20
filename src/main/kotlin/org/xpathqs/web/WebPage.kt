package org.xpathqs.web

import org.xpathqs.core.selector.NullSelector
import org.xpathqs.core.selector.base.ISelector
import org.xpathqs.driver.page.Page
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.constants.Global

open class WebPage(
    base: ISelector = NullSelector(),
    title: String = "",
    open val url: String = ""
): Page(
    base = base,
    title = title
) {
    fun open() {
        Global.executor.execute(OpenUrlAction(this))
    }
}
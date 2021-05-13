package org.xpathqs.web

import org.xpathqs.core.selector.Block
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.constants.Global

open class Page(
    val title: String = "",
    val url: String = ""
) : Block() {
    fun open() {
        Global.executor.execute(OpenUrlAction(this))
    }
}
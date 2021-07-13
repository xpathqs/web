package org.xpathqs.web

import org.xpathqs.core.selector.NullSelector
import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.core.selector.base.ISelector
import org.xpathqs.core.selector.block.Block
import org.xpathqs.core.util.SelectorFactory.tagSelector
import org.xpathqs.driver.extensions.isHidden
import org.xpathqs.driver.extensions.isVisible
import org.xpathqs.driver.extensions.waitForVisible
import org.xpathqs.driver.log.Log
import org.xpathqs.web.actions.OpenUrlAction
import org.xpathqs.web.constants.Global

open class Page(
    open val title: String = "",
    open val url: String = "",
    base: ISelector = NullSelector()
) : Block(base) {

    open val pageLoadSelector: BaseSelector
        get() = tagSelector("")

    fun open() {
        Global.executor.execute(OpenUrlAction(this))
    }

    fun waitForLoad() {
        Log.action("Ожидаем Загрузки страницы") {
            if(pageLoadSelector.isHidden) {
                pageLoadSelector.waitForVisible()
            }
        }
    }
}
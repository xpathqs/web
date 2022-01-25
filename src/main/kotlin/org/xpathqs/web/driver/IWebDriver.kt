package org.xpathqs.web.driver

import org.xpathqs.core.selector.base.ISelector
import org.xpathqs.driver.core.IDriver

interface IWebDriver : IDriver {
    fun open(url: String)
    fun submit(selector: ISelector)
    fun switchTab()
}
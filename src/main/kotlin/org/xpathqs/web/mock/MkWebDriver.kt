package org.xpathqs.web.mock

import org.xpathqs.core.selector.base.ISelector
import org.xpathqs.driver.moke.MkDriver
import org.xpathqs.web.driver.IWebDriver

open class MkWebDriver : MkDriver(), IWebDriver {
    override fun open(url: String) {}
    override fun submit(selector: ISelector) {}
    override fun switchTab() {}
}
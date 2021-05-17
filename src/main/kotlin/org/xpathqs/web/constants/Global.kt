package org.xpathqs.web.constants

import org.xpathqs.core.constants.CoreGlobalProps
import org.xpathqs.driver.constants.DriverGlobalProps

open class WebGlobalCls : DriverGlobalProps() {
    fun updateAll(other: CoreGlobalProps) {
        update(other)
        org.xpathqs.core.constants.Global.update(other)
        org.xpathqs.driver.constants.Global.update(other)
    }
}

class WebCachedHtml : CoreGlobalProps(
    hashMapOf("constants.upperCase" to "true")
)

object Global : WebGlobalCls()
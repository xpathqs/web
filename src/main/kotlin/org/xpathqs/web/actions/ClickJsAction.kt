package org.xpathqs.web.actions

import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.driver.actions.ClickAction

open class ClickJsAction(on: BaseSelector): ClickAction(on)
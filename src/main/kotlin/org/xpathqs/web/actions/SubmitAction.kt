package org.xpathqs.web.actions

import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.driver.actions.SelectorInteractionAction

open class SubmitAction(on: BaseSelector): SelectorInteractionAction(on)
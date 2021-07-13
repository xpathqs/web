package org.xpathqs.web.extensions

import org.xpathqs.core.selector.args.KVSelectorArg
import org.xpathqs.core.selector.args.ValueArg
import org.xpathqs.core.selector.args.decorators.CommaDecorator
import org.xpathqs.core.selector.args.decorators.ContainsDecorator
import org.xpathqs.core.selector.args.functions.Not
import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.core.selector.extensions.core.get
import org.xpathqs.core.selector.selector.ancestor
import org.xpathqs.core.util.SelectorFactory.tagSelector
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

fun <T : BaseSelector> T.displayed(): T {
    return this [
        Not(
            ValueArg(
                tagSelector("div").ancestor()[
                    ContainsDecorator(
                        CommaDecorator(
                            KVSelectorArg("@style", "display:none")
                        )
                    )
                ]
            )
        )
    ][
        Not(
            ValueArg(
                tagSelector("div").ancestor()[
                    ContainsDecorator(
                        CommaDecorator(
                            KVSelectorArg("@style", "display: none")
                        )
                    )
                ]
            )
        )
    ]
}
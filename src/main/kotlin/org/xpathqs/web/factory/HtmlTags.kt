package org.xpathqs.web.factory

import org.xpathqs.core.selector.selector.Selector

object HtmlTags {
    val DIV: Selector
        get() = HTML.div()

    val INPUT: Selector
        get() = HTML.input()

    val BUTTON: Selector
        get() = HTML.button()

    val P: Selector
        get() = HTML.p()

    val A: Selector
        get() = HTML.a()

    val H1: Selector
        get() = HTML.h1()

    val H2: Selector
        get() = HTML.h2()

    val H3: Selector
        get() = HTML.h3()

    val SUBMIT: Selector
        get() = HTML.submit()
}
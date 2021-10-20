package org.xpathqs.web.factory

import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.core.util.SelectorFactory.tagSelector

object HtmlTags {
    val ANY: Selector
        get() = tagSelector()

    val DIV: Selector
        get() = HTML.div()

    val INPUT: Selector
        get() = HTML.input()

    val AREA: Selector
        get() = HTML.area()

    val BUTTON: Selector
        get() = HTML.button()

    val P: Selector
        get() = HTML.p()

    val LABEL: Selector
        get() = HTML.label()

    val SPAN: Selector
        get() = HTML.span()

    val UL: Selector
        get() = HTML.ul()

    val LI: Selector
        get() = HTML.li()

    val OL: Selector
        get() = HTML.ol()

    val A: Selector
        get() = HTML.a()

    val H1: Selector
        get() = HTML.h1()

    val H2: Selector
        get() = HTML.h2()

    val H3: Selector
        get() = HTML.h3()

    val H4: Selector
        get() = HTML.h4()

    val H5: Selector
        get() = HTML.h5()

    val H6: Selector
        get() = HTML.h6()

    val SUBMIT: Selector
        get() = HTML.submit()

    val TABLE: Selector
        get() = HTML.table()

    val THEAD: Selector
        get() = HTML.thead()

    val TBODY: Selector
        get() = HTML.tbody()

    val TD: Selector
        get() = HTML.td()

    val TR: Selector
        get() = HTML.tr()

    val TH: Selector
        get() = HTML.th()

    val FORM: Selector
        get() = HTML.form()

    val CHECKBOX: Selector
        get() = HTML.checkbox()

    val SUP: Selector
        get() = HTML.sup()

    val TEXTAREA: Selector
        get() = HTML.textarea()

    val SELECT: Selector
        get() = HTML.select()

    val OPTION: Selector
        get() = HTML.option()

    val HEADER: Selector
        get() = HTML.header()

    val FOOTER: Selector
        get() = HTML.footer()
}
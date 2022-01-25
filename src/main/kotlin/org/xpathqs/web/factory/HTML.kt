package org.xpathqs.web.factory

import org.xpathqs.core.selector.extensions.*
import org.xpathqs.core.selector.extensions.core.get
import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.core.selector.selector.SelectorProps
import org.xpathqs.core.selector.selector.preceding
import org.xpathqs.core.selector.selector.prefix
import org.xpathqs.core.util.SelectorFactory.tagSelector
import org.xpathqs.core.util.SelectorFactory.textContainsSelector
import org.xpathqs.core.util.SelectorFactory.textSelector
import org.xpathqs.driver.extensions.near
import org.xpathqs.driver.selector.SecretInput

object HTML {
    fun div(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""

    ) = tag(
        tag = "div",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains
    )

    fun input(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        type: String = "",

        value: String = "",
        valueContains: String = "",

        placeHolder: String = "",
        placeHolderContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "input",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        type = type,

        value = value,
        valueContains = valueContains,

        placeHolder = placeHolder,
        placeHolderContains = placeHolderContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains
    )

    fun checkbox(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "input",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,

        type = "checkbox"
    )

    fun area(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "area",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun span(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        role: String = "",
        roleContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "span",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        role = role,
        roleContains = roleContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun button(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "button",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        type = type,
        typeContains = typeContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun p(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "p",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun a(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "a",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h1(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h1",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h2(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h2",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h3(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h3",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h4(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h4",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h5(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h5",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun h6(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "h6",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun submit(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = button(
        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,

        type = "submit"
    )

    fun table(
        id: String = "",
        idContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "table",

        id = id,
        idContains = idContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun thead(
        id: String = "",
        idContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "thead",

        id = id,
        idContains = idContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,
    )

    fun tbody(
        id: String = "",
        idContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "tbody",

        id = id,
        idContains = idContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun th(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "th",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun td(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "td",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun tr(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "tr",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun form(
        id: String = "",
        idContains: String = "",

        cls: String = "",
        clsContains: String = "",

        action: String = "",
        enctype: String = "",
        method: String = "",
        name: String = "",
        target: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) : Selector {
        var res = tagSelector("form")

        if (id.isNotEmpty()) {
            res = res.id(id)
        }
        if (idContains.isNotEmpty()) {
            res = res.id(idContains, contains = true)
        }

        res = res.withArg("class", cls)
        res = res.withArgContains("class", clsContains)
        res = res.withArg("action", action)
        res = res.withArg("enctype", enctype)
        res = res.withArg("method", method)
        res = res.withArg("name", name)
        res = res.withArg("target", target)
        return res
    }

    fun label(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "label",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun ul(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "ul",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun li(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "li",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun ol(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "ol",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun sup(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "sup",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun textarea(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        type: String = "",

        value: String = "",
        valueContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "textarea",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        type = type,

        value = value,
        valueContains = valueContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun select(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "select",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun option(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        value: String = "",
        valueContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "option",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        value = value,
        valueContains = valueContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun header(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        value: String = "",
        valueContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "header",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        value = value,
        valueContains = valueContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun footer(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        value: String = "",
        valueContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = ""
    ) = tag(
        tag = "footer",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        innerText = innerText,
        innerTextContains = innerTextContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        value = value,
        valueContains = valueContains,

        nearestText = nearestText,
        nearestTextContains = nearestTextContains,
    )

    fun tag(
        tag: String = "*",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        name: String = "",
        nameContains: String = "",

        value: String = "",
        valueContains: String = "",

        role: String = "",
        roleContains: String = "",

        placeHolder: String = "",
        placeHolderContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = "",
    ): Selector {
        var res = tagSelector(tag)

        if (id.isNotEmpty()) {
            res = res.id(id)
        }
        if (idContains.isNotEmpty()) {
            res = res.id(idContains, contains = true)
        }

        if (text.isNotEmpty()) {
            res = res.text(text)
        }
        if (textContains.isNotEmpty()) {
            res = res.text(textContains, contains = true)
        }

        if (innerText.isNotEmpty()) {
            res = res[textSelector(innerText)]
        }
        if (innerTextContains.isNotEmpty()) {
            res = res[textContainsSelector(innerTextContains)]
        }

        if (title.isNotEmpty()) {
            res = res.arg("@title", title)
        }
        if (titleContains.isNotEmpty()) {
            res = res.arg("@title", titleContains, contains = true)
        }

        if (cls.isNotEmpty()) {
            res = res.arg("@class", cls)
        }
        if (clsContains.isNotEmpty()) {
            res = res.arg("@class", clsContains, contains = true)
        }

        if (type.isNotEmpty()) {
            res = res.arg("@type", type)
        }
        if (typeContains.isNotEmpty()) {
            res = res.arg("@type", typeContains, contains = true)
        }

        if (name.isNotEmpty()) {
            res = res.arg("@name", name)
        }
        if (nameContains.isNotEmpty()) {
            res = res.arg("@name", nameContains, contains = true)
        }

        if (placeHolder.isNotEmpty()) {
            res = res.arg("@placeholder", placeHolder)
        }
        if (placeHolderContains.isNotEmpty()) {
            res = res.arg("@placeholder", placeHolderContains, contains = true)
        }

        if (value.isNotEmpty()) {
            res = res.arg("@value", value)
        }
        if (valueContains.isNotEmpty()) {
            res = res.arg("@value", valueContains, contains = true)
        }

        if (role.isNotEmpty()) {
            res = res.arg("@role", role)
        }
        if (roleContains.isNotEmpty()) {
            res = res.arg("@role", roleContains, contains = true)
        }

        if(nearestText.isNotEmpty()) {
            //return res near textSelector(nearestText)
            return res contains textSelector(nearestText).preceding()
        }
        if(nearestTextContains.isNotEmpty()) {
            //return res near textContainsSelector(nearestTextContains)
            return res containsAny textContainsSelector(nearestTextContains).preceding()
        }
        return res
    }

    fun secretInput(
        tag: String = "input",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        innerText: String = "",
        innerTextContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        name: String = "",
        nameContains: String = "",

        value: String = "",
        valueContains: String = "",

        placeHolder: String = "",
        placeHolderContains: String = "",

        nearestText: String = "",
        nearestTextContains: String = "",
    ): Selector {
        var res = SecretInput(props = SelectorProps(tag = tag))

        if (id.isNotEmpty()) {
            res = res.id(id)
        }
        if (idContains.isNotEmpty()) {
            res = res.id(idContains, contains = true)
        }

        if (text.isNotEmpty()) {
            res = res.text(text)
        }
        if (textContains.isNotEmpty()) {
            res = res.text(textContains, contains = true)
        }

        if (innerText.isNotEmpty()) {
            res = res[textSelector(innerText).prefix(".//")]
        }
        if (innerTextContains.isNotEmpty()) {
            res = res[textContainsSelector(innerTextContains).prefix(".//")]
        }

        if (title.isNotEmpty()) {
            res = res.arg("@title", title)
        }
        if (titleContains.isNotEmpty()) {
            res = res.arg("@title", titleContains, contains = true)
        }

        if (cls.isNotEmpty()) {
            res = res.arg("@class", cls)
        }
        if (clsContains.isNotEmpty()) {
            res = res.arg("@class", clsContains, contains = true)
        }

        if (type.isNotEmpty()) {
            res = res.arg("@type", type)
        }
        if (typeContains.isNotEmpty()) {
            res = res.arg("@type", typeContains, contains = true)
        }

        if (name.isNotEmpty()) {
            res = res.arg("@name", name)
        }
        if (nameContains.isNotEmpty()) {
            res = res.arg("@name", nameContains, contains = true)
        }

        if (value.isNotEmpty()) {
            res = res.arg("@value", value)
        }
        if (valueContains.isNotEmpty()) {
            res = res.arg("@value", valueContains, contains = true)
        }

        if (placeHolder.isNotEmpty()) {
            res = res.arg("@placeholder", placeHolder)
        }
        if (placeHolderContains.isNotEmpty()) {
            res = res.arg("@placeholder", placeHolderContains, contains = true)
        }

        if(nearestText.isNotEmpty()) {
            //return res near textSelector(nearestText)
            return res[textSelector(nearestText).preceding()]
        }
        if(nearestTextContains.isNotEmpty()) {
            //return res near textContainsSelector(nearestTextContains)
            return res[textContainsSelector(nearestText).preceding()]
        }

        return res
    }

    private fun Selector.withArgContains(name: String, value: String): Selector {
        if(value.isNotEmpty()) {
            this.arg("@$name", value, contains = true)
        }
        return this
    }

    private fun Selector.withArg(name: String, value: String): Selector {
        if(value.isNotEmpty()) {
            this.arg("@$name", value)
        }
        return this
    }
}
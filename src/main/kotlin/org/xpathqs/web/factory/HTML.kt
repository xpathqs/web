package org.xpathqs.web.factory

import org.xpathqs.core.selector.extensions.arg
import org.xpathqs.core.selector.extensions.id
import org.xpathqs.core.selector.extensions.text
import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.core.selector.selector.SelectorProps
import org.xpathqs.core.util.SelectorFactory.tagSelector
import org.xpathqs.driver.selector.SecretInput

object HTML {
    fun div(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "div",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains
    )

    fun input(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        type: String = "",

        value: String = "",
        valueContains: String = ""
    ) = tag(
        tag = "input",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        type = type,

        value = value,
        valueContains = valueContains
    )

    fun checkbox(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "input",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        type = "checkbox"
    )

    fun area(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "area",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains
    )

    fun span(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        role: String = "",
        roleContains: String = ""
    ) = tag(
        tag = "span",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        role = role,
        roleContains = roleContains
    )

    fun button(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = ""
    ) = tag(
        tag = "button",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        type = type,
        typeContains = typeContains
    )

    fun p(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "p",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun a(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "a",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h1(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h1",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h2(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h1",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h3(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h3",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h4(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h4",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h5(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h5",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h6(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h6",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun submit(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = button(
        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        type = "submit"
    )

    fun table(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "table",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

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

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun form(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "form",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun label(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "label",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun span(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "span",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun ul(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "ul",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun li(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "li",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun ol(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "ol",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun sup(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "sup",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun textarea(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = "",

        type: String = "",

        value: String = "",
        valueContains: String = ""
    ) = tag(
        tag = "textarea",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains,

        type = type,

        value = value,
        valueContains = valueContains
    )

    fun select(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "select",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun option(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        value: String = "",
        valueContains: String = ""
    ) = tag(
        tag = "option",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        value = value,
        valueContains = valueContains
    )

    fun tag(
        tag: String = "*",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

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
        roleContains: String = ""
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

        if (role.isNotEmpty()) {
            res = res.arg("@role", role)
        }
        if (roleContains.isNotEmpty()) {
            res = res.arg("@role", roleContains, contains = true)
        }

        return res
    }

    fun secretInput(
        tag: String = "input",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        name: String = "",
        nameContains: String = "",

        value: String = "",
        valueContains: String = ""
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

        return res
    }
}
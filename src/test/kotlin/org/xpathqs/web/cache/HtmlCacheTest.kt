package org.xpathqs.web.cache

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.xpathqs.web.constants.Global
import org.xpathqs.web.constants.WebCachedHtml
import org.xpathqs.web.factory.HTML

internal class HtmlCacheTest {

    @Test
    fun update() {
        val xml = this.javaClass.classLoader.getResource("pagesource/html1.xml").readText()
        val cache = HtmlCache()
        cache.update(xml)

        Global.updateAll(WebCachedHtml())
        val xpath = HTML.div(text = "Неправильно ввёден логин или пароль.").toXpath()

        assertThat(
            cache.getElementsCount(xpath)
        ).isEqualTo(
            1
        )
    }
}
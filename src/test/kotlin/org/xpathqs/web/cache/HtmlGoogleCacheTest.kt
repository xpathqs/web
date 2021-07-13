package org.xpathqs.web.cache

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.xpathqs.core.selector.extensions.withAttributeValue
import org.xpathqs.web.constants.Global
import org.xpathqs.web.constants.WebCachedHtml
import org.xpathqs.web.factory.HTML
import org.xpathqs.web.factory.HtmlTags

internal class HtmlGoogleCacheTest {

    @Test
    fun update() {
        val xml = this.javaClass.classLoader.getResource("pagesource/www/google3.xml").readText()
        val cache = HtmlCache()
        cache.update(xml)

        Global.updateAll(WebCachedHtml())
        val xpath = "(//*[@id='search']/DIV/DIV/DIV)[position()=2]//H3"  //HtmlTags.INPUT.withAttributeValue("Search").toXpath()

        assertAll {

            assertThat(
                cache.getAttribute(xpath, "text()")
            ).isEqualTo(
                ""
            )

            assertThat(
                cache.getElementsCount(xpath)
            ).isEqualTo(
                1
            )

            assertThat(cache.isPresent(xpath))
                .isEqualTo(true)
        }


    }
}
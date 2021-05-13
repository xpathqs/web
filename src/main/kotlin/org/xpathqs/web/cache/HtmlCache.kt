package org.xpathqs.web.cache


import org.cyberneko.html.parsers.DOMParser
import org.xml.sax.InputSource
import org.xpathqs.driver.cache.Cache
import java.io.StringReader

class HtmlCache : Cache() {

    override fun setXml(xml: String, clear: Boolean) {
        if (xml == "") {
            //   Log.error("Page Source can't be empty, something went wrong, unable to continue...")
        } else {
            //  Log.log("cache was updated")
        }

        if (this.xml != null) {
            this.prevXml = this.xml!!
        }

        if (clear) {
            nodesMap.clear()
        }

        this.xml = xml

        val dp = DOMParser()
        dp.parse(InputSource(StringReader(xml)))
        doc = dp.document
    }
}
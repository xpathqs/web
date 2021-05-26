package org.xpathqs.web.cache

import org.cyberneko.html.parsers.DOMParser
import org.xml.sax.InputSource
import org.xpathqs.driver.cache.XmlCache
import org.xpathqs.driver.cache.evaluator.AttributeEvaluator
import org.xpathqs.driver.cache.evaluator.CacheEvaluator
import org.xpathqs.driver.cache.evaluator.Evaluator
import org.xpathqs.driver.log.Log
import java.io.StringReader

class HtmlCache : XmlCache() {

    override fun update(xml: String) {
        if (xml == "") {
            Log.error("Page Source can't be empty, something went wrong, unable to continue...")
        } else {
            Log.info("cache was updated")
        }

        this.xml = xml

        val parser = DOMParser()

        parser.parse(InputSource(StringReader(xml)))
        doc = parser.document

        evaluator = CacheEvaluator(Evaluator(doc))
        attributeEvaluator = AttributeEvaluator(evaluator)
    }
}
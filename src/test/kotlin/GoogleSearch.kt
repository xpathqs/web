
import org.xpathqs.core.selector.block.Block
import org.xpathqs.core.selector.extensions.get
import org.xpathqs.core.selector.extensions.plus
import org.xpathqs.core.selector.extensions.prefix
import org.xpathqs.core.selector.extensions.repeat
import org.xpathqs.core.util.SelectorFactory.idSelector
import org.xpathqs.driver.extensions.clear
import org.xpathqs.driver.extensions.input
import org.xpathqs.web.Page
import org.xpathqs.web.extensions.submit
import org.xpathqs.web.factory.HTML
import org.xpathqs.web.factory.HtmlTags.DIV
import org.xpathqs.web.factory.HtmlTags.H3

data class ResultModelItem(
    val title: String = "",
    val desc: String = ""
)

object GoogleSearch : Page() {
    val searchInput = HTML.input(title = "Search")
    val btnSubmit = HTML.submit()

    fun searchInput(value: String) {
        searchInput
            .clear()
            .input(value)
            .submit()
    }

    object Results : Block(idSelector("search") + DIV.prefix("/").repeat(3)) {
        val lblTitle = H3
        val lblDesc = DIV[2]
    }
}

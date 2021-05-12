import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.xpathqs.core.reflection.SelectorParser
import org.xpathqs.core.reflection.SelectorReflectionFields
import org.xpathqs.core.selector.base.BaseSelector
import org.xpathqs.core.selector.base.ISelector
import org.xpathqs.core.selector.extensions.get
import kotlin.test.assertEquals

class SelectorTests {
    companion object {
        @BeforeAll
        @JvmStatic
        fun init() {
            SelectorParser(GoogleSearch).parse()
        }
    }

    @Test
    fun `GoogleSearch - searchInput`() = checkThat(GoogleSearch.searchInput,
        "//input[@title='Search']")

    @Test
    fun `GoogleSearch - searchInput pos 2`() = checkThat(GoogleSearch.searchInput[2],
        "//input[@title='Search' and position()=2]")

    @Test
    fun `GoogleSearch - searchInput  pos 2`() = checkThat(GoogleSearch.Results.lblDesc,
        "//*[@id='search']/div/div/div//div[position()=2]")

    @Test
    fun `GoogleSearch - searchInput  pos 3`() = checkThat(GoogleSearch.Results[2].lblTitle,
        "(//*[@id='search']/div/div/div)[position()=2]//h3")

    private fun checkThat(sel: ISelector, xpath: String)
        = assertEquals(xpath, sel.toXpath())
}
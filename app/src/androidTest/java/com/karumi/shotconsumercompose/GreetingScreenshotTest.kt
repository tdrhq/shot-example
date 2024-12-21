package com.karumi.shotconsumercompose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.karumi.shot.ScreenshotTest
import com.karumi.shotconsumercompose.ui.ShotConsumerComposeTheme
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class GreetingScreenshotTest : ScreenshotTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun rendersTheDefaultComponent() {
        renderComponent()
        compareScreenshot(composeRule.onRoot())
    }

    @Test
    fun rendersAGreetingWithAnEmptyText() {
        renderComponent("")
        compareScreenshot(composeRule)
    }

    @Test
    fun rendersAGreetingWithATextFullOfWhitespaces() {
        renderComponent(" ".repeat(200))
        compareScreenshot(composeRule)
    }

    @Test
    fun rendersAGreetingWithAShortText() {
        renderComponent("Hello!")
        compareScreenshot(composeRule)
    }

    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!0").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!1").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!2").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!3").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!4").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!5").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!6").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!7").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!8").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!9").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!10").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!11").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!12").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!13").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!14").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!15").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!16").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!17").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!18").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!19").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!20").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!21").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!22").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!23").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!24").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!25").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!26").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!27").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!28").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!29").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!30").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!31").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!32").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!33").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!34").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!35").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!36").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!37").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!38").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!39").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!40").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!41").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!42").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!43").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!44").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!45").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!46").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!47").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!48").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!49").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!50").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!51").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!52").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!53").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!54").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!55").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!56").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!57").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!58").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!59").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!60").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!61").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!62").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!63").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!64").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!65").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!66").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!67").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!68").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!69").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!70").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!71").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!72").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!73").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!74").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!75").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!76").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!77").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!78").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!79").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!80").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!81").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!82").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!83").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!84").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!85").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!86").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!87").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!88").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!89").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!90").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!91").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!92").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!93").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!94").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!95").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!96").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!97").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!98").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText() {
        renderComponent(("Hello world from the compose!99").repeat(20))
        compareScreenshot(composeRule)
    }

    @Composable
    private fun greetingComponent(greeting: String) {
        ShotConsumerComposeTheme {
            Surface(color = MaterialTheme.colors.background) {
                Greeting(greeting)
            }
        }
    }

    private fun renderComponent(greeting: String? = null) {
        composeRule.setContent {
            if (greeting == null) {
                DefaultPreview()
            } else {
                greetingComponent(greeting)
            }
        }
    }

}

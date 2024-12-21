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
    fun rendersAGreetingWithALongText0() {
        renderComponent(("Hello world from the compose!0").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText1() {
        renderComponent(("Hello world from the compose!1").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText2() {
        renderComponent(("Hello world from the compose!2").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText3() {
        renderComponent(("Hello world from the compose!3").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText4() {
        renderComponent(("Hello world from the compose!4").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText5() {
        renderComponent(("Hello world from the compose!5").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText6() {
        renderComponent(("Hello world from the compose!6").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText7() {
        renderComponent(("Hello world from the compose!7").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText8() {
        renderComponent(("Hello world from the compose!8").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText9() {
        renderComponent(("Hello world from the compose!9").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText10() {
        renderComponent(("Hello world from the compose!10").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText11() {
        renderComponent(("Hello world from the compose!11").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText12() {
        renderComponent(("Hello world from the compose!12").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText13() {
        renderComponent(("Hello world from the compose!13").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText14() {
        renderComponent(("Hello world from the compose!14").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText15() {
        renderComponent(("Hello world from the compose!15").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText16() {
        renderComponent(("Hello world from the compose!16").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText17() {
        renderComponent(("Hello world from the compose!17").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText18() {
        renderComponent(("Hello world from the compose!18").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText19() {
        renderComponent(("Hello world from the compose!19").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText20() {
        renderComponent(("Hello world from the compose!20").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText21() {
        renderComponent(("Hello world from the compose!21").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText22() {
        renderComponent(("Hello world from the compose!22").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText23() {
        renderComponent(("Hello world from the compose!23").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText24() {
        renderComponent(("Hello world from the compose!24").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText25() {
        renderComponent(("Hello world from the compose!25").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText26() {
        renderComponent(("Hello world from the compose!26").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText27() {
        renderComponent(("Hello world from the compose!27").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText28() {
        renderComponent(("Hello world from the compose!28").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText29() {
        renderComponent(("Hello world from the compose!29").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText30() {
        renderComponent(("Hello world from the compose!30").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText31() {
        renderComponent(("Hello world from the compose!31").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText32() {
        renderComponent(("Hello world from the compose!32").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText33() {
        renderComponent(("Hello world from the compose!33").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText34() {
        renderComponent(("Hello world from the compose!34").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText35() {
        renderComponent(("Hello world from the compose!35").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText36() {
        renderComponent(("Hello world from the compose!36").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText37() {
        renderComponent(("Hello world from the compose!37").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText38() {
        renderComponent(("Hello world from the compose!38").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText39() {
        renderComponent(("Hello world from the compose!39").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText40() {
        renderComponent(("Hello world from the compose!40").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText41() {
        renderComponent(("Hello world from the compose!41").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText42() {
        renderComponent(("Hello world from the compose!42").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText43() {
        renderComponent(("Hello world from the compose!43").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText44() {
        renderComponent(("Hello world from the compose!44").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText45() {
        renderComponent(("Hello world from the compose!45").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText46() {
        renderComponent(("Hello world from the compose!46").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText47() {
        renderComponent(("Hello world from the compose!47").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText48() {
        renderComponent(("Hello world from the compose!48").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText49() {
        renderComponent(("Hello world from the compose!49").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText50() {
        renderComponent(("Hello world from the compose!50").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText51() {
        renderComponent(("Hello world from the compose!51").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText52() {
        renderComponent(("Hello world from the compose!52").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText53() {
        renderComponent(("Hello world from the compose!53").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText54() {
        renderComponent(("Hello world from the compose!54").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText55() {
        renderComponent(("Hello world from the compose!55").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText56() {
        renderComponent(("Hello world from the compose!56").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText57() {
        renderComponent(("Hello world from the compose!57").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText58() {
        renderComponent(("Hello world from the compose!58").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText59() {
        renderComponent(("Hello world from the compose!59").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText60() {
        renderComponent(("Hello world from the compose!60").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText61() {
        renderComponent(("Hello world from the compose!61").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText62() {
        renderComponent(("Hello world from the compose!62").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText63() {
        renderComponent(("Hello world from the compose!63").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText64() {
        renderComponent(("Hello world from the compose!64").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText65() {
        renderComponent(("Hello world from the compose!65").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText66() {
        renderComponent(("Hello world from the compose!66").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText67() {
        renderComponent(("Hello world from the compose!67").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText68() {
        renderComponent(("Hello world from the compose!68").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText69() {
        renderComponent(("Hello world from the compose!69").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText70() {
        renderComponent(("Hello world from the compose!70").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText71() {
        renderComponent(("Hello world from the compose!71").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText72() {
        renderComponent(("Hello world from the compose!72").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText73() {
        renderComponent(("Hello world from the compose!73").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText74() {
        renderComponent(("Hello world from the compose!74").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText75() {
        renderComponent(("Hello world from the compose!75").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText76() {
        renderComponent(("Hello world from the compose!76").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText77() {
        renderComponent(("Hello world from the compose!77").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText78() {
        renderComponent(("Hello world from the compose!78").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText79() {
        renderComponent(("Hello world from the compose!79").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText80() {
        renderComponent(("Hello world from the compose!80").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText81() {
        renderComponent(("Hello world from the compose!81").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText82() {
        renderComponent(("Hello world from the compose!82").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText83() {
        renderComponent(("Hello world from the compose!83").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText84() {
        renderComponent(("Hello world from the compose!84").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText85() {
        renderComponent(("Hello world from the compose!85").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText86() {
        renderComponent(("Hello world from the compose!86").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText87() {
        renderComponent(("Hello world from the compose!87").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText88() {
        renderComponent(("Hello world from the compose!88").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText89() {
        renderComponent(("Hello world from the compose!89").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText90() {
        renderComponent(("Hello world from the compose!90").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText91() {
        renderComponent(("Hello world from the compose!91").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText92() {
        renderComponent(("Hello world from the compose!92").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText93() {
        renderComponent(("Hello world from the compose!93").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText94() {
        renderComponent(("Hello world from the compose!94").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText95() {
        renderComponent(("Hello world from the compose!95").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText96() {
        renderComponent(("Hello world from the compose!96").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText97() {
        renderComponent(("Hello world from the compose!97").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText98() {
        renderComponent(("Hello world from the compose!98").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText99() {
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

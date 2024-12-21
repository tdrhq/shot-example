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
    @Test
    fun rendersAGreetingWithALongText100() {
        renderComponent(("Hello world from the compose!100").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText101() {
        renderComponent(("Hello world from the compose!101").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText102() {
        renderComponent(("Hello world from the compose!102").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText103() {
        renderComponent(("Hello world from the compose!103").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText104() {
        renderComponent(("Hello world from the compose!104").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText105() {
        renderComponent(("Hello world from the compose!105").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText106() {
        renderComponent(("Hello world from the compose!106").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText107() {
        renderComponent(("Hello world from the compose!107").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText108() {
        renderComponent(("Hello world from the compose!108").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText109() {
        renderComponent(("Hello world from the compose!109").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText110() {
        renderComponent(("Hello world from the compose!110").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText111() {
        renderComponent(("Hello world from the compose!111").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText112() {
        renderComponent(("Hello world from the compose!112").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText113() {
        renderComponent(("Hello world from the compose!113").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText114() {
        renderComponent(("Hello world from the compose!114").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText115() {
        renderComponent(("Hello world from the compose!115").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText116() {
        renderComponent(("Hello world from the compose!116").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText117() {
        renderComponent(("Hello world from the compose!117").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText118() {
        renderComponent(("Hello world from the compose!118").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText119() {
        renderComponent(("Hello world from the compose!119").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText120() {
        renderComponent(("Hello world from the compose!120").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText121() {
        renderComponent(("Hello world from the compose!121").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText122() {
        renderComponent(("Hello world from the compose!122").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText123() {
        renderComponent(("Hello world from the compose!123").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText124() {
        renderComponent(("Hello world from the compose!124").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText125() {
        renderComponent(("Hello world from the compose!125").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText126() {
        renderComponent(("Hello world from the compose!126").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText127() {
        renderComponent(("Hello world from the compose!127").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText128() {
        renderComponent(("Hello world from the compose!128").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText129() {
        renderComponent(("Hello world from the compose!129").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText130() {
        renderComponent(("Hello world from the compose!130").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText131() {
        renderComponent(("Hello world from the compose!131").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText132() {
        renderComponent(("Hello world from the compose!132").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText133() {
        renderComponent(("Hello world from the compose!133").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText134() {
        renderComponent(("Hello world from the compose!134").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText135() {
        renderComponent(("Hello world from the compose!135").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText136() {
        renderComponent(("Hello world from the compose!136").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText137() {
        renderComponent(("Hello world from the compose!137").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText138() {
        renderComponent(("Hello world from the compose!138").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText139() {
        renderComponent(("Hello world from the compose!139").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText140() {
        renderComponent(("Hello world from the compose!140").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText141() {
        renderComponent(("Hello world from the compose!141").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText142() {
        renderComponent(("Hello world from the compose!142").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText143() {
        renderComponent(("Hello world from the compose!143").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText144() {
        renderComponent(("Hello world from the compose!144").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText145() {
        renderComponent(("Hello world from the compose!145").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText146() {
        renderComponent(("Hello world from the compose!146").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText147() {
        renderComponent(("Hello world from the compose!147").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText148() {
        renderComponent(("Hello world from the compose!148").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText149() {
        renderComponent(("Hello world from the compose!149").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText150() {
        renderComponent(("Hello world from the compose!150").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText151() {
        renderComponent(("Hello world from the compose!151").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText152() {
        renderComponent(("Hello world from the compose!152").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText153() {
        renderComponent(("Hello world from the compose!153").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText154() {
        renderComponent(("Hello world from the compose!154").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText155() {
        renderComponent(("Hello world from the compose!155").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText156() {
        renderComponent(("Hello world from the compose!156").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText157() {
        renderComponent(("Hello world from the compose!157").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText158() {
        renderComponent(("Hello world from the compose!158").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText159() {
        renderComponent(("Hello world from the compose!159").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText160() {
        renderComponent(("Hello world from the compose!160").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText161() {
        renderComponent(("Hello world from the compose!161").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText162() {
        renderComponent(("Hello world from the compose!162").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText163() {
        renderComponent(("Hello world from the compose!163").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText164() {
        renderComponent(("Hello world from the compose!164").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText165() {
        renderComponent(("Hello world from the compose!165").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText166() {
        renderComponent(("Hello world from the compose!166").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText167() {
        renderComponent(("Hello world from the compose!167").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText168() {
        renderComponent(("Hello world from the compose!168").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText169() {
        renderComponent(("Hello world from the compose!169").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText170() {
        renderComponent(("Hello world from the compose!170").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText171() {
        renderComponent(("Hello world from the compose!171").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText172() {
        renderComponent(("Hello world from the compose!172").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText173() {
        renderComponent(("Hello world from the compose!173").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText174() {
        renderComponent(("Hello world from the compose!174").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText175() {
        renderComponent(("Hello world from the compose!175").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText176() {
        renderComponent(("Hello world from the compose!176").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText177() {
        renderComponent(("Hello world from the compose!177").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText178() {
        renderComponent(("Hello world from the compose!178").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText179() {
        renderComponent(("Hello world from the compose!179").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText180() {
        renderComponent(("Hello world from the compose!180").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText181() {
        renderComponent(("Hello world from the compose!181").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText182() {
        renderComponent(("Hello world from the compose!182").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText183() {
        renderComponent(("Hello world from the compose!183").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText184() {
        renderComponent(("Hello world from the compose!184").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText185() {
        renderComponent(("Hello world from the compose!185").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText186() {
        renderComponent(("Hello world from the compose!186").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText187() {
        renderComponent(("Hello world from the compose!187").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText188() {
        renderComponent(("Hello world from the compose!188").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText189() {
        renderComponent(("Hello world from the compose!189").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText190() {
        renderComponent(("Hello world from the compose!190").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText191() {
        renderComponent(("Hello world from the compose!191").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText192() {
        renderComponent(("Hello world from the compose!192").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText193() {
        renderComponent(("Hello world from the compose!193").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText194() {
        renderComponent(("Hello world from the compose!194").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText195() {
        renderComponent(("Hello world from the compose!195").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText196() {
        renderComponent(("Hello world from the compose!196").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText197() {
        renderComponent(("Hello world from the compose!197").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText198() {
        renderComponent(("Hello world from the compose!198").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText199() {
        renderComponent(("Hello world from the compose!199").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText200() {
        renderComponent(("Hello world from the compose!200").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText201() {
        renderComponent(("Hello world from the compose!201").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText202() {
        renderComponent(("Hello world from the compose!202").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText203() {
        renderComponent(("Hello world from the compose!203").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText204() {
        renderComponent(("Hello world from the compose!204").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText205() {
        renderComponent(("Hello world from the compose!205").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText206() {
        renderComponent(("Hello world from the compose!206").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText207() {
        renderComponent(("Hello world from the compose!207").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText208() {
        renderComponent(("Hello world from the compose!208").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText209() {
        renderComponent(("Hello world from the compose!209").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText210() {
        renderComponent(("Hello world from the compose!210").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText211() {
        renderComponent(("Hello world from the compose!211").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText212() {
        renderComponent(("Hello world from the compose!212").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText213() {
        renderComponent(("Hello world from the compose!213").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText214() {
        renderComponent(("Hello world from the compose!214").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText215() {
        renderComponent(("Hello world from the compose!215").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText216() {
        renderComponent(("Hello world from the compose!216").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText217() {
        renderComponent(("Hello world from the compose!217").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText218() {
        renderComponent(("Hello world from the compose!218").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText219() {
        renderComponent(("Hello world from the compose!219").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText220() {
        renderComponent(("Hello world from the compose!220").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText221() {
        renderComponent(("Hello world from the compose!221").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText222() {
        renderComponent(("Hello world from the compose!222").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText223() {
        renderComponent(("Hello world from the compose!223").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText224() {
        renderComponent(("Hello world from the compose!224").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText225() {
        renderComponent(("Hello world from the compose!225").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText226() {
        renderComponent(("Hello world from the compose!226").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText227() {
        renderComponent(("Hello world from the compose!227").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText228() {
        renderComponent(("Hello world from the compose!228").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText229() {
        renderComponent(("Hello world from the compose!229").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText230() {
        renderComponent(("Hello world from the compose!230").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText231() {
        renderComponent(("Hello world from the compose!231").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText232() {
        renderComponent(("Hello world from the compose!232").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText233() {
        renderComponent(("Hello world from the compose!233").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText234() {
        renderComponent(("Hello world from the compose!234").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText235() {
        renderComponent(("Hello world from the compose!235").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText236() {
        renderComponent(("Hello world from the compose!236").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText237() {
        renderComponent(("Hello world from the compose!237").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText238() {
        renderComponent(("Hello world from the compose!238").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText239() {
        renderComponent(("Hello world from the compose!239").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText240() {
        renderComponent(("Hello world from the compose!240").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText241() {
        renderComponent(("Hello world from the compose!241").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText242() {
        renderComponent(("Hello world from the compose!242").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText243() {
        renderComponent(("Hello world from the compose!243").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText244() {
        renderComponent(("Hello world from the compose!244").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText245() {
        renderComponent(("Hello world from the compose!245").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText246() {
        renderComponent(("Hello world from the compose!246").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText247() {
        renderComponent(("Hello world from the compose!247").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText248() {
        renderComponent(("Hello world from the compose!248").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText249() {
        renderComponent(("Hello world from the compose!249").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText250() {
        renderComponent(("Hello world from the compose!250").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText251() {
        renderComponent(("Hello world from the compose!251").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText252() {
        renderComponent(("Hello world from the compose!252").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText253() {
        renderComponent(("Hello world from the compose!253").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText254() {
        renderComponent(("Hello world from the compose!254").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText255() {
        renderComponent(("Hello world from the compose!255").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText256() {
        renderComponent(("Hello world from the compose!256").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText257() {
        renderComponent(("Hello world from the compose!257").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText258() {
        renderComponent(("Hello world from the compose!258").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText259() {
        renderComponent(("Hello world from the compose!259").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText260() {
        renderComponent(("Hello world from the compose!260").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText261() {
        renderComponent(("Hello world from the compose!261").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText262() {
        renderComponent(("Hello world from the compose!262").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText263() {
        renderComponent(("Hello world from the compose!263").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText264() {
        renderComponent(("Hello world from the compose!264").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText265() {
        renderComponent(("Hello world from the compose!265").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText266() {
        renderComponent(("Hello world from the compose!266").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText267() {
        renderComponent(("Hello world from the compose!267").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText268() {
        renderComponent(("Hello world from the compose!268").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText269() {
        renderComponent(("Hello world from the compose!269").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText270() {
        renderComponent(("Hello world from the compose!270").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText271() {
        renderComponent(("Hello world from the compose!271").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText272() {
        renderComponent(("Hello world from the compose!272").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText273() {
        renderComponent(("Hello world from the compose!273").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText274() {
        renderComponent(("Hello world from the compose!274").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText275() {
        renderComponent(("Hello world from the compose!275").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText276() {
        renderComponent(("Hello world from the compose!276").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText277() {
        renderComponent(("Hello world from the compose!277").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText278() {
        renderComponent(("Hello world from the compose!278").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText279() {
        renderComponent(("Hello world from the compose!279").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText280() {
        renderComponent(("Hello world from the compose!280").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText281() {
        renderComponent(("Hello world from the compose!281").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText282() {
        renderComponent(("Hello world from the compose!282").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText283() {
        renderComponent(("Hello world from the compose!283").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText284() {
        renderComponent(("Hello world from the compose!284").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText285() {
        renderComponent(("Hello world from the compose!285").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText286() {
        renderComponent(("Hello world from the compose!286").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText287() {
        renderComponent(("Hello world from the compose!287").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText288() {
        renderComponent(("Hello world from the compose!288").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText289() {
        renderComponent(("Hello world from the compose!289").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText290() {
        renderComponent(("Hello world from the compose!290").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText291() {
        renderComponent(("Hello world from the compose!291").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText292() {
        renderComponent(("Hello world from the compose!292").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText293() {
        renderComponent(("Hello world from the compose!293").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText294() {
        renderComponent(("Hello world from the compose!294").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText295() {
        renderComponent(("Hello world from the compose!295").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText296() {
        renderComponent(("Hello world from the compose!296").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText297() {
        renderComponent(("Hello world from the compose!297").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText298() {
        renderComponent(("Hello world from the compose!298").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText299() {
        renderComponent(("Hello world from the compose!299").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText300() {
        renderComponent(("Hello world from the compose!300").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText301() {
        renderComponent(("Hello world from the compose!301").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText302() {
        renderComponent(("Hello world from the compose!302").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText303() {
        renderComponent(("Hello world from the compose!303").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText304() {
        renderComponent(("Hello world from the compose!304").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText305() {
        renderComponent(("Hello world from the compose!305").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText306() {
        renderComponent(("Hello world from the compose!306").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText307() {
        renderComponent(("Hello world from the compose!307").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText308() {
        renderComponent(("Hello world from the compose!308").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText309() {
        renderComponent(("Hello world from the compose!309").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText310() {
        renderComponent(("Hello world from the compose!310").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText311() {
        renderComponent(("Hello world from the compose!311").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText312() {
        renderComponent(("Hello world from the compose!312").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText313() {
        renderComponent(("Hello world from the compose!313").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText314() {
        renderComponent(("Hello world from the compose!314").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText315() {
        renderComponent(("Hello world from the compose!315").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText316() {
        renderComponent(("Hello world from the compose!316").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText317() {
        renderComponent(("Hello world from the compose!317").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText318() {
        renderComponent(("Hello world from the compose!318").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText319() {
        renderComponent(("Hello world from the compose!319").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText320() {
        renderComponent(("Hello world from the compose!320").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText321() {
        renderComponent(("Hello world from the compose!321").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText322() {
        renderComponent(("Hello world from the compose!322").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText323() {
        renderComponent(("Hello world from the compose!323").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText324() {
        renderComponent(("Hello world from the compose!324").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText325() {
        renderComponent(("Hello world from the compose!325").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText326() {
        renderComponent(("Hello world from the compose!326").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText327() {
        renderComponent(("Hello world from the compose!327").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText328() {
        renderComponent(("Hello world from the compose!328").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText329() {
        renderComponent(("Hello world from the compose!329").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText330() {
        renderComponent(("Hello world from the compose!330").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText331() {
        renderComponent(("Hello world from the compose!331").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText332() {
        renderComponent(("Hello world from the compose!332").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText333() {
        renderComponent(("Hello world from the compose!333").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText334() {
        renderComponent(("Hello world from the compose!334").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText335() {
        renderComponent(("Hello world from the compose!335").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText336() {
        renderComponent(("Hello world from the compose!336").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText337() {
        renderComponent(("Hello world from the compose!337").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText338() {
        renderComponent(("Hello world from the compose!338").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText339() {
        renderComponent(("Hello world from the compose!339").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText340() {
        renderComponent(("Hello world from the compose!340").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText341() {
        renderComponent(("Hello world from the compose!341").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText342() {
        renderComponent(("Hello world from the compose!342").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText343() {
        renderComponent(("Hello world from the compose!343").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText344() {
        renderComponent(("Hello world from the compose!344").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText345() {
        renderComponent(("Hello world from the compose!345").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText346() {
        renderComponent(("Hello world from the compose!346").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText347() {
        renderComponent(("Hello world from the compose!347").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText348() {
        renderComponent(("Hello world from the compose!348").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText349() {
        renderComponent(("Hello world from the compose!349").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText350() {
        renderComponent(("Hello world from the compose!350").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText351() {
        renderComponent(("Hello world from the compose!351").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText352() {
        renderComponent(("Hello world from the compose!352").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText353() {
        renderComponent(("Hello world from the compose!353").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText354() {
        renderComponent(("Hello world from the compose!354").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText355() {
        renderComponent(("Hello world from the compose!355").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText356() {
        renderComponent(("Hello world from the compose!356").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText357() {
        renderComponent(("Hello world from the compose!357").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText358() {
        renderComponent(("Hello world from the compose!358").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText359() {
        renderComponent(("Hello world from the compose!359").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText360() {
        renderComponent(("Hello world from the compose!360").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText361() {
        renderComponent(("Hello world from the compose!361").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText362() {
        renderComponent(("Hello world from the compose!362").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText363() {
        renderComponent(("Hello world from the compose!363").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText364() {
        renderComponent(("Hello world from the compose!364").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText365() {
        renderComponent(("Hello world from the compose!365").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText366() {
        renderComponent(("Hello world from the compose!366").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText367() {
        renderComponent(("Hello world from the compose!367").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText368() {
        renderComponent(("Hello world from the compose!368").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText369() {
        renderComponent(("Hello world from the compose!369").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText370() {
        renderComponent(("Hello world from the compose!370").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText371() {
        renderComponent(("Hello world from the compose!371").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText372() {
        renderComponent(("Hello world from the compose!372").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText373() {
        renderComponent(("Hello world from the compose!373").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText374() {
        renderComponent(("Hello world from the compose!374").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText375() {
        renderComponent(("Hello world from the compose!375").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText376() {
        renderComponent(("Hello world from the compose!376").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText377() {
        renderComponent(("Hello world from the compose!377").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText378() {
        renderComponent(("Hello world from the compose!378").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText379() {
        renderComponent(("Hello world from the compose!379").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText380() {
        renderComponent(("Hello world from the compose!380").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText381() {
        renderComponent(("Hello world from the compose!381").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText382() {
        renderComponent(("Hello world from the compose!382").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText383() {
        renderComponent(("Hello world from the compose!383").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText384() {
        renderComponent(("Hello world from the compose!384").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText385() {
        renderComponent(("Hello world from the compose!385").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText386() {
        renderComponent(("Hello world from the compose!386").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText387() {
        renderComponent(("Hello world from the compose!387").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText388() {
        renderComponent(("Hello world from the compose!388").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText389() {
        renderComponent(("Hello world from the compose!389").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText390() {
        renderComponent(("Hello world from the compose!390").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText391() {
        renderComponent(("Hello world from the compose!391").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText392() {
        renderComponent(("Hello world from the compose!392").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText393() {
        renderComponent(("Hello world from the compose!393").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText394() {
        renderComponent(("Hello world from the compose!394").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText395() {
        renderComponent(("Hello world from the compose!395").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText396() {
        renderComponent(("Hello world from the compose!396").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText397() {
        renderComponent(("Hello world from the compose!397").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText398() {
        renderComponent(("Hello world from the compose!398").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText399() {
        renderComponent(("Hello world from the compose!399").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText400() {
        renderComponent(("Hello world from the compose!400").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText401() {
        renderComponent(("Hello world from the compose!401").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText402() {
        renderComponent(("Hello world from the compose!402").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText403() {
        renderComponent(("Hello world from the compose!403").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText404() {
        renderComponent(("Hello world from the compose!404").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText405() {
        renderComponent(("Hello world from the compose!405").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText406() {
        renderComponent(("Hello world from the compose!406").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText407() {
        renderComponent(("Hello world from the compose!407").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText408() {
        renderComponent(("Hello world from the compose!408").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText409() {
        renderComponent(("Hello world from the compose!409").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText410() {
        renderComponent(("Hello world from the compose!410").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText411() {
        renderComponent(("Hello world from the compose!411").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText412() {
        renderComponent(("Hello world from the compose!412").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText413() {
        renderComponent(("Hello world from the compose!413").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText414() {
        renderComponent(("Hello world from the compose!414").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText415() {
        renderComponent(("Hello world from the compose!415").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText416() {
        renderComponent(("Hello world from the compose!416").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText417() {
        renderComponent(("Hello world from the compose!417").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText418() {
        renderComponent(("Hello world from the compose!418").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText419() {
        renderComponent(("Hello world from the compose!419").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText420() {
        renderComponent(("Hello world from the compose!420").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText421() {
        renderComponent(("Hello world from the compose!421").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText422() {
        renderComponent(("Hello world from the compose!422").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText423() {
        renderComponent(("Hello world from the compose!423").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText424() {
        renderComponent(("Hello world from the compose!424").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText425() {
        renderComponent(("Hello world from the compose!425").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText426() {
        renderComponent(("Hello world from the compose!426").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText427() {
        renderComponent(("Hello world from the compose!427").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText428() {
        renderComponent(("Hello world from the compose!428").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText429() {
        renderComponent(("Hello world from the compose!429").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText430() {
        renderComponent(("Hello world from the compose!430").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText431() {
        renderComponent(("Hello world from the compose!431").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText432() {
        renderComponent(("Hello world from the compose!432").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText433() {
        renderComponent(("Hello world from the compose!433").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText434() {
        renderComponent(("Hello world from the compose!434").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText435() {
        renderComponent(("Hello world from the compose!435").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText436() {
        renderComponent(("Hello world from the compose!436").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText437() {
        renderComponent(("Hello world from the compose!437").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText438() {
        renderComponent(("Hello world from the compose!438").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText439() {
        renderComponent(("Hello world from the compose!439").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText440() {
        renderComponent(("Hello world from the compose!440").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText441() {
        renderComponent(("Hello world from the compose!441").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText442() {
        renderComponent(("Hello world from the compose!442").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText443() {
        renderComponent(("Hello world from the compose!443").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText444() {
        renderComponent(("Hello world from the compose!444").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText445() {
        renderComponent(("Hello world from the compose!445").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText446() {
        renderComponent(("Hello world from the compose!446").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText447() {
        renderComponent(("Hello world from the compose!447").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText448() {
        renderComponent(("Hello world from the compose!448").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText449() {
        renderComponent(("Hello world from the compose!449").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText450() {
        renderComponent(("Hello world from the compose!450").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText451() {
        renderComponent(("Hello world from the compose!451").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText452() {
        renderComponent(("Hello world from the compose!452").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText453() {
        renderComponent(("Hello world from the compose!453").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText454() {
        renderComponent(("Hello world from the compose!454").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText455() {
        renderComponent(("Hello world from the compose!455").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText456() {
        renderComponent(("Hello world from the compose!456").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText457() {
        renderComponent(("Hello world from the compose!457").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText458() {
        renderComponent(("Hello world from the compose!458").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText459() {
        renderComponent(("Hello world from the compose!459").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText460() {
        renderComponent(("Hello world from the compose!460").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText461() {
        renderComponent(("Hello world from the compose!461").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText462() {
        renderComponent(("Hello world from the compose!462").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText463() {
        renderComponent(("Hello world from the compose!463").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText464() {
        renderComponent(("Hello world from the compose!464").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText465() {
        renderComponent(("Hello world from the compose!465").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText466() {
        renderComponent(("Hello world from the compose!466").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText467() {
        renderComponent(("Hello world from the compose!467").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText468() {
        renderComponent(("Hello world from the compose!468").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText469() {
        renderComponent(("Hello world from the compose!469").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText470() {
        renderComponent(("Hello world from the compose!470").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText471() {
        renderComponent(("Hello world from the compose!471").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText472() {
        renderComponent(("Hello world from the compose!472").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText473() {
        renderComponent(("Hello world from the compose!473").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText474() {
        renderComponent(("Hello world from the compose!474").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText475() {
        renderComponent(("Hello world from the compose!475").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText476() {
        renderComponent(("Hello world from the compose!476").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText477() {
        renderComponent(("Hello world from the compose!477").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText478() {
        renderComponent(("Hello world from the compose!478").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText479() {
        renderComponent(("Hello world from the compose!479").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText480() {
        renderComponent(("Hello world from the compose!480").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText481() {
        renderComponent(("Hello world from the compose!481").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText482() {
        renderComponent(("Hello world from the compose!482").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText483() {
        renderComponent(("Hello world from the compose!483").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText484() {
        renderComponent(("Hello world from the compose!484").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText485() {
        renderComponent(("Hello world from the compose!485").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText486() {
        renderComponent(("Hello world from the compose!486").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText487() {
        renderComponent(("Hello world from the compose!487").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText488() {
        renderComponent(("Hello world from the compose!488").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText489() {
        renderComponent(("Hello world from the compose!489").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText490() {
        renderComponent(("Hello world from the compose!490").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText491() {
        renderComponent(("Hello world from the compose!491").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText492() {
        renderComponent(("Hello world from the compose!492").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText493() {
        renderComponent(("Hello world from the compose!493").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText494() {
        renderComponent(("Hello world from the compose!494").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText495() {
        renderComponent(("Hello world from the compose!495").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText496() {
        renderComponent(("Hello world from the compose!496").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText497() {
        renderComponent(("Hello world from the compose!497").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText498() {
        renderComponent(("Hello world from the compose!498").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText499() {
        renderComponent(("Hello world from the compose!499").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText500() {
        renderComponent(("Hello world from the compose!500").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText501() {
        renderComponent(("Hello world from the compose!501").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText502() {
        renderComponent(("Hello world from the compose!502").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText503() {
        renderComponent(("Hello world from the compose!503").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText504() {
        renderComponent(("Hello world from the compose!504").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText505() {
        renderComponent(("Hello world from the compose!505").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText506() {
        renderComponent(("Hello world from the compose!506").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText507() {
        renderComponent(("Hello world from the compose!507").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText508() {
        renderComponent(("Hello world from the compose!508").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText509() {
        renderComponent(("Hello world from the compose!509").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText510() {
        renderComponent(("Hello world from the compose!510").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText511() {
        renderComponent(("Hello world from the compose!511").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText512() {
        renderComponent(("Hello world from the compose!512").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText513() {
        renderComponent(("Hello world from the compose!513").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText514() {
        renderComponent(("Hello world from the compose!514").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText515() {
        renderComponent(("Hello world from the compose!515").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText516() {
        renderComponent(("Hello world from the compose!516").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText517() {
        renderComponent(("Hello world from the compose!517").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText518() {
        renderComponent(("Hello world from the compose!518").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText519() {
        renderComponent(("Hello world from the compose!519").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText520() {
        renderComponent(("Hello world from the compose!520").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText521() {
        renderComponent(("Hello world from the compose!521").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText522() {
        renderComponent(("Hello world from the compose!522").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText523() {
        renderComponent(("Hello world from the compose!523").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText524() {
        renderComponent(("Hello world from the compose!524").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText525() {
        renderComponent(("Hello world from the compose!525").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText526() {
        renderComponent(("Hello world from the compose!526").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText527() {
        renderComponent(("Hello world from the compose!527").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText528() {
        renderComponent(("Hello world from the compose!528").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText529() {
        renderComponent(("Hello world from the compose!529").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText530() {
        renderComponent(("Hello world from the compose!530").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText531() {
        renderComponent(("Hello world from the compose!531").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText532() {
        renderComponent(("Hello world from the compose!532").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText533() {
        renderComponent(("Hello world from the compose!533").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText534() {
        renderComponent(("Hello world from the compose!534").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText535() {
        renderComponent(("Hello world from the compose!535").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText536() {
        renderComponent(("Hello world from the compose!536").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText537() {
        renderComponent(("Hello world from the compose!537").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText538() {
        renderComponent(("Hello world from the compose!538").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText539() {
        renderComponent(("Hello world from the compose!539").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText540() {
        renderComponent(("Hello world from the compose!540").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText541() {
        renderComponent(("Hello world from the compose!541").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText542() {
        renderComponent(("Hello world from the compose!542").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText543() {
        renderComponent(("Hello world from the compose!543").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText544() {
        renderComponent(("Hello world from the compose!544").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText545() {
        renderComponent(("Hello world from the compose!545").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText546() {
        renderComponent(("Hello world from the compose!546").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText547() {
        renderComponent(("Hello world from the compose!547").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText548() {
        renderComponent(("Hello world from the compose!548").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText549() {
        renderComponent(("Hello world from the compose!549").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText550() {
        renderComponent(("Hello world from the compose!550").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText551() {
        renderComponent(("Hello world from the compose!551").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText552() {
        renderComponent(("Hello world from the compose!552").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText553() {
        renderComponent(("Hello world from the compose!553").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText554() {
        renderComponent(("Hello world from the compose!554").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText555() {
        renderComponent(("Hello world from the compose!555").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText556() {
        renderComponent(("Hello world from the compose!556").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText557() {
        renderComponent(("Hello world from the compose!557").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText558() {
        renderComponent(("Hello world from the compose!558").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText559() {
        renderComponent(("Hello world from the compose!559").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText560() {
        renderComponent(("Hello world from the compose!560").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText561() {
        renderComponent(("Hello world from the compose!561").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText562() {
        renderComponent(("Hello world from the compose!562").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText563() {
        renderComponent(("Hello world from the compose!563").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText564() {
        renderComponent(("Hello world from the compose!564").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText565() {
        renderComponent(("Hello world from the compose!565").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText566() {
        renderComponent(("Hello world from the compose!566").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText567() {
        renderComponent(("Hello world from the compose!567").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText568() {
        renderComponent(("Hello world from the compose!568").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText569() {
        renderComponent(("Hello world from the compose!569").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText570() {
        renderComponent(("Hello world from the compose!570").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText571() {
        renderComponent(("Hello world from the compose!571").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText572() {
        renderComponent(("Hello world from the compose!572").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText573() {
        renderComponent(("Hello world from the compose!573").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText574() {
        renderComponent(("Hello world from the compose!574").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText575() {
        renderComponent(("Hello world from the compose!575").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText576() {
        renderComponent(("Hello world from the compose!576").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText577() {
        renderComponent(("Hello world from the compose!577").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText578() {
        renderComponent(("Hello world from the compose!578").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText579() {
        renderComponent(("Hello world from the compose!579").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText580() {
        renderComponent(("Hello world from the compose!580").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText581() {
        renderComponent(("Hello world from the compose!581").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText582() {
        renderComponent(("Hello world from the compose!582").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText583() {
        renderComponent(("Hello world from the compose!583").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText584() {
        renderComponent(("Hello world from the compose!584").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText585() {
        renderComponent(("Hello world from the compose!585").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText586() {
        renderComponent(("Hello world from the compose!586").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText587() {
        renderComponent(("Hello world from the compose!587").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText588() {
        renderComponent(("Hello world from the compose!588").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText589() {
        renderComponent(("Hello world from the compose!589").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText590() {
        renderComponent(("Hello world from the compose!590").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText591() {
        renderComponent(("Hello world from the compose!591").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText592() {
        renderComponent(("Hello world from the compose!592").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText593() {
        renderComponent(("Hello world from the compose!593").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText594() {
        renderComponent(("Hello world from the compose!594").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText595() {
        renderComponent(("Hello world from the compose!595").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText596() {
        renderComponent(("Hello world from the compose!596").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText597() {
        renderComponent(("Hello world from the compose!597").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText598() {
        renderComponent(("Hello world from the compose!598").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText599() {
        renderComponent(("Hello world from the compose!599").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText600() {
        renderComponent(("Hello world from the compose!600").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText601() {
        renderComponent(("Hello world from the compose!601").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText602() {
        renderComponent(("Hello world from the compose!602").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText603() {
        renderComponent(("Hello world from the compose!603").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText604() {
        renderComponent(("Hello world from the compose!604").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText605() {
        renderComponent(("Hello world from the compose!605").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText606() {
        renderComponent(("Hello world from the compose!606").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText607() {
        renderComponent(("Hello world from the compose!607").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText608() {
        renderComponent(("Hello world from the compose!608").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText609() {
        renderComponent(("Hello world from the compose!609").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText610() {
        renderComponent(("Hello world from the compose!610").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText611() {
        renderComponent(("Hello world from the compose!611").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText612() {
        renderComponent(("Hello world from the compose!612").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText613() {
        renderComponent(("Hello world from the compose!613").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText614() {
        renderComponent(("Hello world from the compose!614").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText615() {
        renderComponent(("Hello world from the compose!615").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText616() {
        renderComponent(("Hello world from the compose!616").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText617() {
        renderComponent(("Hello world from the compose!617").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText618() {
        renderComponent(("Hello world from the compose!618").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText619() {
        renderComponent(("Hello world from the compose!619").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText620() {
        renderComponent(("Hello world from the compose!620").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText621() {
        renderComponent(("Hello world from the compose!621").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText622() {
        renderComponent(("Hello world from the compose!622").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText623() {
        renderComponent(("Hello world from the compose!623").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText624() {
        renderComponent(("Hello world from the compose!624").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText625() {
        renderComponent(("Hello world from the compose!625").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText626() {
        renderComponent(("Hello world from the compose!626").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText627() {
        renderComponent(("Hello world from the compose!627").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText628() {
        renderComponent(("Hello world from the compose!628").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText629() {
        renderComponent(("Hello world from the compose!629").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText630() {
        renderComponent(("Hello world from the compose!630").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText631() {
        renderComponent(("Hello world from the compose!631").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText632() {
        renderComponent(("Hello world from the compose!632").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText633() {
        renderComponent(("Hello world from the compose!633").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText634() {
        renderComponent(("Hello world from the compose!634").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText635() {
        renderComponent(("Hello world from the compose!635").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText636() {
        renderComponent(("Hello world from the compose!636").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText637() {
        renderComponent(("Hello world from the compose!637").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText638() {
        renderComponent(("Hello world from the compose!638").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText639() {
        renderComponent(("Hello world from the compose!639").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText640() {
        renderComponent(("Hello world from the compose!640").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText641() {
        renderComponent(("Hello world from the compose!641").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText642() {
        renderComponent(("Hello world from the compose!642").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText643() {
        renderComponent(("Hello world from the compose!643").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText644() {
        renderComponent(("Hello world from the compose!644").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText645() {
        renderComponent(("Hello world from the compose!645").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText646() {
        renderComponent(("Hello world from the compose!646").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText647() {
        renderComponent(("Hello world from the compose!647").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText648() {
        renderComponent(("Hello world from the compose!648").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText649() {
        renderComponent(("Hello world from the compose!649").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText650() {
        renderComponent(("Hello world from the compose!650").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText651() {
        renderComponent(("Hello world from the compose!651").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText652() {
        renderComponent(("Hello world from the compose!652").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText653() {
        renderComponent(("Hello world from the compose!653").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText654() {
        renderComponent(("Hello world from the compose!654").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText655() {
        renderComponent(("Hello world from the compose!655").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText656() {
        renderComponent(("Hello world from the compose!656").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText657() {
        renderComponent(("Hello world from the compose!657").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText658() {
        renderComponent(("Hello world from the compose!658").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText659() {
        renderComponent(("Hello world from the compose!659").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText660() {
        renderComponent(("Hello world from the compose!660").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText661() {
        renderComponent(("Hello world from the compose!661").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText662() {
        renderComponent(("Hello world from the compose!662").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText663() {
        renderComponent(("Hello world from the compose!663").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText664() {
        renderComponent(("Hello world from the compose!664").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText665() {
        renderComponent(("Hello world from the compose!665").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText666() {
        renderComponent(("Hello world from the compose!666").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText667() {
        renderComponent(("Hello world from the compose!667").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText668() {
        renderComponent(("Hello world from the compose!668").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText669() {
        renderComponent(("Hello world from the compose!669").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText670() {
        renderComponent(("Hello world from the compose!670").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText671() {
        renderComponent(("Hello world from the compose!671").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText672() {
        renderComponent(("Hello world from the compose!672").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText673() {
        renderComponent(("Hello world from the compose!673").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText674() {
        renderComponent(("Hello world from the compose!674").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText675() {
        renderComponent(("Hello world from the compose!675").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText676() {
        renderComponent(("Hello world from the compose!676").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText677() {
        renderComponent(("Hello world from the compose!677").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText678() {
        renderComponent(("Hello world from the compose!678").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText679() {
        renderComponent(("Hello world from the compose!679").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText680() {
        renderComponent(("Hello world from the compose!680").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText681() {
        renderComponent(("Hello world from the compose!681").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText682() {
        renderComponent(("Hello world from the compose!682").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText683() {
        renderComponent(("Hello world from the compose!683").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText684() {
        renderComponent(("Hello world from the compose!684").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText685() {
        renderComponent(("Hello world from the compose!685").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText686() {
        renderComponent(("Hello world from the compose!686").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText687() {
        renderComponent(("Hello world from the compose!687").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText688() {
        renderComponent(("Hello world from the compose!688").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText689() {
        renderComponent(("Hello world from the compose!689").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText690() {
        renderComponent(("Hello world from the compose!690").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText691() {
        renderComponent(("Hello world from the compose!691").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText692() {
        renderComponent(("Hello world from the compose!692").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText693() {
        renderComponent(("Hello world from the compose!693").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText694() {
        renderComponent(("Hello world from the compose!694").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText695() {
        renderComponent(("Hello world from the compose!695").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText696() {
        renderComponent(("Hello world from the compose!696").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText697() {
        renderComponent(("Hello world from the compose!697").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText698() {
        renderComponent(("Hello world from the compose!698").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText699() {
        renderComponent(("Hello world from the compose!699").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText700() {
        renderComponent(("Hello world from the compose!700").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText701() {
        renderComponent(("Hello world from the compose!701").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText702() {
        renderComponent(("Hello world from the compose!702").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText703() {
        renderComponent(("Hello world from the compose!703").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText704() {
        renderComponent(("Hello world from the compose!704").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText705() {
        renderComponent(("Hello world from the compose!705").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText706() {
        renderComponent(("Hello world from the compose!706").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText707() {
        renderComponent(("Hello world from the compose!707").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText708() {
        renderComponent(("Hello world from the compose!708").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText709() {
        renderComponent(("Hello world from the compose!709").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText710() {
        renderComponent(("Hello world from the compose!710").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText711() {
        renderComponent(("Hello world from the compose!711").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText712() {
        renderComponent(("Hello world from the compose!712").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText713() {
        renderComponent(("Hello world from the compose!713").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText714() {
        renderComponent(("Hello world from the compose!714").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText715() {
        renderComponent(("Hello world from the compose!715").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText716() {
        renderComponent(("Hello world from the compose!716").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText717() {
        renderComponent(("Hello world from the compose!717").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText718() {
        renderComponent(("Hello world from the compose!718").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText719() {
        renderComponent(("Hello world from the compose!719").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText720() {
        renderComponent(("Hello world from the compose!720").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText721() {
        renderComponent(("Hello world from the compose!721").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText722() {
        renderComponent(("Hello world from the compose!722").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText723() {
        renderComponent(("Hello world from the compose!723").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText724() {
        renderComponent(("Hello world from the compose!724").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText725() {
        renderComponent(("Hello world from the compose!725").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText726() {
        renderComponent(("Hello world from the compose!726").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText727() {
        renderComponent(("Hello world from the compose!727").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText728() {
        renderComponent(("Hello world from the compose!728").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText729() {
        renderComponent(("Hello world from the compose!729").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText730() {
        renderComponent(("Hello world from the compose!730").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText731() {
        renderComponent(("Hello world from the compose!731").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText732() {
        renderComponent(("Hello world from the compose!732").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText733() {
        renderComponent(("Hello world from the compose!733").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText734() {
        renderComponent(("Hello world from the compose!734").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText735() {
        renderComponent(("Hello world from the compose!735").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText736() {
        renderComponent(("Hello world from the compose!736").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText737() {
        renderComponent(("Hello world from the compose!737").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText738() {
        renderComponent(("Hello world from the compose!738").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText739() {
        renderComponent(("Hello world from the compose!739").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText740() {
        renderComponent(("Hello world from the compose!740").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText741() {
        renderComponent(("Hello world from the compose!741").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText742() {
        renderComponent(("Hello world from the compose!742").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText743() {
        renderComponent(("Hello world from the compose!743").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText744() {
        renderComponent(("Hello world from the compose!744").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText745() {
        renderComponent(("Hello world from the compose!745").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText746() {
        renderComponent(("Hello world from the compose!746").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText747() {
        renderComponent(("Hello world from the compose!747").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText748() {
        renderComponent(("Hello world from the compose!748").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText749() {
        renderComponent(("Hello world from the compose!749").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText750() {
        renderComponent(("Hello world from the compose!750").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText751() {
        renderComponent(("Hello world from the compose!751").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText752() {
        renderComponent(("Hello world from the compose!752").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText753() {
        renderComponent(("Hello world from the compose!753").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText754() {
        renderComponent(("Hello world from the compose!754").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText755() {
        renderComponent(("Hello world from the compose!755").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText756() {
        renderComponent(("Hello world from the compose!756").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText757() {
        renderComponent(("Hello world from the compose!757").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText758() {
        renderComponent(("Hello world from the compose!758").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText759() {
        renderComponent(("Hello world from the compose!759").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText760() {
        renderComponent(("Hello world from the compose!760").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText761() {
        renderComponent(("Hello world from the compose!761").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText762() {
        renderComponent(("Hello world from the compose!762").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText763() {
        renderComponent(("Hello world from the compose!763").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText764() {
        renderComponent(("Hello world from the compose!764").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText765() {
        renderComponent(("Hello world from the compose!765").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText766() {
        renderComponent(("Hello world from the compose!766").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText767() {
        renderComponent(("Hello world from the compose!767").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText768() {
        renderComponent(("Hello world from the compose!768").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText769() {
        renderComponent(("Hello world from the compose!769").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText770() {
        renderComponent(("Hello world from the compose!770").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText771() {
        renderComponent(("Hello world from the compose!771").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText772() {
        renderComponent(("Hello world from the compose!772").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText773() {
        renderComponent(("Hello world from the compose!773").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText774() {
        renderComponent(("Hello world from the compose!774").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText775() {
        renderComponent(("Hello world from the compose!775").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText776() {
        renderComponent(("Hello world from the compose!776").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText777() {
        renderComponent(("Hello world from the compose!777").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText778() {
        renderComponent(("Hello world from the compose!778").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText779() {
        renderComponent(("Hello world from the compose!779").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText780() {
        renderComponent(("Hello world from the compose!780").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText781() {
        renderComponent(("Hello world from the compose!781").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText782() {
        renderComponent(("Hello world from the compose!782").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText783() {
        renderComponent(("Hello world from the compose!783").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText784() {
        renderComponent(("Hello world from the compose!784").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText785() {
        renderComponent(("Hello world from the compose!785").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText786() {
        renderComponent(("Hello world from the compose!786").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText787() {
        renderComponent(("Hello world from the compose!787").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText788() {
        renderComponent(("Hello world from the compose!788").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText789() {
        renderComponent(("Hello world from the compose!789").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText790() {
        renderComponent(("Hello world from the compose!790").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText791() {
        renderComponent(("Hello world from the compose!791").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText792() {
        renderComponent(("Hello world from the compose!792").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText793() {
        renderComponent(("Hello world from the compose!793").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText794() {
        renderComponent(("Hello world from the compose!794").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText795() {
        renderComponent(("Hello world from the compose!795").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText796() {
        renderComponent(("Hello world from the compose!796").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText797() {
        renderComponent(("Hello world from the compose!797").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText798() {
        renderComponent(("Hello world from the compose!798").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText799() {
        renderComponent(("Hello world from the compose!799").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText800() {
        renderComponent(("Hello world from the compose!800").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText801() {
        renderComponent(("Hello world from the compose!801").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText802() {
        renderComponent(("Hello world from the compose!802").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText803() {
        renderComponent(("Hello world from the compose!803").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText804() {
        renderComponent(("Hello world from the compose!804").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText805() {
        renderComponent(("Hello world from the compose!805").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText806() {
        renderComponent(("Hello world from the compose!806").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText807() {
        renderComponent(("Hello world from the compose!807").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText808() {
        renderComponent(("Hello world from the compose!808").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText809() {
        renderComponent(("Hello world from the compose!809").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText810() {
        renderComponent(("Hello world from the compose!810").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText811() {
        renderComponent(("Hello world from the compose!811").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText812() {
        renderComponent(("Hello world from the compose!812").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText813() {
        renderComponent(("Hello world from the compose!813").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText814() {
        renderComponent(("Hello world from the compose!814").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText815() {
        renderComponent(("Hello world from the compose!815").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText816() {
        renderComponent(("Hello world from the compose!816").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText817() {
        renderComponent(("Hello world from the compose!817").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText818() {
        renderComponent(("Hello world from the compose!818").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText819() {
        renderComponent(("Hello world from the compose!819").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText820() {
        renderComponent(("Hello world from the compose!820").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText821() {
        renderComponent(("Hello world from the compose!821").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText822() {
        renderComponent(("Hello world from the compose!822").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText823() {
        renderComponent(("Hello world from the compose!823").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText824() {
        renderComponent(("Hello world from the compose!824").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText825() {
        renderComponent(("Hello world from the compose!825").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText826() {
        renderComponent(("Hello world from the compose!826").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText827() {
        renderComponent(("Hello world from the compose!827").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText828() {
        renderComponent(("Hello world from the compose!828").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText829() {
        renderComponent(("Hello world from the compose!829").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText830() {
        renderComponent(("Hello world from the compose!830").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText831() {
        renderComponent(("Hello world from the compose!831").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText832() {
        renderComponent(("Hello world from the compose!832").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText833() {
        renderComponent(("Hello world from the compose!833").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText834() {
        renderComponent(("Hello world from the compose!834").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText835() {
        renderComponent(("Hello world from the compose!835").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText836() {
        renderComponent(("Hello world from the compose!836").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText837() {
        renderComponent(("Hello world from the compose!837").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText838() {
        renderComponent(("Hello world from the compose!838").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText839() {
        renderComponent(("Hello world from the compose!839").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText840() {
        renderComponent(("Hello world from the compose!840").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText841() {
        renderComponent(("Hello world from the compose!841").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText842() {
        renderComponent(("Hello world from the compose!842").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText843() {
        renderComponent(("Hello world from the compose!843").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText844() {
        renderComponent(("Hello world from the compose!844").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText845() {
        renderComponent(("Hello world from the compose!845").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText846() {
        renderComponent(("Hello world from the compose!846").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText847() {
        renderComponent(("Hello world from the compose!847").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText848() {
        renderComponent(("Hello world from the compose!848").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText849() {
        renderComponent(("Hello world from the compose!849").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText850() {
        renderComponent(("Hello world from the compose!850").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText851() {
        renderComponent(("Hello world from the compose!851").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText852() {
        renderComponent(("Hello world from the compose!852").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText853() {
        renderComponent(("Hello world from the compose!853").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText854() {
        renderComponent(("Hello world from the compose!854").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText855() {
        renderComponent(("Hello world from the compose!855").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText856() {
        renderComponent(("Hello world from the compose!856").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText857() {
        renderComponent(("Hello world from the compose!857").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText858() {
        renderComponent(("Hello world from the compose!858").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText859() {
        renderComponent(("Hello world from the compose!859").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText860() {
        renderComponent(("Hello world from the compose!860").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText861() {
        renderComponent(("Hello world from the compose!861").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText862() {
        renderComponent(("Hello world from the compose!862").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText863() {
        renderComponent(("Hello world from the compose!863").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText864() {
        renderComponent(("Hello world from the compose!864").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText865() {
        renderComponent(("Hello world from the compose!865").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText866() {
        renderComponent(("Hello world from the compose!866").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText867() {
        renderComponent(("Hello world from the compose!867").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText868() {
        renderComponent(("Hello world from the compose!868").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText869() {
        renderComponent(("Hello world from the compose!869").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText870() {
        renderComponent(("Hello world from the compose!870").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText871() {
        renderComponent(("Hello world from the compose!871").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText872() {
        renderComponent(("Hello world from the compose!872").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText873() {
        renderComponent(("Hello world from the compose!873").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText874() {
        renderComponent(("Hello world from the compose!874").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText875() {
        renderComponent(("Hello world from the compose!875").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText876() {
        renderComponent(("Hello world from the compose!876").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText877() {
        renderComponent(("Hello world from the compose!877").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText878() {
        renderComponent(("Hello world from the compose!878").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText879() {
        renderComponent(("Hello world from the compose!879").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText880() {
        renderComponent(("Hello world from the compose!880").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText881() {
        renderComponent(("Hello world from the compose!881").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText882() {
        renderComponent(("Hello world from the compose!882").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText883() {
        renderComponent(("Hello world from the compose!883").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText884() {
        renderComponent(("Hello world from the compose!884").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText885() {
        renderComponent(("Hello world from the compose!885").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText886() {
        renderComponent(("Hello world from the compose!886").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText887() {
        renderComponent(("Hello world from the compose!887").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText888() {
        renderComponent(("Hello world from the compose!888").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText889() {
        renderComponent(("Hello world from the compose!889").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText890() {
        renderComponent(("Hello world from the compose!890").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText891() {
        renderComponent(("Hello world from the compose!891").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText892() {
        renderComponent(("Hello world from the compose!892").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText893() {
        renderComponent(("Hello world from the compose!893").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText894() {
        renderComponent(("Hello world from the compose!894").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText895() {
        renderComponent(("Hello world from the compose!895").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText896() {
        renderComponent(("Hello world from the compose!896").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText897() {
        renderComponent(("Hello world from the compose!897").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText898() {
        renderComponent(("Hello world from the compose!898").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText899() {
        renderComponent(("Hello world from the compose!899").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText900() {
        renderComponent(("Hello world from the compose!900").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText901() {
        renderComponent(("Hello world from the compose!901").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText902() {
        renderComponent(("Hello world from the compose!902").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText903() {
        renderComponent(("Hello world from the compose!903").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText904() {
        renderComponent(("Hello world from the compose!904").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText905() {
        renderComponent(("Hello world from the compose!905").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText906() {
        renderComponent(("Hello world from the compose!906").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText907() {
        renderComponent(("Hello world from the compose!907").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText908() {
        renderComponent(("Hello world from the compose!908").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText909() {
        renderComponent(("Hello world from the compose!909").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText910() {
        renderComponent(("Hello world from the compose!910").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText911() {
        renderComponent(("Hello world from the compose!911").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText912() {
        renderComponent(("Hello world from the compose!912").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText913() {
        renderComponent(("Hello world from the compose!913").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText914() {
        renderComponent(("Hello world from the compose!914").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText915() {
        renderComponent(("Hello world from the compose!915").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText916() {
        renderComponent(("Hello world from the compose!916").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText917() {
        renderComponent(("Hello world from the compose!917").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText918() {
        renderComponent(("Hello world from the compose!918").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText919() {
        renderComponent(("Hello world from the compose!919").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText920() {
        renderComponent(("Hello world from the compose!920").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText921() {
        renderComponent(("Hello world from the compose!921").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText922() {
        renderComponent(("Hello world from the compose!922").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText923() {
        renderComponent(("Hello world from the compose!923").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText924() {
        renderComponent(("Hello world from the compose!924").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText925() {
        renderComponent(("Hello world from the compose!925").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText926() {
        renderComponent(("Hello world from the compose!926").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText927() {
        renderComponent(("Hello world from the compose!927").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText928() {
        renderComponent(("Hello world from the compose!928").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText929() {
        renderComponent(("Hello world from the compose!929").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText930() {
        renderComponent(("Hello world from the compose!930").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText931() {
        renderComponent(("Hello world from the compose!931").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText932() {
        renderComponent(("Hello world from the compose!932").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText933() {
        renderComponent(("Hello world from the compose!933").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText934() {
        renderComponent(("Hello world from the compose!934").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText935() {
        renderComponent(("Hello world from the compose!935").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText936() {
        renderComponent(("Hello world from the compose!936").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText937() {
        renderComponent(("Hello world from the compose!937").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText938() {
        renderComponent(("Hello world from the compose!938").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText939() {
        renderComponent(("Hello world from the compose!939").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText940() {
        renderComponent(("Hello world from the compose!940").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText941() {
        renderComponent(("Hello world from the compose!941").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText942() {
        renderComponent(("Hello world from the compose!942").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText943() {
        renderComponent(("Hello world from the compose!943").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText944() {
        renderComponent(("Hello world from the compose!944").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText945() {
        renderComponent(("Hello world from the compose!945").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText946() {
        renderComponent(("Hello world from the compose!946").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText947() {
        renderComponent(("Hello world from the compose!947").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText948() {
        renderComponent(("Hello world from the compose!948").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText949() {
        renderComponent(("Hello world from the compose!949").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText950() {
        renderComponent(("Hello world from the compose!950").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText951() {
        renderComponent(("Hello world from the compose!951").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText952() {
        renderComponent(("Hello world from the compose!952").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText953() {
        renderComponent(("Hello world from the compose!953").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText954() {
        renderComponent(("Hello world from the compose!954").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText955() {
        renderComponent(("Hello world from the compose!955").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText956() {
        renderComponent(("Hello world from the compose!956").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText957() {
        renderComponent(("Hello world from the compose!957").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText958() {
        renderComponent(("Hello world from the compose!958").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText959() {
        renderComponent(("Hello world from the compose!959").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText960() {
        renderComponent(("Hello world from the compose!960").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText961() {
        renderComponent(("Hello world from the compose!961").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText962() {
        renderComponent(("Hello world from the compose!962").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText963() {
        renderComponent(("Hello world from the compose!963").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText964() {
        renderComponent(("Hello world from the compose!964").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText965() {
        renderComponent(("Hello world from the compose!965").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText966() {
        renderComponent(("Hello world from the compose!966").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText967() {
        renderComponent(("Hello world from the compose!967").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText968() {
        renderComponent(("Hello world from the compose!968").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText969() {
        renderComponent(("Hello world from the compose!969").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText970() {
        renderComponent(("Hello world from the compose!970").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText971() {
        renderComponent(("Hello world from the compose!971").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText972() {
        renderComponent(("Hello world from the compose!972").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText973() {
        renderComponent(("Hello world from the compose!973").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText974() {
        renderComponent(("Hello world from the compose!974").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText975() {
        renderComponent(("Hello world from the compose!975").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText976() {
        renderComponent(("Hello world from the compose!976").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText977() {
        renderComponent(("Hello world from the compose!977").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText978() {
        renderComponent(("Hello world from the compose!978").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText979() {
        renderComponent(("Hello world from the compose!979").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText980() {
        renderComponent(("Hello world from the compose!980").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText981() {
        renderComponent(("Hello world from the compose!981").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText982() {
        renderComponent(("Hello world from the compose!982").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText983() {
        renderComponent(("Hello world from the compose!983").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText984() {
        renderComponent(("Hello world from the compose!984").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText985() {
        renderComponent(("Hello world from the compose!985").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText986() {
        renderComponent(("Hello world from the compose!986").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText987() {
        renderComponent(("Hello world from the compose!987").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText988() {
        renderComponent(("Hello world from the compose!988").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText989() {
        renderComponent(("Hello world from the compose!989").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText990() {
        renderComponent(("Hello world from the compose!990").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText991() {
        renderComponent(("Hello world from the compose!991").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText992() {
        renderComponent(("Hello world from the compose!992").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText993() {
        renderComponent(("Hello world from the compose!993").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText994() {
        renderComponent(("Hello world from the compose!994").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText995() {
        renderComponent(("Hello world from the compose!995").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText996() {
        renderComponent(("Hello world from the compose!996").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText997() {
        renderComponent(("Hello world from the compose!997").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText998() {
        renderComponent(("Hello world from the compose!998").repeat(20))
        compareScreenshot(composeRule)
    }
    @Test
    fun rendersAGreetingWithALongText999() {
        renderComponent(("Hello world from the compose!999").repeat(20))
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

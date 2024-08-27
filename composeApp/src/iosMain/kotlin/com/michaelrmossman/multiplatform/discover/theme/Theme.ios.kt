package com.michaelrmossman.multiplatform.discover.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle
import io.github.alexzhirkevich.cupertino.adaptive.Theme

actual fun determineTheme(): Theme = Theme.Cupertino

@Composable
internal actual fun SystemAppearance(isDark: Boolean) {

    LaunchedEffect(isDark) {
        UIApplication.sharedApplication.setStatusBarStyle(
            if (isDark) UIStatusBarStyleDarkContent else UIStatusBarStyleLightContent
        )
    }
}
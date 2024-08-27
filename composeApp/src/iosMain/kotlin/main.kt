import androidx.compose.ui.window.ComposeUIViewController
import com.michaelrmossman.multiplatform.discover.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

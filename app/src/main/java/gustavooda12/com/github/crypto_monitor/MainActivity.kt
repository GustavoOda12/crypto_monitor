package gustavooda12.com.github.crypto_monitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import gustavooda12.com.github.crypto_monitor.ui.theme.Crypto_monitorTheme
import gustavooda12.com.github.crypto_monitor.ui.theme.screens.CryptoMonitorScreen
import gustavooda12.com.github.crypto_monitor.viewmodel.CryptoViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Crypto_monitorTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CryptoMonitorScreen(viewModel = viewModel)
                }
            }
        }
    }
}
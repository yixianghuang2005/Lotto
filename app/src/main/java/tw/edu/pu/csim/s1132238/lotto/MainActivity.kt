package tw.edu.pu.csim.s1132238.lotto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.s1132238.lotto.ui.theme.LottoTheme
import androidx.compose.runtime.getValue // 引入 getValue
import androidx.compose.runtime.mutableStateOf // 引入 mutableStateOf
import androidx.compose.runtime.remember // 引入 remember
import androidx.compose.runtime.setValue // 引入 setValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LottoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Play(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Play( modifier: Modifier = Modifier) {
    //var lucky = (1..100).random()
    var lucky by remember { mutableStateOf((1..100).random()) }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center, // 垂直置中子項
        horizontalAlignment = Alignment.CenterHorizontally // 水平置中子項
    ){
                Text (
                text = "樂透數字(1-100)為$lucky",

        )
        Button(
            onClick = { lucky = (1..100).random() }
        ) {
            Text("重新產生樂透碼")
        }

    }



}


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.indigo.R
import com.example.parimatchaso.navigation.Screens


@Preview
@Composable
fun FakeScreen(navController: NavController) {
    val firstTeamName = remember {
        mutableStateOf("")
    }
    val secondTeamName = remember {
        mutableStateOf("")
    }
    val hour = remember{
        mutableStateOf("")
    }
    val minute = remember {
        mutableStateOf("")
    }
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.bgsec),
            contentDescription = "",
            contentScale = ContentScale.Crop
                )
        Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "First team name",
                color = Color.White,
                fontSize = 15.sp
                )
            TextField(value = firstTeamName.value, onValueChange ={
                firstTeamName.value=it
            }, singleLine = true,
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Black.copy(alpha = 0.4f))
            )
            Spacer(modifier = Modifier.height(80.dp))
            Text(text = "Second team name",
                color = Color.White,
                fontSize = 15.sp
            )
            TextField(value = secondTeamName.value, onValueChange ={
                firstTeamName.value=it
            }, singleLine = true,
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Black.copy(alpha = 0.4f))

            )
            Spacer(modifier = Modifier.height(80.dp))
            Text(text = "Time",
                color = Color.White,
                fontSize = 15.sp
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                TextField(value = hour.value, onValueChange ={
                    firstTeamName.value=it
                }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true,
                    modifier = Modifier.width(50.dp),
                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Black.copy(alpha = 0.4f))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = ":",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                    )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(value = minute.value, onValueChange ={
                    firstTeamName.value=it
                }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true,
                    modifier = Modifier.width(50.dp),
                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Black.copy(alpha = 0.4f))
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                navController.navigate(Screens.BannerScreen.name)
            }) {
                Text(text = "Create")
            }
        }
    }
}

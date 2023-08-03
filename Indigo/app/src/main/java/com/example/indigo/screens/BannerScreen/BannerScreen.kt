package com.example.indigo.screens.BannerScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.indigo.R
import com.example.parimatchaso.theme.VS

@Preview
@Composable
fun BannerScreen() {
    val screenHeight= LocalConfiguration.current.screenHeightDp
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.banner), contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height((screenHeight/2).dp))
            GameCard(teamInfo = TeamInfo("Tamerlan","Arsen",
                "20","30"
            ))
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "20:00",
                color = Color.Yellow,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
                )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Surface(modifier = Modifier
            .width(80.dp)
            .height(40.dp),
            shape = RoundedCornerShape(20.dp)
        ) {

        }
    }
}


@Composable
fun GameCard(teamInfo: TeamInfo) {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
        ) {
        Surface(modifier = Modifier
            .width(140.dp)
            .height(40.dp),
            shape = RoundedCornerShape(
                topStart = 10.dp,
                bottomStart = 10.dp
                )
            ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = teamInfo.firstTeamName)
            }
        }
        Surface(shape = CircleShape,
            modifier = Modifier.size(40.dp),
            color = VS
            ) {
            Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                Text(text = "VS",
                    color = Color.Yellow,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                    )
            }
        }
        Surface(modifier = Modifier
            .width(140.dp)
            .height(40.dp),
            shape = RoundedCornerShape(
                topEnd = 10.dp,
                bottomEnd = 10.dp
            )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = teamInfo.secondTeamName)
            }
        }

    }
}

data class TeamInfo(
    val firstTeamName:String="",
    val secondTeamName:String="",
    val hour:String="",
    val minute:String=""
)
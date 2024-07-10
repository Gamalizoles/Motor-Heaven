package net.ezra.ui.contact


import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContactScreen(navController: NavHostController) {

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { androidx.compose.material.Text(text = "CONTACTS",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                ) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUTE_HOME) }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xffdbbfd2),
                    titleContentColor = Color(0xffdbbfd2),
                )
            )
        }
    ){

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffdbbfd2))
        ) {
            item{
                Spacer(modifier = Modifier.height(10.dp))



                Text(text = "Postal Address",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)

                )

                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text(text = "P.O BOX 7383-00200, Nairobi, Kenya",
                    modifier = Modifier.padding(10.dp)

                )

                Spacer(modifier = Modifier
                    .height(30.dp)
                )
                Text(text = "Phone Numbers",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text(text = "Mechanics and repair ~ +254722764257",
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254722764257")

                            callLauncher.launch(intent)
                        }
                )

                Spacer(modifier = Modifier
                    .height(5.dp)
                )






                Text(
                    text =  "Servicing and maintenance ~ +254722607157",
//                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254722607157")

                            callLauncher.launch(intent)
                        }
                )
                Spacer(modifier = Modifier
                    .height(5.dp)
                )

                Text(text = "Car rentals ~ +254795007371",
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254795007371")

                            callLauncher.launch(intent)
                        }
                    )





                Spacer(modifier = Modifier
                    .height(5.dp)
                )
                Text(text = "Selling a vehicle ~ +254722473418",
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254722473418")

                            callLauncher.launch(intent)
                        }
                )
                Spacer(modifier = Modifier
                    .height(5.dp)
                )
                Text(text = "Buying a vehicle ~ +254757367125",
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254757367125")

                            callLauncher.launch(intent)
                        }

                )
                Spacer(modifier = Modifier
                    .height(5.dp)
                )
                Text(text = "Head Offices ~ +254748009991",
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254748009991")

                            callLauncher.launch(intent)
                        }
                )

                Spacer(modifier = Modifier
                    .height(30.dp)
                )

                Text(text = "Email address",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text(text = "customercare@motorheaven.org",
                    modifier = Modifier.padding(10.dp)
                )

                Spacer(modifier = Modifier
                    .height(30.dp)
                )

                Text(text = "Social media",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )

                Text(text = "Instagram = @motorheaven",
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(5.dp)
                )
                Text(text = "Twitter = @motorheaven",
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(5.dp)
                )
                Text(text = "Facebook = @motorheaven",
                    modifier = Modifier.padding(10.dp)
                )

                Spacer(modifier = Modifier
                    .height(30.dp)
                )


                Text(text = "Operational Hours",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text(text = "Monday to Friday (9.00 AM - 5.00 PM )",
                    modifier = Modifier.padding(10.dp)
                )

                Spacer(modifier = Modifier
                    .height(100.dp)
                )
            }


        }





        












    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}


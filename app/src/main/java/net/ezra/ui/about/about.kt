package net.ezra.ui.about

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.graphics.ColorSpace.Model
import android.net.Uri
import android.net.Uri.*
import android.widget.Space
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.services.ServicesScreen
import androidx.compose.ui.tooling.preview.Preview
import net.ezra.navigation.ROUTE_INSERT_PRODUCT
import net.ezra.ui.contact.ContactScreen


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { androidx.compose.material.Text(text = "DETAILS",
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
                .fillMaxWidth()
                .fillMaxHeight()


                .background(Color(0xffdbbfd2))
        ) {
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bmwe30),
                        contentDescription = "BMW",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)

                    )
                    Text(text = "~BMW E30~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )


                    Text(text = "Type : Used car",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Make : BMW",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Model : 1990 model",
                        modifier = Modifier.padding(10.dp)
                        )



                    Text(text = "Transmission : Manual",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 2 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Horsepower : 167",
                        modifier = Modifier.padding(10.dp)
                        )



                    Text(text = "Ksh 2.5 M",
                        modifier = Modifier.padding(10.dp)
                        )


                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )
                    }



                }


                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.mercedesg63) ,
                        contentDescription = "G Wagon",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
                    )
                    Text(text = "~Mercedes Benz G63~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )


                    Text(text = "Type : Used car",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Make : Mercedes Benz",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Model : 2023 Model",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Transmission : Automatic",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 5 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Engine Capacity : 3962 cc",
                        modifier = Modifier.padding(10.dp)
                    )




                    Text(text = "Ksh 36 M",
                        modifier = Modifier.padding(10.dp)
                        )

                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier

                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )

                    }




                }





                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.rollsphantom),
                        contentDescription ="Phantom",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)

                    )
                    Text(text = "~Rolls Royce Phantom~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )

                    Text(text = "Type : Unused",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Model : 2024 model",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Transmission : Automatic",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 5 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Engine capacity : 6749 cc",
                        modifier = Modifier.padding(10.dp)
                        )




                    Text(text = "Ksh 46 M",
                        modifier = Modifier.padding(10.dp)
                        )



                    Button(onClick = { /*TODO*/  },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )

                    }



                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.mitsubishievo),
                        contentDescription = "Mitsubishi",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
                    )
                    Text(text = "~Mitsubishi Evo series~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )



                    Text(text = "Type : Used car ",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Model : 1999 model ",
                            modifier = Modifier.padding(10.dp)
                    )


                    Text(text = "Transmission : Manual",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 4 seats",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Engine capacity : 1450 cc",
                        modifier = Modifier.padding(10.dp)
                        )






                    Text(text = "Ksh 2.4 M",
                        modifier = Modifier.padding(10.dp)
                        )

                    Button(onClick = { /*TODO*/  },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )
                    }




                }



                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.bmwx3) ,
                        contentDescription = "BMW",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
                    )
                    Text(text = "~BMW X3~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )



                    Text(text = "Type : Used car ",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Model : 2020 model",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Transmission : Automatic",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 5 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Engine capacity : 1997 cc",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Ksh 29.5 M",
                        modifier = Modifier.padding(10.dp)
                        )



                    Button(onClick = {/*TODO*/ },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )

                    }




                }



                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.audiq5),
                        contentDescription ="Audi",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)

                    )
                    Text(text = "~Audi Q5~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,)



                    Text(text = "Type : Used",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Model : 2021 model",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Transmission : Automatic",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 5 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Engine capacity : 1985 cc",
                        modifier = Modifier.padding(10.dp)
                        )



                    Text(text = "Ksh 8.3 M",
                        modifier = Modifier.padding(10.dp)
                        )



                    Button(onClick = {/*TODO*/  },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )
                    }


                }

                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.audia5),
                        contentDescription = "Audi",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
                    )
                    Text(text = "~Audi A5~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )



                    Text(text = "Type : Used car",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Model : 2018 model",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Transmission : Automatic",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 4 seats",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Engine capacity : 1984 cc",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Ksh 7.3 M",
                        modifier = Modifier.padding(10.dp)
                        )

                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )
                    }

                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.subaruwseries) ,
                        contentDescription = "Subaru",
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
                    )
                    Text(text = "~Subaru WRX~",
                        modifier = Modifier.padding(10.dp),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        )



                    Text(text = "Type : Used car",
                        modifier = Modifier.padding(10.dp)
                        )


                    Text(text = "Model : 2014 model",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Transmission : Manual",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Seat capacity : 4 seats",
                        modifier = Modifier.padding(10.dp)
                        )

                    Text(text = "Engine capacity : 2467 cc",
                        modifier = Modifier.padding(10.dp)
                        )



                    Text(text = "Ksh 3M",
                        modifier = Modifier.padding(10.dp)
                        )

                    Button(onClick = {/*TODO*/  },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Call",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )
                    }




                }








            }


        }
    }




    }



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}















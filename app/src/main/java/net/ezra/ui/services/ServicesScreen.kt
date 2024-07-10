package net.ezra.ui.services

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
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
import androidx.compose.material3.ButtonColors
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServicesScreen(navController: NavHostController){
    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { androidx.compose.material.Text(text = "SERVICES",
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

        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xffdbbfd2))

        ){

            item {




                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    shape = RoundedCornerShape(10.dp)

                ){
                    Image(
                        painter = painterResource(id = R.drawable.sales) ,
                        contentDescription = "sales",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )
                   Text(
                       text = "~Buying and selling a vehicle~",
                       modifier = Modifier.padding(20.dp)

                   )

                    Button(onClick = { /*TODO*/},
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Contact ~ Buying vehicle",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254757367125")

                                    callLauncher.launch(intent)
                                }

                        )

                    }

                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                        ) {
                        Text(text = "Contact ~ Selling vehicle",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254722473418")

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
                        painter = painterResource(id = R.drawable.mechanic),
                        contentDescription ="Mechanic",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )

                    Text(text = "~Mechanics and repair~",
                        modifier = Modifier.padding(20.dp)
                    )

                    Button(onClick = { /*TODO*/},
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Contact",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254722764257")

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
                    Image(
                        painter = painterResource(id = R.drawable.service),
                        contentDescription ="Service",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )

                    Text(text = "~Servicing and maintenance~",
                        modifier = Modifier.padding(20.dp)

                    )


                    Button(onClick = {/*TODO*/},
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(
                            text =  "Contact",
//                    fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254722607157")

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
                        painter = painterResource(id = R.drawable.bikefixing),
                        contentDescription = "Bikes",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )

                    Text(text = "~Motorbike Fixing~",
                        modifier = Modifier.padding(20.dp)
                    )

                    Button(onClick = {/*TODO*/},
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(
                            text =  "Contact",
//                    fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254722764257")

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
                    Image(
                        painter = painterResource(id = R.drawable.engine) ,
                        contentDescription ="Engines",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )

                    Text(text = "~Engine fixing~",
                        modifier = Modifier.padding(20.dp)

                    )


                    Button(onClick = {/*TODO*/},
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                    ) {
                        Text(text = "Contact",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254722764257")

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
                        painter = painterResource(id = R.drawable.rentals),
                        contentDescription ="Rentals",
                        modifier = Modifier
                            .width(250.dp)
                            .height(300.dp)
                    )
                    Text(text = "~Car rentals~",
                        modifier = Modifier.padding(20.dp)
                        )

                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                        ) {
                        Text(text = "Contact",
                            modifier = Modifier
                                .clickable {

                                    val intent = Intent(Intent.ACTION_DIAL)
                                    intent.data = Uri.parse("tel:+254795007371")

                                    callLauncher.launch(intent)
                                }
                        )

                    }
                }


                Spacer(modifier = Modifier
                    .height(80.dp)
                )




            }








        }

    }


}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ServicesScreen(rememberNavController())
}
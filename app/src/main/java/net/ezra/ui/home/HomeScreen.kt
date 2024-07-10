package net.ezra.ui.home

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.DrawerValue
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import com.google.android.material.bottomappbar.BottomAppBar
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_INSERT_PRODUCT
import net.ezra.navigation.ROUTE_SERVICES

import net.ezra.navigation.ROUTE_VIEW_PRODUCTS



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    androidx.compose.material3.Scaffold(
        topBar = {
            TopAppBar(

                modifier = Modifier,


                title = {
                    Text(text = "MOTOR HEAVEN")
                },
                navigationIcon = {

                   IconButton(onClick = { navController.navigate(ROUTE_INSERT_PRODUCT)}) {
                       Icon(Icons.Filled.Search, "search")

                   }
                },




                )
        },

        content = {
            LazyColumn(
                modifier = Modifier

                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight()

                    .padding(10.dp)
                    .padding(top = 10.dp)
                    .background(Color(0xffdbbfd2))

            ) {
                item{
                    Text(
                        text = "MOTOR HEAVEN",
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,


                        )
                    Spacer(
                        modifier = Modifier
                            .height(20.dp)
                    )



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


                        Text(text = "Manual stickshift / 1990 model / 467876 KM ",
                            modifier = Modifier.padding(10.dp)
                            )

                       
                        Text(text = "Ksh 2.5 M",
                            modifier = Modifier.padding(10.dp)
                            )


                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details",)
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


                        Text(text = "Automatic gearshift / 2023 model / 8008 KM",
                            modifier = Modifier.padding(10.dp)
                            )



                        Text(text = "Ksh 36 M",
                            modifier = Modifier.padding(10.dp)
                            )

                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details",

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

                        Text(text = "Automatic gearshift / 2024 model / 0 KM",
                            modifier = Modifier.padding(10.dp)
                            )




                        Text(text = "KSH 46 M",
                                modifier = Modifier.padding(10.dp)
                        )


                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details",

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



                        Text(text = "Manual gearshift / Evolution V 1999/ 257890 KM  ",
                            modifier = Modifier.padding(10.dp)
                            )



                        
                        Text(text = "Ksh 2.4 M",
                            modifier = Modifier.padding(10.dp)
                            )

                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details",)
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


                        Text(text = "Automatic gearshift / 2020 X3 / 24562 KM ",
                            modifier = Modifier.padding(10.dp)
                            )


                        Text(text = "Ksh 29.5 M",
                            modifier = Modifier.padding(10.dp)
                            )


                        Button(onClick = {navController.navigate(ROUTE_ABOUT)},
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details")

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
                            fontWeight = FontWeight.Bold,
                            )


                        Text(text = "Automatic gearshift / 2021 SQ5 / 25679 KM ",
                            modifier = Modifier.padding(10.dp)
                            )




                        Text(text = "Ksh 8.3 M",
                            modifier = Modifier.padding(10.dp)
                            )

                        
                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                        ) {
                            Text(text = "Details")
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



                        Text(text = "Automatic gearshift / 2018 model / 12443 KM",
                            modifier = Modifier.padding(10.dp)
                            )


                        
                        Text(text = "Ksh 7.3 M",
                            modifier = Modifier.padding(10.dp),
                            )

                        Button(onClick = {navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                        ) {
                            Text(text = "Details",)
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

                        
                        Text(text = "Manual transmission / 2014 model / 28909 KM",
                            modifier = Modifier.padding(10.dp),
                            )


                        Text(text = "Ksh 3M",
                            modifier = Modifier.padding(10.dp),
                            )

                        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
                            modifier = Modifier.padding(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xfff57435e))
                            ) {
                            Text(text = "Details")
                        }



                    }
                    
                    

                    Spacer(modifier = Modifier.height(55.dp))


                }


                
                    


                    
            }



        },
        bottomBar = { BottomBar(navController =navController)},



                                                 

    )
}


@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        backgroundColor = Color(0xffd04056),
        elevation = 10.dp

    ) {



        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.AddCircle,"")
        },
            label = { Text(text = "Add Listing") },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_INSERT_PRODUCT)

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ShoppingCart,"")
        },
            label = { Text(text = "View Cars") },
            selected = (selectedIndex.value == 1),
            onClick = {
                navController.navigate(ROUTE_VIEW_PRODUCTS)

            })


        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Settings,"")
        },
            label = { Text(text = "Services") },
            selected = (selectedIndex.value == 2),
            onClick = {
                navController.navigate(ROUTE_SERVICES)

            })

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Call,
                "",


            )
        },
            label = { Text(text = "Contacts")},
            selected = (selectedIndex.value == 0),
            onClick = {
                navController.navigate(ROUTE_CONTACT)

            })


    }
}








@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}


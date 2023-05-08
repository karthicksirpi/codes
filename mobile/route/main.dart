import 'package:flutter/material.dart';
import 'package:keyboard/route/route.dart' as route;

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Route",
      onGenerateRoute: route.controller,
      initialRoute: route.loginPage,
    );
  }
}

// class Home extends StatefulWidget {
//   @override
//   _HomeState createState() => _HomeState();
// }
//
// class _HomeState extends State<Home> {
//   TextEditingController myinput = TextEditingController();
//   @override
//   void initState() {
//     myinput.text = ""; //innitail value of text field
//     super.initState();
//   }
//
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//         appBar: AppBar(
//           title: Text("Keyboard Type on TextField"),
//           backgroundColor: Colors.deepOrangeAccent,
//         ),
//         body: Container(
//           padding: EdgeInsets.all(20),
//           child: Center(
//             child: TextField(
//               controller: myinput,
//               keyboardType: TextInputType.number,
//             ),
//           ),
//         ));
//   }
// }

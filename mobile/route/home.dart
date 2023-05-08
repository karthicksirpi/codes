import 'package:flutter/material.dart';
import 'package:keyboard/route/route.dart' as route;

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Home Page"),
      ),
      body: Center(
        child: ElevatedButton(
          child: Text(" Go to Setting page"),
          onPressed: () => Navigator.pushNamed(context, route.settingPage),
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:keyboard/route/route.dart' as route;

class SettingPage extends StatelessWidget {
  const SettingPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Setting Page"),
      ),
      body: Center(
        child: ElevatedButton(
          child: Text(" Go to home page"),
          onPressed: () => Navigator.pushNamed(context, route.homePage),
        ),
      ),
    );
  }
}

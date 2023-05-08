import 'package:flutter/material.dart';
import 'package:keyboard/route/route.dart' as route;

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Login Page"),
      ),
      body: Center(
        child: ElevatedButton(
          child: Text("Go to home Pag "),
          onPressed: () => Navigator.pushNamed(context, route.homePage),
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';

import 'package:keyboard/view/home.dart';
import 'package:keyboard/view/login.dart';
import 'package:keyboard/view/setting.dart';

const String loginPage = 'login';
const String homePage = 'home';
const String settingPage = 'setting';

Route<dynamic> controller(RouteSettings settings) {
  switch (settings.name) {
    case loginPage:
      return MaterialPageRoute(builder: (contex) => LoginPage());

    case homePage:
      return MaterialPageRoute(builder: (context) => HomePage());

    case settingPage:
      return MaterialPageRoute(builder: (contex) => SettingPage());
    default:
      throw ('This route is not exists');
  }
}

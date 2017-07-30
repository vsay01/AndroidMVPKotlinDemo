Kotlin Android MVP Demo
===================================

This demo aims shows practical way of clean architecture, MVP in android with Kotlin.

Here are the libraries used in this demo application:

- Kotlin
- Retrofit
- Retrofit Coverter Gson
- Glide
- Dagger2

Introduction
------------

Steps for trying out this sample:

* Replace the API Key in the gradle.properties with your pixabay API Key

Visit https://pixabay.com/ to Register for an account and go to [https://pixabay.com/api/docs/] to get your API Key

![alt tag](https://github.com/vsay01/VideoApp/blob/master/images/pixabay_api.png?raw=true)

Go to the project and change the <API_KEY> in the gradle.properties

![alt tag](https://github.com/vsay01/VideoApp/blob/master/images/pixabay_api_key.png?raw=true)

Note: If you have invalid pixabay API Key, you won't see any video in the list.

<img src="https://github.com/vsay01/VideoApp/blob/master/images/empty_result.png" width="350">

* Compile and install the mobile app onto your mobile device or emulator.

This sample aims to demonstrate a number of different Android APIs and Kotlin.

The sample also focuses on providing a simple, yet clean design and UI for apps with an extra level of visual polish compared to a
traditional code sample.

Some of the UI widgets and design patterns used in the mobile app include:
* Use of Material theme including definition of primary and accent colors
* [AppCompat][1] usage for Material theme backward compatibility
* Window content and activity transitions based on the
[Material guidelines][2]
* Use of the [RecyclerView][3] widget
* [CoordinatorLayout][4] from the [Design Support library][5]
* Material animations such as activity and Shared Element Transition for the RecyclerView

[1]: https://developer.android.com/tools/support-library/features.html#v7-appcompat
[2]: http://www.google.com/design/spec/animation/meaningful-transitions.html
[3]: https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html
[4]: https://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html
[5]: http://android-developers.blogspot.com/2015/05/android-design-support-library.html

Pre-requisites
--------------

- Android SDK 25
- Android Build Tools v25.0.2
- Android Support Repository
- Kotlin

Demo
-------------

![alt tag](https://github.com/vsay01/VideoApp/blob/master/images/app_demo.gif?raw=true)

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Support
-------

If you've found an error in this sample, please file an issue to
https://github.com/vsay01/VideoApp
Patches are encouraged, and may be submitted by forking this project and
submitting a pull request through GitHub. Please see [CONTRIBUTING.md][7] for more details.

[7]: https://github.com/vsay01/VideoApp/blob/master/CONTRIBUTING.md

License
-------

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Copyright 2017 Vortana Say

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

# vHackOSAPI-Java (Android Edition)

This is a version of the original vHackOSAPI-Java project, ported to Android.

This is the version of the API that will be used in the Android Application "WhiteIron"

# How to use?

This API is not ment to be compiled and imported as final jar.

To use this API copy the `net` package structure into your main/java section of your project: `<projectname>/app/src/main/java` and it should be here after copieing: `<projectname>/app/src/main/java/net`

### Gradle Build

Merge the following to your modules gradle.build file: `<projectname>/app/gradle.build`

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    annotationProcessor 'org.projectlombok:lombok:1.16.20'
    implementation 'org.projectlombok:lombok:1.16.20'
    implementation 'com.squareup.okhttp3:okhttp:3.4.1'
}
```

# Having trubble?

If you need help, you can create issues, and either I (AtjonTV) or the original developer [@checkium](https://github.com/checkium) will help on issues.

# License (MIT)

Copyright 2018 [Checkium](https://github.com/checkium) ([OlympicCode](https://olympiccode.net/)), [AtjonTV](https://github.com/AtjonTV) ([ATVG-Studios](http://atvg-studios.at)), [TN. Rider](https://github.com/TheNightRider) ([Osmium Software Group](https://osmium.software))

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

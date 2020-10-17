[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)
[ ![Download](https://api.bintray.com/packages/tcqq/android/statelayout/images/download.svg?version=1.0.1) ](https://bintray.com/tcqq/android/statelayout/1.0.1/link)
[![Licence](https://img.shields.io/badge/Licence-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# ExpandView

StateLayout can display different state layouts, Content, Loading, Info.

# Usage
```
<com.tcqq.statelayout.StateLayout
    android:id="@+id/state_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
```

```
state_layout.setState(StateLayout.State.CONTENT)

state_layout.setState(StateLayout.State.LOADING)

state_layout.apply {
    setState(StateLayout.State.INFO)
    infoTitle("Failed to load")
    infoMessage("Network connection failed, please try again later")
    infoImage(R.drawable.ic_baseline_cloud_off_24, R.color.state_layout_error_color)
    infoButtonText("Retry") {
        Toast.makeText(this@MainActivity, "Retry", Toast.LENGTH_SHORT).show()
    }
}
```

# Setup
#### build.gradle
```
repositories {
    jcenter()
}
```
```
dependencies {
    // Using JCenter
    implementation 'com.tcqq.android:statelayout:1.0.1'
}
```

# Screenshots

![Screenshot](/screenshots/one.png)
![Screenshot](/screenshots/two.png)
![Screenshot](/screenshots/three.png)

License
-------

Copyright 2020 Perry Lance

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
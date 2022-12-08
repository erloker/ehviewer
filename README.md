# EhViewer 自用版本 基于Epix版修改而来

主要优化了缩略图列表下的展示内容与效果，感觉会更适合平板等大屏设备

Download/下载地址

https://github.com/erloker/ehviewer/releases


WARN: The apk file signature is NOT same as official version(by seven332). You may have to uninstall official version to install this one. Export your data in official version, uninstall and install this one, import your data in this version. You can use Titanium Backup or other common method to keep data.

注意, 下载的 APK 签名与原版不同, 可能需要先卸载官方版. 可以通过 app 内置的导出功能: 官方版内导出数据, 卸载官方版, 安装 mod 版, mod 版内导入数据. 也可以直接使用钛备份等一般方法保留数据.

More info (Chinese): https://blog.exz.me/post/ehviewer-mod/

Modifications:

* Add more buttons to upper right menu in download scene. Select all, Edit mode, Selec below, Select read(at least read 2 pages), Start All (Reversed), Select done.
* Add a button to each gallery item in list view. Click it to add to download queue immediately without open detail or long press. Only show when the gallery has not been added to download or read yet.
* Show read progress/total page count in download and gallery scene. Use color to indicate read process. Red for not read yet and green for finished reading.
* When viewing pictures, press/hold on slide bar to jump to page immediately without releasing touch.
* Stop all downloads when encountering 509 or IP ban.
* Allow delay between picture downloads to slow down to prevent IP ban.
* Fix torrent download. ref: https://t.me/ehviewer/1090404
* Built-in hosts is discontinued.
* Auto open next gallery after last page. Currently only work in Download.


original README by seven332

----
# DEPRECATED

[![Telegram](https://img.shields.io/badge/chat-Telegram-blue.svg)](https://t.me/ehviewer)

# EhViewer

![Icon](art/launcher_icon-web.png)

这是一个 E-Hentai Android 平台的浏览器。

An E-Hentai Application for Android.


# Screenshot

![screenshot-01](art/screenshot-01.png)


# Build

Windows

    > git clone https://github.com/seven332/EhViewer
    > cd EhViewer
    > gradlew app:assembleDebug

Linux

    $ git clone https://github.com/seven332/EhViewer
    $ cd EhViewer
    $ ./gradlew app:assembleDebug

生成的 apk 文件在 app\build\outputs\apk 目录下

The apk is in app\build\outputs\apk


# Download

[下载](https://github.com/seven332/EhViewer/releases)

[Download](https://github.com/seven332/EhViewer/releases)


# Thanks

本项目受到了诸多开源项目的帮助

Here is the libraries

- [AOSP](http://source.android.com/)
- [android-advancedrecyclerview](https://github.com/h6ah4i/android-advancedrecyclerview)
- [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)
- [apng](http://apng.sourceforge.net/)
- [giflib](http://giflib.sourceforge.net)
- [greenDAO](https://github.com/greenrobot/greenDAO)
- [jsoup](https://github.com/jhy/jsoup)
- [libjpeg-turbo](http://libjpeg-turbo.virtualgl.org/)
- [libpng](http://www.libpng.org/pub/png/libpng.html)
- [okhttp](https://github.com/square/okhttp)
- [roaster](https://github.com/forge/roaster)
- [ShowcaseView](https://github.com/amlcurran/ShowcaseView)
- [Slabo](https://github.com/TiroTypeworks/Slabo)
- [TagSoup](http://home.ccil.org/~cowan/tagsoup/)


# License

    Copyright (C) 2014-2019 Hippo Seven

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

ic_launcher 图标为 Hippo Seven 所有，所有权利保留

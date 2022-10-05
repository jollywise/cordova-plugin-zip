# cordova-plugin-zip

A Cordova plugin to unzip files in Android and iOS.

## Installation

    cordova plugin add cordova-plugin-zip

## Usage

    zip.unzip(<source zip>, <destination dir>, <callback>, [<progressCallback>]);

Both source and destination arguments can be URLs obtained from the HTML File
interface or absolute paths to files on the device.

The callback argument will be executed when the unzip is complete, or when an
error occurs. It will be called with a single argument, which will be 0 on
success, or -1 on failure.

The progressCallback argument is optional and will be executed whenever a new ZipEntry
has been extracted. E.g.:

    var progressCallback = function(progressEvent) {
        $( "#progressbar" ).progressbar("value", Math.round((progressEvent.loaded / progressEvent.total) * 100));
    };

The values `loaded` and `total` are the number of compressed bytes processed and total. Total is the
file size of the zip file.

## Zip traversal error
* [JW Ticket](https://jollywise.atlassian.net/browse/GAMEBOX-101)
* [Google Support](https://support.google.com/faqs/answer/9294009)
* [Goodboy Info cordova-plugin-zip](https://geekrepos.com/GoodBoyDigital/cordova-plugin-zip)
* [Goodboy Repo  cordova-plugin-zip](https://github.com/GoodBoyDigital/cordova-plugin-zip)
* [Issue](https://github.com/MobileChromeApps/cordova-plugin-zip/issues/91)
* [Patch Pull Request](https://github.com/MobileChromeApps/cordova-plugin-zip/pull/92)
* [Forked repo used for patch](https://github.com/bikubi/cordova-plugin-zip)


## Release Notes

### 3.1.0 (Feb 23, 2016)
* Updated SSZipArchive (ios lib) to 1.1

### 3.0.0 (May 1, 2015)
* Updated SSZipArchive (ios lib) to 0.2.1
* Update file plugin dependency to use npm version (cordova-plugin-file)

### 2.1.0 (May 1, 2014)
* Added progress events
* Fix iOS path handling when given file: URLs as src/target

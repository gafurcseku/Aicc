# Android Internet Connectivity Checker (AICC)

AICC is a library for Checking internet connection and open setting Screen for connecting internet via Wifi and Mobile Data.

# How to    [![](https://jitpack.io/v/gafurcseku/internet-connectivity-checker.svg)](https://jitpack.io/#gafurcseku/internet-connectivity-checker)

### Use the ![jitpack.io](https://jitpack.io) to install AICC

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

  Step 2. Add the dependency

  	dependencies {
	        implementation 'com.github.gafurcseku:internet-connectivity-checker:1.0.1'
	}

## Usage

#### Check Internet Connection

```java
if(NetworkUtil.isConnected(this)){
    /// Connection is Available
 }else{
    /// Connection is not Available
 }

```

#### Open Connection Setting

```java
if(NetworkUtil.isConnected(this)){
    /// Connection is Available
 }else{
    /// Connection is not Available
 }

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
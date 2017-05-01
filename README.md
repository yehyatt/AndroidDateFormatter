# AndroidDateFormatter

## Usage: 

## In app Gradle:

    `compile 'com.github.yehyatt:AndroidDateFormatter:v1.14'`
   
## In main Gradle:
   
   `allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
                 }
               }`


## Any where in app :
`String FormattedText = FormatDate.getCustomDate("[date in milliseconds]",FormatDate.ddMMyy());`

## Actual Example:
`String FormattedText = FormatDate.getCustomDate("1493642199438",FormatDate.ddMMyy());`
Result will be 01 05 2017

## Other usage:
`String FormattedText = FormatDate.getCustomDate("1493642199438","dd MM yyyy hh:mm");`

![alt text](https://github.com/yehyatt/AndroidDateFormatter/blob/master/Screen%20Shot%202017-05-01%20at%206.52.39%20PM.png)

#### Image copyright:
https://developer.android.com/reference/java/text/SimpleDateFormat.html
    

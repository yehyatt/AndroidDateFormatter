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

    

# useful-ktx
[![CircleCI](https://circleci.com/gh/tomasznajda/useful-ktx.svg?style=svg)](https://circleci.com/gh/tomasznajda/useful-ktx)\
Useful Kotlin extensions to speed up Android app development

## dependencies
```groovy
dependencies {
    implementation "com.tomasznajda.ktx:android:1.3.0"
    implementation "com.tomasznajda.ktx:kotlin:1.2.0"
    implementation "com.tomasznajda.ktx:rxjava2:1.1.0"
    implementation "com.tomasznajda.ktx:gson:1.0.0"
    implementation "com.tomasznajda.ktx:picasso:1.0.0"

    testImplementation "com.tomasznajda.ktx:junit:1.0.0"
}
```

## [android](https://github.com/tomasznajda/useful-ktx/tree/master/android/src/main/kotlin/com/tomasznajda/ktx/android)
```kotlin
String.copyToClipboard(context: Context, label: String)

ViewGroup.inflate(@LayoutRes layoutId: Int, attachToRoot: Boolean = false)
Context.inflate(@LayoutRes layoutId: Int)
Fragment.inflate(@LayoutRes layoutId: Int)

Date.format(pattern: String, locale: Locale = Locale.getDefault())

logwtf(tag: String, msg: String = "", e: Throwable? = null)
loge(tag: String, msg: String = "", e: Throwable? = null)
logw(tag: String, msg: String = "", e: Throwable? = null)
logi(tag: String, msg: String = "", e: Throwable? = null)
logd(tag: String, msg: String = "", e: Throwable? = null)
logv(tag: String, msg: String = "", e: Throwable? = null)
Any.loge(tag: String, format: (String) -> String = { it })
Any.logw(tag: String, format: (String) -> String = { it })
Any.logi(tag: String, format: (String) -> String = { it })
Any.logd(tag: String, format: (String) -> String = { it })
Any.logv(tag: String, format: (String) -> String = { it })
Any.println(format: (String) -> String = { it })
Throwable.logwtf(tag: String, msg: String = "")
Throwable.loge(tag: String, msg: String = "")
Throwable.logw(tag: String, msg: String = "")
Throwable.logi(tag: String, msg: String = "")
Throwable.logd(tag: String, msg: String = "")
Throwable.logv(tag: String, msg: String = "")

Context.getSystemService<T>(name: String)
Context.clipboardManager: ClipboardManager?
Context.windowManager: WindowManager?
Context.layoutInflater: LayoutInflater?
Context.activityManager: ActivityManager?
Context.powerManager: PowerManager?
Context.alarmManager: AlarmManager?
Context.notificationManager: NotificationManager?
Context.keyguardManager: KeyguardManager?
Context.locationManager: LocationManager?
Context.searchManager: SearchManager?
Context.sensorManager: SensorManager?
Context.storageManager: StorageManager?
Context.vibrator: Vibrator?
Context.connectivityManager: ConnectivityManager?
Context.wifiManager: WifiManager?
Context.audioManager: AudioManager?
Context.mediaRouter: MediaRouter?
Context.telephonyManager: TelephonyManager?
Context.subscriptionManager: SubscriptionManager?
Context.carrierConfigManager: CarrierConfigManager?
Context.inputMethodManager: InputMethodManager?
Context.uiModeManager: UiModeManager?
Context.downloadManager: DownloadManager?
Context.batteryManager: BatteryManager?
Context.jobScheduler: JobScheduler?

Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT)
Context.toast(@StringRes messageId: Int, duration: Int = Toast.LENGTH_SHORT)

View.visible()
View.invisible()
View.gone()
View.isVisible: Boolean
View.isInvisible: Boolean
View.isGone: Boolean

fromAndroid(version: Int, block: () -> Unit)
toAndroid(version: Int, block: () -> Unit)
afterAndroid(version: Int, block: () -> Unit)
beforeAndroid(version: Int, block: () -> Unit)

Context.prefs(name: String? = null)
SharedPreferences.boolean(key: String, defaultValue: Boolean = false)
SharedPreferences.float(key: String, defaultValue: Float = 0f)
SharedPreferences.int(key: String, defaultValue: Int = 0)
SharedPreferences.long(key: String, defaultValue: Long = 0)
SharedPreferences.string(key: String, defaultValue: String = "")
SharedPreferences.stringSet(key: String, defaultValue: Set<String> = emptySet())
```

## [kotlin](https://github.com/tomasznajda/useful-ktx/tree/master/kotlin/src/main/kotlin/com/tomasznajda/ktx/kotlin)
```kotlin
Any?.toUnit()

T?.isNotNull()
T?.isNull()

Any.cast(clazz: Class<T>)
Any.cast(clazz: KClass<T>)
```

## [rxjava2](https://github.com/tomasznajda/useful-ktx/tree/master/rxjava2/src/main/kotlin/com/tomasznajda/ktx/rxjava2)
```kotlin
T?.asFlowable()
T?.asObservable()
T?.asMaybe()
T.asSingle()
R.asFlowableError()
R.asObservableError()
R.asSingleError()
R.asMaybeError()
R.asCompletableError()

combineLatest(source1: Flowable<T1>, source2: Flowable<T2>)
combineLatest(source1: Observable<T1>, source2: Observable<T2>)
combineLatest(source1: Flowable<T1>, source2: Flowable<T2>, source3: Flowable<T3>)
combineLatest(source1: Observable<T1>, source2: Observable<T2>, source3: Observable<T3>)

zip(source1: Flowable<T1>, source2: Flowable<T2>)
zip(source1: Observable<T1>, source2: Observable<T2>)
zip(source1: Single<T1>, source2: Single<T2>)
zip(source1: Maybe<T1>, source2: Maybe<T2>)
zip(source1: Completable, source2: Completable)
zip(source1: Flowable<T1>, source2: Flowable<T2>, source3: Flowable<T3>)
zip(source1: Observable<T1>, source2: Observable<T2>, source3: Observable<T3>)
zip(source1: Single<T1>, source2: Single<T2>, source3: Single<T3>)
zip(source1: Maybe<T1>, source2: Maybe<T2>, source3: Maybe<T3>)
zip(source1: Completable, source2: Completable, source3: Completable)
zipWith(source: Flowable<T2>)
zipWith(source: Observable<T2>)
zipWith(source: Single<T2>)
zipWith(source: Maybe<T2>)

merge(source1: Flowable<T>, source2: Flowable<T>)
merge(source1: Observable<T>, source2: Observable<T>)
merge(source1: Single<T>, source2: Single<T>)
merge(source1: Maybe<T>, source2: Maybe<T>)
merge(source1: Flowable<T>, source2: Flowable<T>, source3: Flowable<T>)
merge(source1: Observable<T>, source2: Observable<T>, source3: Observable<T>)
merge(source1: Single<T>, source2: Single<T>, source3: Single<T>)
merge(source1: Maybe<T>, source2: Maybe<T>, source3: Maybe<T>)

Flowable<T>.retrySubscribe(onNext: (T) -> Unit, onError: (Throwable) -> Unit, onComplete: () -> Unit)
Observable<T>.retrySubscribe(onNext: (T) -> Unit, onError: (Throwable) -> Unit, onComplete: () -> Unit)
Maybe<T>.retrySubscribe(onSuccess: (T) -> Unit, onError: (Throwable) -> Unit, onComplete: () -> Unit)
Single<T>.retrySubscribe(onSuccess: (T) -> Unit, onError: (Throwable) -> Unit)

Flowable<T>.retryWithDelay(maxRetries: Int, delayInMillis: Long)
Observable<T>.retryWithDelay(maxRetries: Int, delayInMillis: Long)
Maybe<T>.retryWithDelay(maxRetries: Int, delayInMillis: Long)
Single<T>.retryWithDelay(maxRetries: Int, delayInMillis: Long)
Completable.retryWithDelay(maxRetries: Int, delayInMillis: Long)

Flowable<T>.waitForCompletion(mapper: (T) -> Completable)
Observable<T>.waitForCompletion(mapper: (T) -> Completable)
Maybe<T>.waitForCompletion(mapper: (T) -> Completable)
Single<T>.waitForCompletion(mapper: (T) -> Completable)
Flowable<T>.switchWaitForCompletion(mapper: (T) -> Completable)
Observable<T>.switchWaitForCompletion(mapper: (T) -> Completable)
Flowable<T>.concatWaitForCompletion(mapper: (T) -> Completable)
Observable<T>.concatWaitForCompletion(mapper: (T) -> Completable)
```

## [gson](https://github.com/tomasznajda/useful-ktx/tree/master/gson/src/main/kotlin/com/tomasznajda/ktx/gson)
```kotlin
Any.toJson()
String.fromJson(clazz: Class<T>)
String.fromJson(clazz: KClass<T>)
```

## [picasso](https://github.com/tomasznajda/useful-ktx/tree/master/picasso/src/main/kotlin/com/tomasznajda/ktx/picasso)
```kotlin
ImageView.loadImage(url: String?, extras: RequestCreator.() -> RequestCreator)
ImageView.loadImage(uri: Uri?, extras: RequestCreator.() -> RequestCreator)
ImageView.loadImage(file: File, extras: RequestCreator.() -> RequestCreator)
ImageView.loadImage(@DrawableRes resourceId: Int, extras: RequestCreator.() -> RequestCreator)
```

## [junit](https://github.com/tomasznajda/useful-ktx/tree/master/junit/src/main/kotlin/com/tomasznajda/ktx/junit)
```kotlin
assertEquals(expected: Any?, actual: Any?)
Any.assertIsInstanceOf(clazz: KClass<T>)
```

## 실행할 것
1. 핸드폰을 켰을 경우에 부트 완료라고 뜬다. <br>
2. 시스템 > 날짜 및 시간에서 네트워크 시간대 사용을 변경시미녀 `표준시간대 변경` 이라는 메시지가 뜨게 한다. <br>
3. 이어폰을 꽂을 경우 헤드셋 플러그라는 메시지가 뜨게 된다. <br>

### 부트
``` java
if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Toast.makeText(context, "ACTION_BOOT_COMPLETED", Toast.LENGTH_SHORT).show();
        } 
```
위의 코드에서 `Intent.ACTION_BOOT_COMPLETED` 를 전달해서 부트 완료 시에 알림이 뜨게 한다. 


### 시간
``` java
else if (intent.getAction().equals(Intent.ACTION_TIMEZONE_CHANGED)) {
            Toast.makeText(context, "ACTION_TIMEZONE_CHANGED", Toast.LENGTH_SHORT).show(); 
        }
```
위의 코드에서 `Intent.ACTION_TIMEZONE_CHANGED` 를 전달해서 네트워크 시간대를 바꾸면 알림이 뜨게 한다.

#### 실행 결과
![image](https://user-images.githubusercontent.com/65533618/152910013-fe693206-cfe4-48a5-a861-fedbaf2706c7.png)


### 이어폰 
![image](https://user-images.githubusercontent.com/65533618/152907836-0f0cf241-c223-4a0b-8749-83076d83fd93.png) <br>
![image](https://user-images.githubusercontent.com/65533618/152907876-c6aeaeba-22ef-48bc-bd59-fcab3caf6b29.png) <br>
이제 이어폰을 꽂으면 알림이 온다. 

``` java
if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            Toast.makeText(context, "ACTION_HEADSET_PLUG: state = " + state,
                    Toast.LENGTH_SHORT).show();
        }
```

헤드셋 연결/해지로 음악 재생을 제어하려면 `Intent.ACTION_HEADSET_PLUG` 을 사용한다. 

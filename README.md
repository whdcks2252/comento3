# comento3

![image](https://github.com/whdcks2252/comento3/assets/66254633/bb2159d2-d65f-4ec1-a830-9ad9d6e24940)

<br/>
초기데이터 셋
<br/>

![image](https://github.com/whdcks2252/comento3/assets/66254633/dad7d9a9-c265-495c-b823-17ad94a125ee)

<br/>

REQUEST_INFO 의 create_date속성을 LocalDateTime으로 변경하였습니다


<br/>
1) 월별 접속자 수
  <br/> SELECT month(create_date), count(create_date) FROM REQUEST_INFO group by month(create_date)
   
   ![image](https://github.com/whdcks2252/comento3/assets/66254633/1916fc54-60e1-42c5-81fe-da9638ab2a31)


<br/>
2) 일자별 접속자 수
 <br/>  SELECT date(create_date),count(create_date) FROM REQUEST_INFO group by date(create_date)
   
   ![image](https://github.com/whdcks2252/comento3/assets/66254633/e9cec213-b645-4a2e-ad63-3011fc8320d8)


<br/>
3) 평균 하루 로그인 수

<br/>   
4**) 휴일을 제외한 로그인 수 ( 해당 문제에서는 휴일을 포함합니다.)**


         *** API 구축시에는 추가 구현 필요 : 쿼리 + @(별도의 db생성 or 공공API 활용) )**


   <br/>
4) 부서별 월별 로그인 수
<br/>SELECT month(a.create_date),b.hr_organ,count(a.create_date)  FROM REQUEST_INFO as A  LEFT JOIN user as B ON A.user_ID= b.user_id  group by month(a.create_date),b.hr_organ

![image](https://github.com/whdcks2252/comento3/assets/66254633/f1d4aa71-4544-4c89-8543-f856bca21e54)

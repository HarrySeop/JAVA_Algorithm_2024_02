오름차순으로 정렬된 정수 배열에서 이진검색(binary search) 방식으로 사용자가 원하는 정수값의 위치를 찾는 프로그램을 작성하세요.

이진 검색은 재귀 알고리즘을 이용하되, 다음과 같이 작성할 것
- 검색 성공시 정수값의 위치(인덱스)를 리턴. 동일한 원소가 여러개인 경우는 신경쓰지 않아도 됨(아무것이나 리턴해도 됨)
- 검색 실패시 -1을 리턴


- 배열은 다음과 같이 초기화 할 것
``` java
int array[] = {20, 40, 60, 80, 100, 110, 120, 130, 150, 190, 200, 300, 400};
```

---

입력: 정수값 

출력: 이진검색결과(인덱스)

---

- 실행 예
``` java
lab0_3:홍길동
200
10
```

- 실행 예
``` java
lab0_3:홍길동
20
0
```

- 실행 예
``` java
lab0_3:홍길동
400
12
```

- 실행 예
``` java
lab0_3:홍길동
111
-1
```

----------------------------------

목적

- 이진 검색과 재귀 알고리즘을 이해한다.


----------------------------------
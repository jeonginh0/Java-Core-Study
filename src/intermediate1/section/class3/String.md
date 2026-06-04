# String (문자열)

## String 클래스와 참조형
String은 클래스이다. 따라서 기본형이 아니라 참조형이다.
참조형은 변수에 계산할 수 있는 값이 들어있는 것이 아니라 `x001`과 같이 계산할 수 없는 참조값이 들어있다. 따라서 원칙적으로 `+`같은 연산을 할 수 없다.

## 기능(메서드)
- length(): 문자열의 길이 반환
- charAt(int index): 특정 인덱스의 문자 반환
- substring(int beginIndex, int endIndex): 문자열의 부분 문자열 반환
- indexOf(String str): 특정 문자열이 시작되는 인덱스 반환
- toLowerCase(), toUpperCase(): 문자열을 소문자 또는 대문자로 변환
- trim(): 문자열 양 끝의 공백 제거
- concat(String str): 문자열을 더한다

### 문자열 정보 조회
- `length()`: 문자열의 길이 반환
- `isEmpty()`: 문자열이 비어 있는지 확인(길이가 0)
- `isBlank()`: 문자열이 비어 있는지 확인(길이가 0이거나 공백(Whitespace)만 있는 경우), 자바 11
- `charAt(int index)`: 지정된 인덱스에 있는 문자 반환

### 문자열 비교
- `equals(Object anObject)`: 두 문자열이 동일한지 비교
- `equalsIgnoreCase(String anotherString)`: 두 문자열을 대소문자 구분 없이 비교
- `compareTo(String anotherString)`: 두 문자열을 사전 순 비교
- `compareToIgnoreCase(String str)`: 두 문자열을 대소문자 구분 없이 사전적으로 비교
- `startsWith(String prefix)`: 문자열이 특정 접두사로 시작하는지 확인
- `endsWith(String suffix)`: 문자열이 특정 접미사로 끝나는지 확인

### 문자열 검색
- `contains(CharSequence s)`: 문자열이 특정 문자열을 포함하고 있는지 확인
- `indexOf(String ch) / indexOf(String ch, int fromIndex)`: 문자열이 처음 등장하는 위치 반환
- `lastIndexOf(String ch)`: 문자열이 마지막으로 등장하는 위치 반환

### 문자열 조작 및 변환
- `substring(int beginIndex) / substring(int beginIndex, int endIndex)`: 문자열의 부분 문자열 반환
- `concat(String str)`: 문자열의 끝에 다른 문자열 붙임
- `replace(CharSequence target, CharSequence replacement)`: 특정 문자열을 새 문자열로 대체
- `replaceAll(String regex, String replacement)`: 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체
- `replaceFirst(String regex, String replacement)`: 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체
- `toLowerCase() / toUpperCase()`: 문자열을 소문자나 대문자로 변환
- `trim()`: 문자열 양쪽 끝의 공백을 제거. 단순 Whitespace만 제거가능
- `strip()`: Whitespace와 유니코드 공백을 포함해서 제거

### 문자열 분할 및 조합
- `split(String regex)`: 문자열을 정규 표현식을 기준으로 분할
- `join(CharSequence delimiter, CharSequence... elements)`: 주어진 구분자로 여러 문자열 결합

### 기타 유틸리티
- `valueOf(Object obj)`: 다양한 타입을 문자열로 변환
- `toCharArray()`: 문자열을 문자 배열로 변환
- `format(String format, Object... args)`: 형식 문자열과 인자를 사용하여 새로운 문자열을 생성
- `matches(String regex)`: 문자열이 주어진 정규 표현식과 일치하는지 확인

## StringBuilder
문자열을 합칠 때 대부분의 경우 최적화가 되므로 + 연산을 사용하면 됨.

StringBuilder를 직접 사용하는 것이 더 좋은 경우는
- 반복문에서 반복해서 문자를 연결할 때
- 조건문을 통해 동적으로 문자열을 조합할 때
- 복잡한 문자열의 특정 부분을 변경해야 할 때
- 매우 긴 대용량 문자열을 다룰 때

### StringBuilder vs StringBuffer
- StringBuilder와 똑같은 기능을 수행하는 StringBuffer
- StringBuffer는 내부에 동기화가 되어 있어서, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느리다.
- StringBuilder는 멀티쓰레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다.
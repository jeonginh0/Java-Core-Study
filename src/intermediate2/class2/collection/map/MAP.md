# Map

`HashMap`, `TreeMap`, `LinkedHashMap` 등 다양한 Map 구현체를 제공.

이들은 `Map`인터페이스의 메서드를 구현하며 각기 다른 특성과 성능 특징을 가지고 있음.

## 메서드
1. `put(K key, V value)` : 지정된 키와 값을 맵에 저장.(같은 키가 있으면 값을 변경)
2. `putAll(Map<? extends K, ? extends V> m)` : 지정된 맵의 모든 매핑을 현재 맵에 복사.
3. `putIfAbsent(K key, V value)` : 지정된 키가 없는 경우에 키와 값을 맵에 저장.
4. `get(Object key)` : 지정된 키에 연결된 값을 반환.
5. `getOrDefault(Object key, V defaultValue)` : 지정된 키에 연결된 값을 반환. 키가 없는 경우 defaultValue로 지정한 값을 대신 반환.
6. `remove(Object key)` : 지정된 키와 그에 연결된 값을 맵에서 제거.
7. `clear()` : 맵에서 모든 키와 값을 제거.
8. `containsKey(Object key)` : 맵이 지정된 키를 포함하고 있는지 여부 반환.
9. `containsValue(Object value)` : 맵이 하나 이상의 키에 지정된 값을 연결하고 있는지 여부 반환.
10. `keySet()` : 맵의 키들을 Set 형태로 반환.
11. `values()` : 맵의 값들을 `Collection`형태로 반환.
12. `entrySet()` : 맵의 키-값 쌍을 Set<Map.Entry<K,V>> 형태로 반환.
13. `size()` : 맵에 있는 키-값 쌍의 개수 반환.
14. `isEmpty()` : 맵이 비어 있는지 여부 반환.

이 중 **`HashMap`**을 가장 많이 사용한다.

## Map vs Set
`Map`의 키는 중복을 허용하지 않고, 순서를 보장하지 않는다. `Map`의 키가 바로 `Set`과 같은 구조이다. 그리고 `Map`은 모든 것이 `Key`중심으로 동작한다.
`Value`는 단순히 `key`옆에 따라 붙은 것 뿐이다. `Key`옆에 `Value`만 하나 추가해주면 `Map`이 되는 것이다. `Map`과 `Set`은 거의 같다. 단지 옆에 `Value`를 가지고 있는가 없는가의 차이가 있을 뿐이다.

위와 같은 이유로 `Set`, `Map`의 구현체는 거의 같다.
- `HashSet` -> `HashMap`
- `LinkedHashSet` -> `LinkedHashMap`
- `TreeSet` -> `TreeMap`
* 실제로 자바 HashSet의 구현은 대부분 HashMap의 구현을 가져다 사용한다.
* Map에서 Value만 비워두면 Set으로 사용할 수 있다.

## Map 구현체의 각각의 특징
1. HashMap:
   - 구조: `HashMap`은 해시를 사용해서 요소를 저장한다. 키(key) 값은 해시 함수를 통해 해시 코드로 변환되고, 이 해시 코드는 데이터를 저장하고 검색하는 데 사용된다.
   - 특징: 삽입, 삭제, 검색 작업은 해시 자료 구조를 사용하므로 일반적으로 상수 시간(O(1))의 복잡도를 가진다.
   - 순서: 순서를 보장하지 않는다.
2. LinkedHashMap:
   - 구조: `LinkedHashMap`은 `HashMap`과 유사하지만, 연결 리스트를 사용하여 삽입 순서 또는 최근 접근 순서에 따라 요소를 유지한다.
   - 특징: 입력 순서에 따라 순회가 가능하다. `HashMap`과 같지만 입력 순서를 링크로 유지해야 하므로 조금 더 무겁다.
   - 성능: `HashMap`과 유사하게 대부분의 작업은 O(1) 시간복잡도를 가진다.
   - 순서: 입력 순서를 보장한다.
3. TreeMap:
   - 구조: `TreeMap`은 레드-블랙 트리를 기반으로 한 구현.
   - 특징: 모든 키는 자연 순서 또는 생성자에 제공된 Comparator에 의해 정렬됨.
   - 성능: `get`, `put`, `remove`와 같은 주요 작업들은 O(log n) 시간복잡도를 가짐.
   - 순서: 키는 정렬된 순서로 저장됨.

## HashMap 작동 원리
- Key를 사용해서 해시 코드를 생성한다.
- Key 뿐만 아니라 값을 추가로 저장해야 하기 때문에 Entry를 사용해서 Key, Value를 하나로 묶어서 저장한다.
- HashSet은 해시 테이블의 주요 원리를 사용하지만, 키-값 저장 방식 대신 키만 저장하는 특수한 형태의 해시 테이블로 이해하면 된다.

Map의 key로 사용되는 객체는 `hashCode()`, `equals()` 구현 필수.
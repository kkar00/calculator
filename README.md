계산기 프로젝트
=========================
## Lv1
- 숫자 (0 포함) 2개, 사칙연산 1개 입력받기
- 받은 값을 이용해서 계산, 오류(0으로 나누기)가 생기면 오류 내용을 정제해서 출력
- 무한으로 반복하지만 "exit" 문자열 입력을 받으면 종료

## Lv2
- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
